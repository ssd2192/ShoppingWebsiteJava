package Order;

import com.opensymphony.xwork2.ActionSupport;

public class DebitAction extends ActionSupport{
    String uname,cnumber;
    String s="";

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getCnumber() {
        return cnumber;
    }

    public void setCnumber(String cnumber) {
        this.cnumber = cnumber;
    }
    
    @Override
     public void validate(){
         
      if(getUname().equals("")||getUname()==null){
          addActionError("Username empty.");
      }
      else if(getCnumber().equals("")||getCnumber()==null){
          addActionError("Card Number empty.");
      }
     }
    
     @Override
    public String execute() throws Exception {
        boolean b=Debit.add(uname,cnumber);
        if(b){
            s=SUCCESS;
        }
        else
        { s=ERROR; }
     return s;
     
    }
    
    
}
