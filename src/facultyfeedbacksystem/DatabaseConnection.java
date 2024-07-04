/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facultyfeedbacksystem;
import java.sql.*;

/**
 *
 * @author Sunishka Sharma
 */
public class DatabaseConnection {
    
    
    public static  Connection getConnect()
    {
        Connection con=null;
        try{   //software doesnt crash if the code has error
             Class.forName("java.sql.DriverManager");
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/feedback_db","root", "root");
             return con;
           }
        catch(Exception ex)
        {
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }
        return con;
    }
    
}



