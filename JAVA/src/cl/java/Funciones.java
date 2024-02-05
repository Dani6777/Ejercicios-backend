package cl.java;

public class Funciones {
	
	 public static void main(String[] args) {

	        int resultado = sumar(10, 11);
	        int resultado1 = calcularFactorial(5);
	        System.out.println(resultado);
	        System.out.println(resultado1);
	        System.out.println(esPrimo(13));
	    }

	    public static int sumar(int x, int y) {

	        int suma = x + y;
	        return suma;
	    }

	    public static int calcularFactorial(int n) {

	        if (n == 0 || n == 1) {
	            return 1;
	        } else {
	            int factorial = 1;
	            for (int i = 2; i <= n; i++) {
	                factorial *= i;
	            }
	            return factorial;
	        }
	    }

	    public static boolean esPrimo(int n) {

	        if (n <= 1) {
	            System.out.println("no es primo");
	            return false;
	        }

	        for (int i = 2; i <= Math.sqrt(n); i++) {
	            if (n % i == 0) {
	                System.out.println("no es primo");
	                return false;
	            }
	        }
	        System.out.println("es primo");
	        return true;
	    }

}
