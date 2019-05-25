/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import com.opensymphony.xwork2.ActionSupport;

public class UserRegisterAction extends ActionSupport{
    String id;
    String pas;
    String pas1;
    String email;
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

    public String getPas1() {
        return pas1;
    }

    public void setPas1(String pas1) {
        this.pas1 = pas1;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
   
    @Override
    public String execute() throws Exception{
        
        boolean b=UserRegistration.register(id,pas,email);
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
     boolean d=UserRegistration.userexist(id);
     if(getId().equals("")||getId()==null){
          addActionError("Username empty.");
     }
     else if(getPas().equals("")||getPas()==null||getPas1().equals("")||getPas1()==null){
          addActionError("Password empty.");
     }
     else if(!getPas().equals(getPas1())){
          addActionError("Password not match!! Re-enter Password.");  
     }
     else if(getEmail().equals("")||getEmail()==null){
         addActionError("Email empty");
     }
     else if(d==true){
         addActionError("Username already exist");
     }  
    }
}
