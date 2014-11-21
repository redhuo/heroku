package Sevlets;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
@WebServlet("/registrarse")
public class personSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	Person nuevo;
    
    
    public personSevlet() {
        super();
        
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*String nombre= request.getParameter("nombre")+" "+request.getParameter("apellido") ;
		String edad = request.getParameter("edad");
		String carrera = "estudiante";
		String ageCarrera="dos";
		String numTel = request.getParameter("telefono");
		String direccion = request.getParameter("direccion");
		String email = request.getParameter("correo");
		String contrasena = request.getParameter("password");
		String no = "hola";
	
		
		nuevo = new Person(nombre,edad,carrera,numTel,direccion,email,no,contrasena);
		Nodo nodo = new Nodo(nuevo);
		//System.out.println(nodo.getPerson().getEmail());
		grafo.addPerson(nodo);
		
		response.sendRedirect("/index.jsp");
		*/
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String nombre= request.getParameter("nombre")+" "+request.getParameter("apellido") ;
		String edad = request.getParameter("edad");
		String carrera = request.getParameter("carrera");
		String ageCarrera=request.getParameter("aCarrera");
		String numTel = request.getParameter("telefono");
		String direccion = request.getParameter("direccion");
		String email = request.getParameter("correo");
		String contrasena = request.getParameter("password");
		
	
		
		nuevo = new Person(nombre,edad,carrera,ageCarrera,numTel,direccion,email,contrasena);
		Nodo nodo = new Nodo(nuevo);
		serializeObj docu = new serializeObj();
		Graph grafo = new Graph();
		try{
			grafo=docu.deserialiize();
			grafo.addPerson(nodo);
			docu.serialize(grafo);
		}
		catch(Exception e){
			grafo.addPerson(nodo);
			docu.deserialiize();
		}
		
		
		response.sendRedirect("index.jsp");
		
	
	}

}
