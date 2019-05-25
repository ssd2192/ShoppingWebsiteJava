/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package category;

import com.opensymphony.xwork2.ActionSupport;

public class AddCategoryAction extends ActionSupport{
    String category;
    String s="";

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    @Override
    public String execute()throws Exception{
        boolean b=AddCategory.add(category);
        if(b){
            s=SUCCESS;
        }
        else{
            s=ERROR;
        }
    
        return s;
        
    }
    @Override
    public void validate(){
        boolean d=AddCategory.categoryexist(category);
     if(getCategory().equals("") || getCategory()==null){
          addActionError("Field empty.");
     }
     else if(d==true){
         addActionError("Category alredy exist");
     }
    }
    
    
}
