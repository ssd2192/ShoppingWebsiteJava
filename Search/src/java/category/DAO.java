package category;
import connection.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
public class DAO {
public List<UserList> fetch(){
try{
Connection conn=MyConnection.OpenConnection();
PreparedStatement stmt=conn.prepareStatement("select * from CATEGORY_DETAIL");
ResultSet rset=stmt.executeQuery();
UserList userlist;
List<UserList> list=new ArrayList<UserList>();
while(rset.next()){
userlist=new UserList();
userlist.setCATEGORYNAME(rset.getString(1));
list.add(userlist);
}
return list; 
}catch(Exception e){
System.out.println(e);
}
return null;
}
}
