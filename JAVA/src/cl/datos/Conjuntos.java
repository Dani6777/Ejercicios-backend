package cl.datos;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Conjuntos {

	public static void main(String[] args) {
		
		//no se puede duplicar y no se almacenan en un orden
		HashSet<String> nombres = new HashSet<String>();
		
		nombres.add("Daniel");
		nombres.add("David");
		
		//no se pueden duplicar y se almacenan de menor a mayor
		Set<String> conjuntoTree = new TreeSet<>();	
		conjuntoTree.add("Daniel");
		conjuntoTree.add("Josefa");
		conjuntoTree.add("Andres");
		
		for(String nombre : conjuntoTree) {
			System.out.println("valor "+ nombre);
		}
		
		
		//no permite valores repetidos y se ordenan de la manera en la que ingresan
		Set<Character> conjuntoLinked = new LinkedHashSet<>();
		conjuntoLinked.add('B');
		conjuntoLinked.add('A');
		conjuntoLinked.add('C');
		for(Character valor : conjuntoLinked) {
			System.out.println("valor "+ valor);
		}
	}
}
