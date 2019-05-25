package admin;

import connection.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class AdminRegistration {
    
    public static boolean userexist(String id){
        boolean d=false;
        try{
            Connection conn=MyConnection.OpenConnection();
            String query="select * from ADMINLOGIN where UPPER(id)=UPPER(?)";
            PreparedStatement ps=conn.prepareStatement(query);
            ps.setString(1, id);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                d=true;
            }
            else{
                d=false;
            }
        }
        catch(Exception e){
        }
        finally{
             MyConnection.closeConnection();
        }
        return d;
    }
    
    public static boolean register(String id,String pas,String email){
        boolean b=false;
        
      {
        try{
            Connection conn=MyConnection.OpenConnection();
            String query="insert into ADMINLOGIN(id,pas,email) values(?,?,?)";
            PreparedStatement ps=conn.prepareStatement(query);
            ps.setString(1, id);
            ps.setString(2, pas);
            ps.setString(3, email);
            int a=ps.executeUpdate();
            if(a>=1) {
                b=true;
            }
            else {
                b=false;
            }    
        }
        catch(Exception e){
            System.out.println("Query error"+e.getMessage());
        }
        finally{
            MyConnection.closeConnection();
        }
       }
    
    return b;
   }
}
