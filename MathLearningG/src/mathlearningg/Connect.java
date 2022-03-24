/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathlearningg;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Personal
 */
public class Connect {
    
    
    static Connection cn;
    public static Connection ConnectedDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/mathlearninggame","root","");
            System.out.println("Connected!");
            return cn;
        }catch(Exception ex){
            System.out.println(ex);
            return null;
        }
    }
    
    
}
