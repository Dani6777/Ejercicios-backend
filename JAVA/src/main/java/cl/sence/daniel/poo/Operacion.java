package cl.sence.daniel.poo;

import javax.swing.*;

public class Operacion {
    /** The numero 1. */
    // Atributos
    int numero1;

    /** The numero 2. */
    int numero2;

    /** The suma. */
    int suma;

    /** The resta. */
    int resta;

    /** The multiplicacion. */
    int multiplicacion;

    /** The division. */
    int division;

    // Métodos

    /**
     * Leer numeros.
     */
    // Método para pedir al usuario los números
    public void leerNumeros() {
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL PRIMER NUMERO"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL SEGUNDO NUMERO"));
    }

    /**
     * Sumar.
     */
    public void sumar() {
        suma = numero1 + numero2;
    }

    /**
     * Restar.
     */
    public void restar() {
        resta = numero1 - numero2;
    }

    /**
     * Dividir.
     */
    public void dividir() {
        // Se asume que la división es entre enteros, por lo que el resultado también será un entero.
        division = numero1 / numero2;
    }

    /**
     * Multiplicar.
     */
    public void multiplicar() {
        multiplicacion = numero1 * numero2;
    }

    /**
     * Mostrar resultados.
     */
    public void mostrarResultados() {
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + multiplicacion);
        System.out.println("La división es: " + division);
    }

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        Operacion op = new Operacion();

        op.leerNumeros();
        op.sumar();
        op.restar();
        op.multiplicar();
        op.dividir();
        op.mostrarResultados();
    }
}
