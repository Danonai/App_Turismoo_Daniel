package controller;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

	public Connection conectarBD() {
		Connection conexion = null;
		try {
		conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_turismo2","root","2556229");	
		System.out.println("Connected Whit the database successfully");	
		} catch (SQLException e){
			System.out.println("Error while connecting to the database"+e.getMessage());
			
		}
		 return conexion; 
		 
	}
	
}
