package Order;

import com.opensymphony.xwork2.ActionSupport;


public class CODAction extends ActionSupport{
    String uname;
    String s="";

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }
    
    @Override
     public void validate(){
         
      if(getUname().equals("")||getUname()==null){
          addActionError("Username empty.");
      }
     }
    
    @Override
    public String execute() throws Exception {
        boolean b=COD.add(uname);
        if(b){
            s=SUCCESS;
        }
        else
        { s=ERROR; }
     return s;
     
    }
}
     
