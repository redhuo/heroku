package Sevlets;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 * Servlet implementation class personSevlet
 */
@WebServlet("/mostrarDatos")
public class personSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	Person nuevo;
    ArrayList <Person> lista =  new ArrayList<Person>();
    
    public personSevlet() {
        super();
        
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*String nombre= request.getParameter("nombre");
		String edad = request.getParameter("edad");
		String carrera = "estudiante";
		String ageCarrera="dos";
		String numTel = request.getParameter("telefono");
		String direccion = request.getParameter("direccion");
		String email = request.getParameter("correo");
		System.out.println(nombre);
		nuevo = new Person(nombre,edad,carrera,ageCarrera,numTel,direccion,email);
		lista.add(nuevo);
		String sql = "";
		baseDatos dateBase = new baseDatos();
		Connection conectar;
		try {
				conectar = dateBase.conectar();
				sql = "INSERT INTO datos_personales (Nombre, Apellido, Edad, Direccion, telefono, carrera, sexo) VALUES (?,?,?,?,?,?,?)";
				PreparedStatement prepare = conectar.prepareStatement(sql);
				prepare.setString(1, nombre);
				prepare.setString(2, email);
				prepare.setString(3, edad);
				prepare.setString(4, direccion);
				prepare.setString(5, numTel);
				prepare.setString(6, carrera);
				prepare.setString(7, ageCarrera);
				prepare.executeUpdate();
				
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
			String nombre= request.getParameter("nombre");
			String edad = request.getParameter("edad");
			String carrera = "estudiante";
			String ageCarrera="dos";
			String numTel = request.getParameter("telefono");
			String direccion = request.getParameter("direccion");
			String email = request.getParameter("correo");
			System.out.println(nombre);
			nuevo = new Person(nombre,edad,carrera,ageCarrera,numTel,direccion,email);
			serializeObj archivo =  new serializeObj();
			archivo.serialize(nuevo);
			//lista.add(nuevo);
			/*String sql = "";
			baseDatos dateBase = new baseDatos();
			Connection conectar;
			try {
					conectar = dateBase.conectar();
					sql = "INSERT INTO datos (Nombre, Apellido, Edad, Direccion, telefono, carrera, sexo) VALUES (?,?,?,?,?,?,?)";
					PreparedStatement prepare = conectar.prepareStatement(sql);
					prepare.setString(1, nombre);
					prepare.setString(2, email);
					prepare.setString(3, edad);
					prepare.setString(4, direccion);
					prepare.setString(5, numTel);
					prepare.setString(6, carrera);
					prepare.setString(7, ageCarrera);
					prepare.executeUpdate();
					
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		/*String test = lista.get(0).getName();
		
		String mensaje;
		mensaje= "Hola "+test;
		request.setAttribute("mensaje",mensaje);*/
		//System.out.println(nombre);
		RequestDispatcher dispatcher = request.getRequestDispatcher("error.jsp");
		dispatcher.forward(request, response);
	}

}
