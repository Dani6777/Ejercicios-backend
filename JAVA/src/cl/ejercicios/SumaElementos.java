package cl.ejercicios;

public class SumaElementos {

    public static void main(String[] args) {

        int[] numbers = { 1, 2, 3, 4, 5 };
        int suma = 0;

        for (int number : numbers) {
            suma += number;
        }
        System.out.println("La suma de los elementos es: " + suma);
    }

}
