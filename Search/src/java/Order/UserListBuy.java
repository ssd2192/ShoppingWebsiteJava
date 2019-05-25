package Order;

public class UserListBuy {       
String PRODID,BRANDNAME,CATEGORY,DESCRIPTION,PRODUCTIMG,GENDER,TYPE;
int PRICE;

public UserListBuy() {       
super();         
// TODO Auto-generated constructor stub
}   
public UserListBuy(String PRODID,String BRANDNAME,String CATEGORY,String DESCRIPTION,int PRICE,String PRODUCTIMG,String GENDER,String TYPE) {
super();      
this.PRODID=PRODID;
this.BRANDNAME=BRANDNAME;
this.CATEGORY = CATEGORY;
this.DESCRIPTION=DESCRIPTION;
this.PRICE=PRICE;
this.PRODUCTIMG=PRODUCTIMG;
this.GENDER=GENDER;
this.TYPE=TYPE;
}

    public String getTYPE() {
        return TYPE;
    }

    public void setTYPE(String TYPE) {
        this.TYPE = TYPE;
    }

    public String getPRODID() {
        return PRODID;
    }

    public void setPRODID(String PRODID) {
        this.PRODID = PRODID;
    }

    public String getBRANDNAME() {
        return BRANDNAME;
    }

    public void setBRANDNAME(String BRANDNAME) {
        this.BRANDNAME = BRANDNAME;
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }

    public int getPRICE() {
        return PRICE;
    }

    public void setPRICE(int PRICE) {
        this.PRICE = PRICE;
    }

    public String getCATEGORY() {
        return CATEGORY;
    }

    public void setCATEGORY(String CATEGORY) {
        this.CATEGORY = CATEGORY;
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
   
    

}