package category;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
public class UserListAction extends ActionSupport{
    
    private static final long serialVersionUID = 1L;
    private UserList userlist;
    private List<UserList> userlistlist;
    
  
    public UserList getUserlist() {
    return userlist;
    }
    public void setUserlist(UserList userlist) {
    this.userlist = userlist;
    }
    public List<UserList> getUserlistlist() {
    return userlistlist;
    }
    public void setUserlistlist(List<UserList> userlistlist) {
    this.userlistlist = userlistlist;
    }
    @Override
    public String execute(){
        DAO dao=new DAO();
    userlistlist=dao.fetch();
    return "success";
    }
    }
