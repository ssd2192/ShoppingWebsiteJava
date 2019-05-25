package Order;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.interceptor.ServletRequestAware;
public class UserListBuyAction extends ActionSupport implements ServletRequestAware{
    
    private static final long serialVersionUID = 1L;
    private UserListBuy userlist;
    private List<UserListBuy> userlistlist;
    
    HttpServletRequest request;
    String BRANDNAME,CATEGORY,DESCRIPTION,PRODUCTIMG,GENDER,TYPE;
    int PRICE;
   
     @Override
    public void setServletRequest(HttpServletRequest request) {
       this.request=request;
    }
    

    public String getBRANDNAME() {
        return BRANDNAME;
    }

    public void setBRANDNAME(String BRANDNAME) {
        this.BRANDNAME = BRANDNAME;
    }

    public String getCATEGORY() {
        return CATEGORY;
    }

    public void setCATEGORY(String CATEGORY) {
        this.CATEGORY = CATEGORY;
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }

    public String getPRODUCTIMG() {
        return PRODUCTIMG;
    }

    public void setPRODUCTIMG(String PRODUCTIMG) {
        this.PRODUCTIMG = PRODUCTIMG;
    }

    public String getGENDER() {
        return GENDER;
    }

    public void setGENDER(String GENDER) {
        this.GENDER = GENDER;
    }

    public String getTYPE() {
        return TYPE;
    }

    public void setTYPE(String TYPE) {
        this.TYPE = TYPE;
    }

    public int getPRICE() {
        return PRICE;
    }

    public void setPRICE(int PRICE) {
        this.PRICE = PRICE;
    }
    
    
    public UserListBuy getUserlist() {
    return userlist;
    }
    public void setUserlist(UserListBuy userlist) {
    this.userlist = userlist;
    }
    public List<UserListBuy> getUserlistlist() {
    return userlistlist;
    }
    public void setUserlistlist(List<UserListBuy> userlistlist) {
    this.userlistlist = userlistlist;
    }
    @Override
    public String execute(){
        String PRODID=request.getParameter("PRODID");
        DAOBuy dao=new DAOBuy();
    userlistlist=dao.fetch(PRODID);
    return "success";
    }

   
    }
