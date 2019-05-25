package Order;

import connection.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class AddAddress {
    
     public static boolean add(String uname,String cmail,String cname,String caddress,String proid,int price){
        boolean b=false;
        try{
            Connection conn=MyConnection.OpenConnection();
            String query="insert into ORDERS(UNAME,CNAME,CEMAIL,CADDRESS,PROID,PRICE) values(?,?,?,?,?,?)";
            PreparedStatement ps=conn.prepareStatement(query);
            ps.setString(1,uname);
            ps.setString(2,cname);
            ps.setString(3,cmail);
            ps.setString(4,caddress);
            ps.setString(5,proid);
            ps.setInt(6,price);
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
