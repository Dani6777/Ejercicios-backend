package cl.sence.daniel.ejercicios;

import java.util.Scanner;

public class CalculadoraImpuestos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el sueldo bruto del trabajador:");
        double sueldoBruto = scanner.nextDouble();

        double impuesto = calcularImpuesto(sueldoBruto);
        double sueldoNeto = sueldoBruto - impuesto;

        System.out.println("Sueldo neto: " + sueldoNeto);
        System.out.println("Impuesto a pagar: " + impuesto);
    }

    public static double calcularImpuesto(double sueldoBruto) {
        if (sueldoBruto < 10000) {
            return 0;
        } else if (sueldoBruto >= 10000 && sueldoBruto <= 30000) {
            return sueldoBruto * 0.10;
        } else if (sueldoBruto > 30000 && sueldoBruto <= 50000) {
            return sueldoBruto * 0.20;
        } else {
            return sueldoBruto * 0.35;
        }
    }
}
