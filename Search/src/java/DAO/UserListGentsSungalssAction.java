package DAO;

import com.opensymphony.xwork2.ActionSupport;
import java.util.List;

public class UserListGentsSungalssAction extends ActionSupport{
     private static final long serialVersionUID = 1L;
    private UserListaccessories userlist;
    private List<UserListaccessories> userlistlist;
    
  
    public UserListaccessories getUserlist() {
    return userlist;
    }
    public void setUserlist(UserListaccessories userlist) {
    this.userlist = userlist;
    }
    public List<UserListaccessories> getUserlistlist() {
    return userlistlist;
    }
    public void setUserlistlist(List<UserListaccessories> userlistlist) {
    this.userlistlist = userlistlist;
    }
    @Override
    public String execute(){
        DAOGentsSungalss dao=new DAOGentsSungalss();
    userlistlist=dao.fetch();
    return "success";
    }
    
}
