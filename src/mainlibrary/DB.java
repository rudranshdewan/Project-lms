/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainlibrary;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 *
 */
public class DB {
	public static Connection getConnection(){
		Connection con=null;
		try{
                            Properties props = new Properties(); 
                            props.put("user", "root");         
                            props.put("password", "12345678");
                            props.put("useUnicode", "true");
                            props.put("useServerPrepStmts", "false"); // use client-side prepared statement
                            props.put("characterEncoding", "UTF-8"); // ensure charset is utf8 here
                            
                       Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library",props);     
//                            Statement stmt=con.createStatement();
//                            ResultSet rs=stmt.executeQuery("select * from Librarian");  
//                            while(rs.next())  
//                                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3) + " " + rs.getString(4));  
//                        System.out.println()
		}   catch(ClassNotFoundException | SQLException e){System.out.println(e);}
		return con;
	}

}
