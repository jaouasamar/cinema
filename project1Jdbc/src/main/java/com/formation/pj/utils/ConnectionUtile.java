package com.formation.pj.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 

public class ConnectionUtile {
private String url = "jdbc:mysql://localhost:3306/jdbc";
private String username="root";
private String password="";
private Connection connexion;
private static ConnectionUtile instance;


private ConnectionUtile() throws ClassNotFoundException, SQLException{
	Class.forName("com.mysql.jdbc.Driver");
connexion=DriverManager.getConnection(url,username,password);
}
public static ConnectionUtile getInstance() throws ClassNotFoundException, SQLException
{
	if(instance==null)
	{
		instance=new ConnectionUtile();
	}
	return instance;
	
}
public Connection getConnection() {
	return this.connexion;
}
		
}
