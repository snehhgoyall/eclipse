
import java.sql.*;

public class Jdbc2 {

	public static void main(String[] args) {
		try
		{
			
			//load the driver:
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//creating a connection:
			
			String url="jdbc:mysql://localhost:3306/youtube";
			String username="root";
			String password="Sneha@1234";
			Connection c=DriverManager.getConnection(url,username,password);
			
			
			//creating a query:
			String q="CREATE TABLE DATA(tId int(20) primary key auto_increment,tName varchar(200) not null, tCity varchar(400))";
			   
			   
			//create a statement:
			Statement s=c.createStatement();
			s.executeUpdate(q);
			
			System.out.println("Table Created...");
			c.close();
		
			   
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		// TODO Auto-generated method stub

	}

}