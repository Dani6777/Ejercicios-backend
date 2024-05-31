package cl.sence.daniel.ejercicios;

import java.util.Scanner;

public class SistemaVentasBoletos {

    private static int nFilas;
    private static int mColumnas;
    private static double precioAsiento = 19500.0; // Precio predeterminado
    private static String[][] matrizAsientos;
    private static double totalVentas = 0.0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al sistema de ventas de boletos de autobús.");
        System.out.println("Por favor, ingrese el número de filas del autobús:");
        nFilas = scanner.nextInt();
        System.out.println("Por favor, ingrese el número de columnas del autobús:");
        mColumnas = scanner.nextInt();

        inicializarMatriz();

        mostrarMatriz();

        char opcion;
        do {
            System.out.println("¿Desea comprar un boleto? (S/N)");
            opcion = scanner.next().charAt(0);
            if (opcion == 'S' || opcion == 's') {
                comprarBoleto(scanner);
            }
        } while (opcion == 'S' || opcion == 's');

        System.out.println("Gracias por utilizar nuestro sistema de ventas.");
        System.out.println("Total de ventas: $" + totalVentas);
    }

    private static void inicializarMatriz() {

        matrizAsientos = new String[nFilas][mColumnas];

            int numeroAsiento = 1;

        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < mColumnas; j++) {
                matrizAsientos[i][j] = String.valueOf(numeroAsiento); // Convertir número de asiento a String
                numeroAsiento++;
            }
        }
    }

    private static void mostrarMatriz() {

        System.out.println("Matriz de asientos:");
        
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < mColumnas; j++) {
                System.out.print(matrizAsientos[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void comprarBoleto(Scanner scanner) {

        System.out.println("Ingrese el número del asiento que desea comprar:");

        int numeroAsiento = scanner.nextInt();
        int fila = (numeroAsiento - 1) / mColumnas;
        int columna = (numeroAsiento - 1) % mColumnas;

        if (numeroAsiento < 1 || numeroAsiento > nFilas * mColumnas) {
            System.out.println("Número de asiento inválido.");
            return;
        }
        if ("X".equals(matrizAsientos[fila][columna])) {
            System.out.println("El asiento seleccionado ya está ocupado.");
            return;
        }
        matrizAsientos[fila][columna] = "X"; // Marcar asiento como ocupado
        totalVentas += precioAsiento; // Sumar al total de ventas
        System.out.println("¡Compra realizada con éxito!");
        System.out.println("Total de ventas acumulado: $" + totalVentas);
        mostrarMatriz();
    }
}
