package cl.sence.daniel.ejercicios;

import java.util.Scanner;

public class PromedioAsignatura {


    public static void main(String[] args) {
        // Crear un objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Definir las asignaturas
        String[] subjects = {"Matemáticas", "Ciencias", "Historia", "Literatura", "Arte"};

        // Definir matriz para almacenar las notas
        double[][] grades = new double[5][5];

        // Solicitar y almacenar las notas
        for (int i = 0; i < subjects.length; i++) {
            // Solicitar las notas
            System.out.println("Ingrese 5 notas para la asignatura " + subjects[i] + ":");
            for (int j = 0; j < 5; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                grades[i][j] = scanner.nextDouble();
            }
        }

        // Calcular promedios por asignatura
        double[] subjectAverages = new double[5];
        for (int i = 0; i < subjects.length; i++) {
            double sum = 0;
            for (int j = 0; j < 5; j++) {
                sum += grades[i][j];
            }
            subjectAverages[i] = sum / 5;
        }

        // Calcular promedio general
        double overallAverage = 0;
        for (double subjectAverage : subjectAverages) {
            overallAverage += subjectAverage;
        }
        overallAverage /= subjects.length;

        // Clasificar rendimiento
        String performanceCategory;

        if (overallAverage >= 9) {
            performanceCategory = "Sobresaliente";
        } else if (overallAverage >= 8) {
            performanceCategory = "Notable";
        } else if (overallAverage >= 7) {
            performanceCategory = "Bueno";
        } else if (overallAverage >= 5) {
            performanceCategory = "Suficiente";
        } else {
            performanceCategory = "Insuficiente";
        }

        // Imprimir resultados
        System.out.println("\n--- Resultados ---");
        for (int i = 0; i < subjects.length; i++) {
            System.out.println("Promedio en " + subjects[i] + ": " + String.format("%.2f", subjectAverages[i]));
        }
        System.out.println("\nPromedio general: " + String.format("%.2f", overallAverage));
        System.out.println("Clasificación del rendimiento: " + performanceCategory);

        // Cerrar el scanner
        scanner.close();
    }
}
