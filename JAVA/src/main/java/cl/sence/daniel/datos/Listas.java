package cl.sence.daniel.datos;

import java.util.ArrayList;
import java.util.List;

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
