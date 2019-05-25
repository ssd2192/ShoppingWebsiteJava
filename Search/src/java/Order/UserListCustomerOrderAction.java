
package Order;

import com.opensymphony.xwork2.ActionSupport;
import java.util.List;


public class UserListCustomerOrderAction extends ActionSupport{
    private static final long serialVersionUID = 1L;
    private UserListOrder userlist;
    private List<UserListOrder> userlistlist;
    
    String uname;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }
    
  
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
        DAOCustomerOrder dao=new DAOCustomerOrder();
    userlistlist=dao.fetch(uname);
    return "success";
    }
    
    @Override
    public void validate(){
         boolean d=AddOrderStatus.OrderExist(uname);
     if(getUname().equals("")||getUname()==null){
          addActionError("Username empty.");
     }
     else if(d==false){
         addActionError("Invalid Order ID.");
     }
    }
    
}
