package Order;

import com.opensymphony.xwork2.ActionSupport;

public class AddOrderStatusAction extends ActionSupport{
    
    String uname;
    String ustatus;
    String s="";

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUstatus() {
        return ustatus;
    }

    public void setUstatus(String ustatus) {
        this.ustatus = ustatus;
    }
    
    @Override
    public void validate(){
         boolean d=AddOrderStatus.OrderExist(uname);
         
     if(getUname().equals("")||getUname()==null){
          addActionError("Username empty.");
     }
     else if(getUstatus().equals("")||getUstatus()==null){
          addActionError("Status empty.");
     }
     else if(d==false){
         addActionError("Invalid Username ID.");
     }
    }
    
    @Override
     public String execute() throws Exception {
        boolean b=AddOrderStatus.add(uname, ustatus);
        if(b){
            s=SUCCESS;
        }
        else
        { s=ERROR; }
     return s;
     
    }
}