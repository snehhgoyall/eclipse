package com.itt.jdbc;
//updating data in table data:


import java.sql.Connection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class Jdbc7 {

	public static void main(String[] args) {
		 try{
			    //creation a connection by calling a method from class Connection provider
				Connection c=ConnectionProvider.getConnection();
				
				//Create a query:
				String q="update data set tName=? ,tCity=? where tId=?";
				//get a prepared statement object:
				PreparedStatement p=c.prepareStatement(q);
				
				//provide values to the query;
		        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			    System.out.println("Enter Name:");
			    String tName=br.readLine();
			    
			    
			    System.out.println("Enter City:");
			    String tCity=br.readLine();
			    
			    System.out.println("Enter Id:");
			    int tId=Integer.parseInt(br.readLine());
			    
			    p.setString(1, tName);
			    p.setString(2, tCity);
			    p.setInt(3, tId);
			    p.executeUpdate();
			    System.out.println("Done....");
			    p.close();
				
		 }catch(Exception e) {
			 e.getStackTrace();
		 }
}

}
