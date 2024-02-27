package cl.sence.daniel.datos;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Conjuntos {

    public static void main(String[] args) {

        //No se puede duplicar y no se almacenan en un orden
        HashSet<String> nombres = new HashSet<>();
        nombres.add("Daniel");
        nombres.add("Josefa");
        for (String nombre : nombres) {
            System.out.println("valor: " + nombre);
        }

        System.out.println("--------------");

        //no se pueden duplicar y se almacenan de menor a mayor
        Set<String> conjuntoTree = new TreeSet<>();
        conjuntoTree.add("Andres");
        conjuntoTree.add("Miguel");
        conjuntoTree.add("David");
        for (String nombre : conjuntoTree) {
            System.out.println("valor: " + nombre);
        }

        System.out.println("--------------");

        //no se permiten valores repetidos y se ordenan de la manera en la que se ingresan
        Set<Character> conjuntoLinked = new LinkedHashSet<>();
        conjuntoLinked.add('B');
        conjuntoLinked.add('A');
        conjuntoLinked.add('C');
        for(Character valor : conjuntoLinked){
            System.out.println("valor: "+ valor);
        }

    }
}
