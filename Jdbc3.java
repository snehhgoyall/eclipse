//prepared statement:insert


import java.sql.*;
class Jdbc3{
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

        //set the values to query:
        p.setString(1,"John");
        p.setString(2,"Kanpur");
        
        p.executeUpdate();
        System.out.println("Inserted...");
        p.close();		
	}
	catch(Exception e){
	    e.printStackTrace();
	}
	
  }
}