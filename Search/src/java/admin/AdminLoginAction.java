package admin;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;

public class AdminLoginAction extends ActionSupport{
    String pas;
    String id;
    String s="";
  // Map session; // application;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPas() {
        return pas;
    }

    public void setPas(String pas) {
        this.pas = pas;
    }

//    public void setSession(Map session) {
//        this.session = session;
//    }

//    public void setApplication(Map application) {
//        this.application = application;
//    }
    
    
    
    
    @Override
    public String execute() throws Exception{
      
        boolean b=AdminLogin.login(id, pas);
        if(b){
            
             Map session = ActionContext.getContext().getSession();
            session.put("logged-in", "true");
             
             s=SUCCESS;
        }
        else{
            s=ERROR;
        }
    
        return s;
    }
     public String logout() throws Exception {

        Map session = ActionContext.getContext().getSession();
        session.remove("logged-in");
        return SUCCESS;
    }
    
   
    
    @Override
    public void validate(){
     if(getId().equals("")||getId()==null){
          addActionError("Username empty.");
     }
     else if(getPas().equals("")||getPas()==null){
          addActionError("Password empty.");
     }
     
        
    }
   
    
}
