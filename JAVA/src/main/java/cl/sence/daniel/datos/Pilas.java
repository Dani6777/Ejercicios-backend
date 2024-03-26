package cl.sence.daniel.datos;

import java.util.Stack;

public class Pilas {
    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {

        Stack<Integer> pila = new Stack<Integer>();

        for(int i = 0; i<10; i++) {
            pila.push(i);

        }
        pila.pop();
        System.out.println(pila.peek());
    }
}
