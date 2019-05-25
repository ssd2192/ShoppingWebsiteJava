
package admin;

import connection.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class AdminLogin {
    public static boolean login(String id,String pas){
        boolean b=false;
        try{
            Connection conn=MyConnection.OpenConnection();
            String query="Select * from ADMINLOGIN where id=? and pas=?";
            PreparedStatement ps=conn.prepareStatement(query);
            ps.setString(1, id);
            ps.setString(2, pas);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                b=true;
            }
            else{
                b=false;
            }
            
        }
        catch(Exception e){
            System.out.println("Query error"+e.getMessage());
        }
        finally{
            MyConnection.closeConnection();
        }
        return b;
    }
         
    
}
