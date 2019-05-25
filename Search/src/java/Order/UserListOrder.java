
package Order;

public class UserListOrder {
    String UNAME,CNAME,CEMAIL,CARDNUMBER,CADDRESS,PROID,STATUS;
    float PRICE;
    
    public UserListOrder() {
    super();
    }
    
    public UserListOrder(String UNAME, String CNAME,String CEMAIL,String CARDNUMBER,String CADDRESS,String PROID,String STATUS,float PRICE) {
    super();
    this.UNAME=UNAME;
    this.CNAME=CNAME;
    this.CEMAIL=CEMAIL;
    this.CARDNUMBER=CARDNUMBER;
    this.CADDRESS=CADDRESS;
    this.PROID=PROID;
    this.STATUS=STATUS;
    this.PRICE=PRICE;
    
    }

    public String getUNAME() {
        return UNAME;
    }

    public void setUNAME(String UNAME) {
        this.UNAME = UNAME;
    }

    public String getCNAME() {
        return CNAME;
    }

    public void setCNAME(String CNAME) {
        this.CNAME = CNAME;
    }

    public String getCEMAIL() {
        return CEMAIL;
    }

    public void setCEMAIL(String CEMAIL) {
        this.CEMAIL = CEMAIL;
    }

    public String getCARDNUMBER() {
        return CARDNUMBER;
    }

    public void setCARDNUMBER(String CARDNUMBER) {
        this.CARDNUMBER = CARDNUMBER;
    }

    public String getCADDRESS() {
        return CADDRESS;
    }

    public void setCADDRESS(String CADDRESS) {
        this.CADDRESS = CADDRESS;
    }

    public String getPROID() {
        return PROID;
    }

    public void setPROID(String PROID) {
        this.PROID = PROID;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS;
    }

    public float getPRICE() {
        return PRICE;
    }

    public void setPRICE(float PRICE) {
        this.PRICE = PRICE;
    }
    
    
}
