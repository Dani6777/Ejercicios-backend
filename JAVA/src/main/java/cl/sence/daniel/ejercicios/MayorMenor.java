package cl.sence.daniel.ejercicios;

import java.util.Scanner;

public class MayorMenor {

    private int valor1;
    private int valor2;
    private int valor3;

    // Método para ingresar los valores por teclado
    public void ingresarValores() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer valor:");
        valor1 = scanner.nextInt();
        System.out.println("Ingrese el segundo valor:");
        valor2 = scanner.nextInt();
        System.out.println("Ingrese el tercer valor:");
        valor3 = scanner.nextInt();
    }

    // Método para encontrar el valor mayor
    public int encontrarMayor() {
        return Math.max(Math.max(valor1, valor2), valor3);
    }

    // Método para encontrar el valor menor
    public int encontrarMenor() {
        return Math.min(Math.min(valor1, valor2), valor3);
    }

    public static void main(String[] args) {
        MayorMenor mm = new MayorMenor();
        mm.ingresarValores();
        int mayor = mm.encontrarMayor();
        int menor = mm.encontrarMenor();
        System.out.println("El mayor valor es: " + mayor);
        System.out.println("El menor valor es: " + menor);
    }
    
}
