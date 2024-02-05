package cl.java;

public class Variables {
	 // Declaración e inicialización de una variable de tipo String
    String myVariable = "Hola mundo";

    // Método principal
    public static void main(String[] args) {

        // Crear una instancia de la clase Suma y llamar a su método main
        Suma sumaInstance = new Variables().new Suma();
        sumaInstance.sumaMain();
    }

    // Clase anidada llamada Suma
    public class Suma {

        // El método principal de la clase Suma
        public void sumaMain() {

            // Declaración e inicialización de dos variables de tipo entero
            int num1 = 5;
            int num2 = 2;

            // Declaración de una variable para almacenar el resultado de la suma
            int resultado = 0;

            // Operación de suma
            resultado = num1 + num2;

            // Imprimir el resultado
            System.out.println("resultado: " + resultado);
        }
    }

}
