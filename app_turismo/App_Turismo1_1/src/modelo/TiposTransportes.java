package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

import controller.Conexion;

public class TiposTransportes {
	
	
	String nombre; 
	String observacion;
	public TiposTransportes(String nombre, String observacion) {
		super();
		this.nombre = nombre;
		this.observacion = observacion;
		
		
	}
	public TiposTransportes() {
		super();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	
	Conexion conector = new Conexion();
	
	public void create(String nombre, String observacion) {
		Connection dbConnection = null; 
		PreparedStatement pst = null;
		
		String script = "Insert Into tbltipotransporte (nombre,observacion) values (?,?)";
		
		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			
			pst.setString(1, nombre);
			pst.setString(2, observacion);
			
			pst.executeUpdate();
			
		JOptionPane.showConfirmDialog(null, "Registro con Exito");
			
		} catch (Exception e) {
		
		}
		
		
	}
	
	
	

}
