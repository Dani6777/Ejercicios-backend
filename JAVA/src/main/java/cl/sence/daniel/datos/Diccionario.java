package cl.sence.daniel.datos;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Diccionario {
    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {

        Map<Integer, String> diccionarioHash = new HashMap<>();
        diccionarioHash.put(4, "Daniel");
        diccionarioHash.put(1, "Andres");
        diccionarioHash.put(5, "Jose");
        diccionarioHash.put(30, "Camlia");
        for(Map.Entry<Integer, String> entry : diccionarioHash.entrySet()) {
            System.out.println(entry.getKey() +" "+ entry.getValue());
        }

        System.out.println("------------");

        //ordena la llaves de mayor a menor
        Map<Integer, String> diccionarioTree = new TreeMap<>();
        diccionarioTree.put(8, "Daniel");
        diccionarioTree.put(2, "Andres");
        diccionarioTree.put(12, "Jose");
        diccionarioTree.put(3, "Camlia");
        for(Map.Entry<Integer, String> entry : diccionarioTree.entrySet()) {
            System.out.println(entry.getKey() +" "+ entry.getValue());
        }

        System.out.println("------------");

        Map<Integer, String> diccionarioLinked = new LinkedHashMap<>();
        diccionarioLinked.put(32, "Daniel");
        diccionarioLinked.put(2, "Andres");
        diccionarioLinked.put(21, "Jose");
        diccionarioLinked.put(19, "Camlia");
        for(Map.Entry<Integer, String> entry : diccionarioLinked.entrySet()) {
            System.out.println(entry.getKey() +" "+ entry.getValue());
        }
    }
}
