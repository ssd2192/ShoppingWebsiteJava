package Order;

import connection.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;


public class Debit {
     public static boolean add(String uname,String cnumber){
        boolean b=false;
        try{
            Connection conn=MyConnection.OpenConnection();
            String query="update ORDERS set CARDNUMBER=? where UNAME=\'"+uname+"\'";
            PreparedStatement ps=conn.prepareStatement(query);
            
            ps.setString(1,cnumber);
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
