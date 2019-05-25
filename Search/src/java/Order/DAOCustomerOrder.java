/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Order;

import connection.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dhillon
 */
public class DAOCustomerOrder {
      public List<UserListOrder> fetch(String uname){
try{
Connection conn=MyConnection.OpenConnection();
PreparedStatement stmt=conn.prepareStatement("select * from ORDERS where UNAME=\'"+uname+"\'");
ResultSet rset=stmt.executeQuery();
UserListOrder userlist;
List<UserListOrder> list=new ArrayList<UserListOrder>();
while(rset.next()){
userlist=new UserListOrder();
userlist.setUNAME(rset.getString(1));
userlist.setCNAME(rset.getString(2));
userlist.setCEMAIL(rset.getString(3));
userlist.setCARDNUMBER(rset.getString(4));
userlist.setCADDRESS(rset.getString(5));
userlist.setPROID(rset.getString(6));
userlist.setSTATUS(rset.getString(7));
userlist.setPRICE(rset.getFloat(8));
list.add(userlist);
}
return list; 
}catch(Exception e){
System.out.println(e);
}
return null;
}
    
}
