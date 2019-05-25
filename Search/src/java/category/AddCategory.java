/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package category;

import connection.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Dhillon
 */
public class AddCategory {
    public static boolean categoryexist(String category){
        boolean d=false;
        try{
            Connection conn=MyConnection.OpenConnection();
            String query="select * from CATEGORY_DETAIL where UPPER(CATEGORYNAME)=UPPER(?)";
            PreparedStatement ps=conn.prepareStatement(query);
            ps.setString(1, category);
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
    
    public static boolean add(String category){
        boolean b=false;
        try{
            Connection conn=MyConnection.OpenConnection();
            String query="insert into CATEGORY_DETAIL(CATEGORYNAME) values(?)";
            PreparedStatement ps=conn.prepareStatement(query);
            ps.setString(1,category);
            
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
