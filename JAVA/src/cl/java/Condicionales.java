package cl.java;

import javax.swing.JOptionPane;

public class Condicionales {
	
	 public static void main(String[] args) {

	        int numero;

	        // int dato = 5;
	        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
	        /*
	         * if (numero != dato) {
	         * JOptionPane.showMessageDialog(null, "El numero es diferente de 5");
	         * } else {
	         * JOptionPane.showMessageDialog(null, "El numero es  5");
	         * }
	         */
	        switch (numero) {
	            case 1:
	                JOptionPane.showMessageDialog(null, "El numero es  1");
	                break;
	            case 2:
	                JOptionPane.showMessageDialog(null, "El numero es  2");
	                break;
	            case 3:
	                JOptionPane.showMessageDialog(null, "El numero es  3");
	                break;
	            case 4:
	                JOptionPane.showMessageDialog(null, "El numero es  4");
	            default:
	                JOptionPane.showMessageDialog(null, "N/A");
	        }
	    }

}
