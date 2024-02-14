package cl.datos;

import java.util.List;

import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class Listas.
 */
public class Listas {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
	
	
	List<String> Nombres;
	
	Nombres = new ArrayList<>();
	
	Nombres.add("Daniel");
	Nombres.add("Josefa");
	
	System.out.println(Nombres.get(0));
	System.out.println(Nombres.size());
	System.out.println(Nombres.contains("Andres"));	
   }
}
