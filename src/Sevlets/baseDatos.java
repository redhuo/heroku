package Sevlets;
import java.sql.*;


public class baseDatos{
;
	
	
	public baseDatos(){
		
	}
	
	public Connection conectar() throws ClassNotFoundException, SQLException{
	Connection base = null;
	try{
		Class.forName("com.mysql.jdbc.Driver").newInstance();
	
		base = DriverManager.getConnection("jdbc:mysql://localhost/usuarios","root","root");
		
		System.out.println("exito");
	}
	catch(Exception e){
		System.out.println(e);
	}
	return base;
	}
	
}
