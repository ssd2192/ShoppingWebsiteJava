package product;

import connection.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteProduct {
    public static boolean delete(String proid){
        boolean b=false;
        
        try{
            Connection conn=MyConnection.OpenConnection();
            System.out.println("before query");
            String query="delete from PRODUCTS where PRODID=?";   
            System.out.println("after query");
            PreparedStatement ps=conn.prepareStatement(query);
            ps.setString(1, proid);
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
        
        
        return b;
        
    }
    
}
