package cl.ejercicios;

public class Pitagoras {
	
	public double calcularHipotenusa(int catetoA, int catetoB) {
		
		double sumaCuadrados = Math.pow(catetoA,2) +  Math.pow(catetoB,2);
		
		double c =  Math.sqrt(sumaCuadrados);
		
		return c;
	}
}
