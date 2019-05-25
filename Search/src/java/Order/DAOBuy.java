package Order;

import connection.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
public class DAOBuy {
public List<UserListBuy> fetch(String PRODID){
try{
    System.out.println("val:"+PRODID);
Connection conn=MyConnection.OpenConnection();
PreparedStatement stmt=conn.prepareStatement("Select * from PRODUCTS where PRODID=\'"+PRODID+"\'");
ResultSet rset=stmt.executeQuery();

UserListBuy userlist;
List<UserListBuy> list=new ArrayList<UserListBuy>();
while(rset.next()){
userlist=new UserListBuy();
userlist.setPRODID(rset.getString(1));
userlist.setBRANDNAME(rset.getString(2));
userlist.setCATEGORY(rset.getString(3));
userlist.setDESCRIPTION(rset.getString(4));
userlist.setPRICE(rset.getInt(5));
userlist.setPRODUCTIMG(rset.getString(6));
userlist.setGENDER(rset.getString(7));
userlist.setTYPE(rset.getString(8));

list.add(userlist);
}

return list; 
}catch(Exception e){
System.out.println("excption");
}
return null;
}
}