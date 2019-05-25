package Order;

import com.opensymphony.xwork2.ActionSupport;
import java.util.List;

public class UserListOrderAction extends ActionSupport{
    
    private static final long serialVersionUID = 1L;
    private UserListOrder userlist;
    private List<UserListOrder> userlistlist;
    
  
    public UserListOrder getUserlist() {
    return userlist;
    }
    public void setUserlist(UserListOrder userlist) {
    this.userlist = userlist;
    }
    public List<UserListOrder> getUserlistlist() {
    return userlistlist;
    }
    public void setUserlistlist(List<UserListOrder> userlistlist) {
    this.userlistlist = userlistlist;
    }
    @Override
    public String execute(){
        DAOOrderAdmin dao=new DAOOrderAdmin();
    userlistlist=dao.fetch();
    return "success";
    }
    
}
