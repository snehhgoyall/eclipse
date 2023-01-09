package com.itt.jdbc;

import java.sql.*;


public class Tester {

	public static void main(String[] args){
		try {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        Connection c= DriverManager.getConnection( "jdbc:mysql://localhost:3306/youtube", "root", "Sneha@1234");
        
        if(c.isClosed()){
			   System.out.println("Connection is Closed.");
			}else
			{
				System.out.println("Connection Created...");
			}
		}catch(Exception e){
			System.out.println("Error..");
			
		}
	

}
}
