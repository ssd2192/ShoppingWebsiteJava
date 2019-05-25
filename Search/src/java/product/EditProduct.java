
package product;

import connection.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class EditProduct {
     public static boolean edit(String oldproid,String proid,String catid, String proname,String prodesc,int proprice,String p,String progender,String protype){
        boolean b=false;
        
      {
        try{
            Connection conn=MyConnection.OpenConnection();
            System.out.println("before query");
            String query="update PRODUCTS set PRODID=?,BRANDNAME=?,CATEGORY=?,DESCRIPTION=?,PRICE=?,PRODUCTIMG=?,GENDER=? TYPE=? where PRODID=\'"+oldproid+"\'";   
            System.out.println("after query");
            PreparedStatement ps=conn.prepareStatement(query);
            ps.setString(1, proid);
            ps.setString(2, proname);
            ps.setString(3, catid);
            ps.setString(4, prodesc);
            ps.setInt(5, proprice);
            ps.setString(6, p);
            ps.setString(7, progender);
            ps.setString(8,protype);
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
