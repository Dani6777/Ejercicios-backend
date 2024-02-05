package cl.datos;

public class ElementoMayor {
	
    public static void main(String[] args) {

        int[] numbers = { 12, 7, 23, 14, 9 };
        int mayor = numbers[0];

        for (int number : numbers) {
            if (number > mayor) {
                mayor = number;
            }
        }
        System.out.println("El elemento mas grande es: " + mayor);
    }
}
