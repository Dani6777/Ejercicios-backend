package cl.datos;

public class RotacionDerecha {
	
	 public static void main(String[] args) {

	        int[] numbers = { 1, 2, 3, 4, 5 };
	        int n = numbers.length;

	        // realizamos la rotación
	        int temp = numbers[n - 1];
	        for (int i = n - 1; i > 0; i--) {
	            numbers[i] = numbers[i - 1];
	        }
	        numbers[0] = temp;

	        // mostramos el array después de la rotación
	        System.out.println("Array después de la rotación: ");
	        for (int number : numbers) {
	            System.out.println(number + " ");
	        }
	    }

}
