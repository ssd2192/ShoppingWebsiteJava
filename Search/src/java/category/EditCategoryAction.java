package category;

import com.opensymphony.xwork2.ActionSupport;


public class EditCategoryAction extends ActionSupport{
    
    String edit_cat;
    String showcat;
    String s="";

    public String getEdit_cat() {
        return edit_cat;
    }

    public void setEdit_cat(String edit_cat) {
        this.edit_cat = edit_cat;
    }

    public String getShowcat() {
        return showcat;
    }

    public void setShowcat(String showcat) {
        this.showcat = showcat;
    }
    
    
    @Override
    public String execute() throws Exception{
        System.out.println("in execute");
         boolean b=EditCategory.edit(edit_cat,showcat);
         System.out.println("after edit");
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
        if(getEdit_cat().equals("")||getEdit_cat()==null){
            addActionError("Field empty");
        }
        
    }
    
}
