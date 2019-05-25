package com;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
    String pas;
    String id;
    String s="";
    
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
    
    
    @Override
    public String execute() throws Exception{
      
        boolean b=UserLogin.login(id, pas);
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
     if(getId().equals("")||getId()==null){
          addActionError("Username empty.");
     }
     else if(getPas().equals("")||getPas()==null){
          addActionError("Password empty.");
     }
     
        
    }
   
    
}
