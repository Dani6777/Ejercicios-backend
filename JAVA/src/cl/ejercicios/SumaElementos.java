package cl.ejercicios;

// TODO: Auto-generated Javadoc
/**
 * The Class SumaElementos.
 */
public class SumaElementos {

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {

        int[] numbers = { 1, 2, 3, 4, 5 };
        int suma = 0;

        for (int number : numbers) {
            suma += number;
        }
        System.out.println("La suma de los elementos es: " + suma);
    }

}
