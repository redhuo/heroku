package Sevlets;
import java.io.*;
public class serializeObj{
	String path = "scr/Sevlets/usuarios.ser";//#{RAILS_ROOT}/tmp/usuarios.ser";// new File("usuarios.ser").getCanonicalPath();
	
	
	public void serialize(Graph objeto){
	      
	      try
	      { 
	         FileOutputStream fileOut =
	         new FileOutputStream("usuarios.ser");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(objeto);
	         out.close();
	         fileOut.close();
	         System.out.printf("Se serializo en  usuarios.ser en " + path);
	      }catch(IOException i)
	      {
	          i.printStackTrace();
	      }
	   }
	public Graph deserialiize(){
		Graph e = new Graph();
	      try
	      {
	         FileInputStream fileIn = new FileInputStream("usuarios.ser");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         e = (Graph) in.readObject();
	         in.close();
	         fileIn.close();
	      }catch(IOException i)
	      {
	         i.printStackTrace();
	         
	      }catch(ClassNotFoundException c)
	      {
	         System.out.println("Archivo no encontrado");
	         c.printStackTrace();
	      }
	      return e;

	    }
}

