
import java.sql.*;

public class FirstJdbcFile {

	public static void main(String[] args) {
		try
		{
			
			//load the driver:
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//creating a connection
			
			String url="jdbc:mysql://localhost:3306/youtube";
			String username="root";
			String password="Sneha@1234";
			Connection c=DriverManager.getConnection(url,username,password);
			
			
			if(c.isClosed()){
			   System.out.println("Connection is Closed.");
			}else
			{
				System.out.println("Connection Created...");
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		// TODO Auto-generated method stub

	}

}