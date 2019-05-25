package product;

import connection.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AddProduct {
     public static boolean productexist(String proid){
        boolean d=false;
        try{
            Connection conn=MyConnection.OpenConnection();
            String query="select * from PRODUCTS where UPPER(PRODID)=UPPER(?)";
            PreparedStatement ps=conn.prepareStatement(query);
            ps.setString(1, proid);
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
    
    public static boolean add(String proid,String catid,String proname,String prodesc,int proprice,String p,String progender,String protype){
        boolean b=false;
        try{
            Connection conn=MyConnection.OpenConnection();
            //File file=new File(proimg);
            
            String query="insert into PRODUCTS(PRODID,BRANDNAME,CATEGORY,DESCRIPTION,PRICE,PRODUCTIMG,GENDER,TYPE) values(?,?,?,?,?,?,?,?)";
            PreparedStatement ps=conn.prepareStatement(query);
            ps.setString(1,proid);
            ps.setString(2,proname);
            ps.setString(3,catid);
            ps.setString(4,prodesc);
            ps.setInt(5,proprice);
            ps.setString(6,p);
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
        return b;
    }
    
}
