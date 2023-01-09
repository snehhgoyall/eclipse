import java.sql.*;
import java.io.*;
//blob can only store less than 65kb

class Jdbc5{
     public static void main(String[] args){
	 try
	 {
	    //load the driver:
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Creating a Connection:
		String url="jdbc:mysql://localhost:3306/youtube";
		String username="root";
		String password="Sneha@1234";
		Connection c=DriverManager.getConnection(url,username,password);
		
		//create a query
		String q="insert into images(pic) values(?)";
		
		//get a prepared statement object:
		PreparedStatement p=c.prepareStatement(q);
		
		//set the values of query:
		FileInputStream f=new FileInputStream("Bleach.jpg");
		p.setBinaryStream(1,f,f.available());
		p.executeUpdate();
		System.out.println("Done...");
		p.close();
	 }
	 catch(Exception e){
		   System.out.println("Error!!");
     }	
     
}
}	 