package Order;

import com.opensymphony.xwork2.ActionSupport;


public class AddAddressAction extends ActionSupport{
    
    String uname,cmail,cname,caddress,proid;
    String s="";
    int price;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getCmail() {
        return cmail;
    }

    public void setCmail(String cmail) {
        this.cmail = cmail;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCaddress() {
        return caddress;
    }

    public void setCaddress(String caddress) {
        this.caddress = caddress;
    }

    public String getProid() {
        return proid;
    }

    public void setProid(String proid) {
        this.proid = proid;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
    
    @Override
     public void validate(){
         boolean d=AddOrderStatus.OrderExist(uname);
         
     if(getUname().equals("")||getUname()==null){
          addActionError("Username empty.");
     }
     else if(getCmail().equals("")||getCmail()==null){
          addActionError("Status empty.");
     }
     else if(getCname().equals("")||getCname()==null){
          addActionError("Status empty.");
     }
     else if(getCaddress().equals("")||getCaddress()==null){
          addActionError("Status empty.");
     }
     
     else if(d==true){
         addActionError("Username not available");
     }
    }
    
    @Override
     public String execute() throws Exception {
        Class cls= Class.forName("Order.UserListBuyAction");
        ClassLoader cLoader = cls.getClassLoader();
        boolean b=AddAddress.add(uname,cmail,cname,caddress,proid,price);
        if(b){
            
            s=SUCCESS;
        }
        else
        { s=ERROR; }
     return s;
     
    }
    
    
}
