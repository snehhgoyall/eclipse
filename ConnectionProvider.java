package com.itt.jdbc;

import java.sql.*;

public class ConnectionProvider {
		private static Connection con;
		
		public static Connection getConnection() {
		try {	
        if(con==null) {
        	//load the driver:
		    Class.forName("com.mysql.cj.jdbc.Driver");
			
    		
    		//Creating a Connection:
    		String url="jdbc:mysql://localhost:3306/youtube";
    		String username="root";
    		String password="Sneha@1234";
    	    con=DriverManager.getConnection(url,username,password);
        }
		}catch(Exception e) {
			e.getStackTrace();
		}
		return con;
        
	}
}


