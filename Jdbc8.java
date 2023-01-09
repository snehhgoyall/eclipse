package com.itt.jdbc;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbc8 {

	public static void main(String[] args) {
		try{
		    //creation a connection by calling a method from class Connection provider
			Connection c=ConnectionProvider.getConnection();
			
			//Create a query:
			String q="select * from data";
			
			Statement s=c.createStatement();
			ResultSet set=s.executeQuery(q);
			
			while(set.next()){
				int Id=set.getInt(1);
				String Name=set.getString(2);
				String City=set.getString(3);
				System.out.println("ID:"+Id+" Name:"+Name+" City:"+City);
			}
		    set.close();

	}catch(Exception e) {
		 e.getStackTrace();
	 }
}

}
