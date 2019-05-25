package Order;

import connection.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AddOrderStatus {
    public static boolean OrderExist(String uname){
        boolean d=false;
        try{
            Connection conn=MyConnection.OpenConnection();
            String query="select * from ORDERS where UPPER(UNAME)=UPPER(?)";
            PreparedStatement ps=conn.prepareStatement(query);
            ps.setString(1, uname);
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
    
    public static boolean add(String uname,String ustatus){
        boolean b=false;
        try{
            Connection conn=MyConnection.OpenConnection();
            String query="update ORDERS set STATUS=? where UNAME=\'"+uname+"\'";
            PreparedStatement ps=conn.prepareStatement(query);
            ps.setString(1,ustatus);
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
