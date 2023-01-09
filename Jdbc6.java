package com.itt.jdbc;

import java.sql.*;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import java.io.*;
//Inserting larger Images

public class Jdbc6{
     public static void main(String[] args){
	 try{
	    //creation a connection by calling a method from class Connection provider
		Connection c=ConnectionProvider.getConnection();
		 
		 
		//create a query//dynamic query
		String q="insert into images(pic) values(?)";
		
		//get a prepared statement object:
		PreparedStatement p=c.prepareStatement(q);
		
		//set the values of query:
		JFileChooser j=new JFileChooser();
		j.showOpenDialog(null);
		File file=j.getSelectedFile();
		
		FileInputStream f=new FileInputStream(file);
		p.setBinaryStream(1, f,f.available());
		
		p.executeUpdate();
		//System.out.println("Done...");
		JOptionPane.showMessageDialog(null,"success");
		
	 }
	 catch(Exception e){
		   e.getStackTrace();
     }	
     
}

}
