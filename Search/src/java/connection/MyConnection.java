
package connection;

import java.sql.Connection;
import java.sql.DriverManager;


public class MyConnection {
    static Connection conn=null;
    public static Connection OpenConnection(){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
  conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","java");
            
        }
        catch(Exception e){
            System.out.println(e.getMessage());   
        }
        return conn;
    }
    public static void closeConnection(){
        try{
            conn.close();
        }
        catch(Exception e){
            
        }
    } 
}
