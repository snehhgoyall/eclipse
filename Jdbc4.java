//take input form the user:Dynamic data insert:

import java.io.*;
import java.sql.*;
class Jdbc4{
    public static void main(String[] args){
	try{
	
	    //load the driver:
	    Class.forName("com.mysql.cj.jdbc.Driver");
			
		//creating a connection
			
		String url="jdbc:mysql://localhost:3306/youtube";
		String username="root";
		String password="Sneha@1234";
		Connection c=DriverManager.getConnection(url,username,password);
			
	    //create a query:
		String q="INSERT INTO DATA(tName,tCity) values(?,?)";
	    

        //get a PreparedStatement object:
        PreparedStatement p=c.prepareStatement(q);
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Name:");
		String name=b.readLine();
		
		System.out.println("Enter City:");
		String city=b.readLine();
		
        //set the values to query:
        p.setString(1,name);
        p.setString(2,city);
        
        p.executeUpdate();
        System.out.println("Inserted...");
        p.close();		
	}
	catch(Exception e){
	    e.printStackTrace();
	}
	
  }
}