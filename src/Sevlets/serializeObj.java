package Sevlets;
import java.io.*;
public class serializeObj {
	public void serialize(Person objeto){
	      
	      try
	      {
	         FileOutputStream fileOut =
	         new FileOutputStream("docs.ser");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(objeto);
	         out.close();
	         fileOut.close();
	         System.out.printf("Se serializo en  docs.ser");
	      }catch(IOException i)
	      {
	          i.printStackTrace();
	      }
	   }
	public void deserialiize(){
		Person e = null;
	      try
	      {
	         FileInputStream fileIn = new FileInputStream("docs.ser");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         e = (Person) in.readObject();
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

	    }
}

