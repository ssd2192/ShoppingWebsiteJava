package category;
public class UserList {       
String CATEGORYNAME;       
String address;     
String city;     
String state;
public UserList() {       
super();         
// TODO Auto-generated constructor stub
}   
public UserList(String CATEGORYNAME) {
super();         
this.CATEGORYNAME = CATEGORYNAME;             

}
public String getCATEGORYNAME() {
   return CATEGORYNAME;
}

public void setCATEGORYNAME(String CATEGORYNAME) {
   this.CATEGORYNAME = CATEGORYNAME;
}

}
