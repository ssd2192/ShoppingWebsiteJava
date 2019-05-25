package DAO;

import connection.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAORateOneGlass {
    public List<UserListaccessories> fetch(){
try{
Connection conn=MyConnection.OpenConnection();
PreparedStatement stmt=conn.prepareStatement("select * from PRODUCTS where UPPER(CATEGORY)=UPPER('sunglass') AND UPPER(PRICE)<=5000");      
ResultSet rset=stmt.executeQuery();
UserListaccessories userlist;
List<UserListaccessories> list=new ArrayList<UserListaccessories>();
while(rset.next()){
userlist=new UserListaccessories();
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
System.out.println(e);
}
return null;
}
    
}
