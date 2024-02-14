package cl.ejercicios;

// TODO: Auto-generated Javadoc
/**
 * The Class Pitagoras.
 */
public class Pitagoras {
	
	/**
	 * Calcular hipotenusa.
	 *
	 * @param catetoA the cateto A
	 * @param catetoB the cateto B
	 * @return the double
	 */
	public double calcularHipotenusa(int catetoA, int catetoB) {
		
		double sumaCuadrados = Math.pow(catetoA,2) +  Math.pow(catetoB,2);
		
		double c =  Math.sqrt(sumaCuadrados);
		
		return c;
	}
}
