package product;

import com.opensymphony.xwork2.ActionSupport;

public class DeleteProductAction extends ActionSupport  {
    
    String proid;
    String s="";
    
    public String getProid() {
        return proid;
    }

    public void setProid(String proid) {
        this.proid = proid;
    }

    @Override
    public String execute(){
        boolean b=DeleteProduct.delete(proid);
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
         boolean d=AddProduct.productexist(proid);
         if(getProid().equals("") || getProid()==null){
          addActionError("Product ID Empty");
         }
         else if(d==false){
         addActionError("Product Does Not Exist");
         }
     
    }  

    
}
