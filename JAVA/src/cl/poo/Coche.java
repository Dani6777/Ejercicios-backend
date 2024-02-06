package cl.poo;

public class Coche {
	
	//atributos
	
	String color;
	
	String marca;
	
	int km;
	
	public static void main(String[] args) {
		
		//se crea un objeto con una instancia de la clase Coche
		Coche mercedes = new Coche();
		
		//se insertan los atributos al objeto
		mercedes.color = "Azul";
		mercedes.marca = "R8";
		mercedes.km = 0;
		
		System.out.println("color: "+ mercedes.color);
		System.out.println("marca: "+ mercedes.marca);
		System.out.println("km: "+ mercedes.km);
		
	}
}
