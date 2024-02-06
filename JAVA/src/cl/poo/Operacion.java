package cl.poo;

import javax.swing.JOptionPane;

public class Operacion {
	
	// Atributos
	int numero1;
	int numero2;
	int suma;
	int resta;
	int multiplicacion;
	int division;
	
	// Métodos
	
	// Método para pedir al usuario los números
	public void leerNumeros() {
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL PRIMER NUMERO"));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL SEGUNDO NUMERO"));
	}
	
	public void sumar() {
		suma = numero1 + numero2;
	}
	
	public void restar() {
		resta = numero1 - numero2;
	}
	
	public void dividir() {
		// Se asume que la división es entre enteros, por lo que el resultado también será un entero.
		division = numero1 / numero2;
	}
	
	public void multiplicar() {
		multiplicacion = numero1 * numero2;
	}
	
	public void mostrarResultados() {
		System.out.println("La suma es: " + suma);
		System.out.println("La resta es: " + resta);
		System.out.println("La multiplicación es: " + multiplicacion);
		System.out.println("La división es: " + division);
	}
	
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
