
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc {
public static void main(String[] args) {
     Connection con=null;
     Statement stmnt=null;
    try
    {
   Class.forName("oracle.jdbc.driver.OracleDriver");
   
   
    }
    catch(ClassNotFoundException c)
    {
        System.out.println("Class is not loaded");
    }
    //2.Define the Connection URL
    try
    {
        con=DriverManager.getConnection("jdbc:oracle:thin:@10.80.12.32:1521:orcl2","system","oracle");
    }
    catch(SQLException s)
    {
        System.out.println("url is  not connected");
    }
    try
    {
     stmnt=con.createStatement();
    }
    catch(SQLException s)
    {
        System.out.println("could not  establish connection to database");
    }
    //4.execute query
    try
    {
      ResultSet rs= stmnt.executeQuery("select * from employee");
      while(rs.next())
      {
          System.out.println(rs.getInt(1)+""+rs.getString(2)+" "+rs.getString(3)+" "+rs.getDate(4)+" "+rs.getString(5));         
      }
    }
    catch(SQLException s)
    {
        System.out.println("could not fetch the data");    
    }
    finally
    {
        try
        {
    con.close();  
        }
        catch(SQLException s)
        {
            
        }
    }
    
    
}
    
}
