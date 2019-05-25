/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package category;

import connection.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Dhillon
 */
public class EditCategory {
     public static boolean edit(String edit_cat,String showcat){
        boolean b=false;
        
      {
        try{
            Connection conn=MyConnection.OpenConnection();
            System.out.println("before query");
            String query="update CATEGORY_DETAIL set CATEGORYNAME=? where CATEGORYNAME=?";
            System.out.println("after query");
            PreparedStatement ps=conn.prepareStatement(query);
            ps.setString(1, edit_cat);
            ps.setString(2,showcat);
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
