package cl.sence.daniel.datos;

public class Variables {

    /** The my variable. */
    // Declaración e inicialización de una variable de tipo String
    String myVariable = "Hola mundo";

    /**
     * The main method.
     *
     * @param args the arguments
     */
    // Método principal
    public static void main(String[] args) {

        // Crear una instancia de la clase Suma y llamar a su método main
        Suma sumaInstance = new Variables().new Suma();
        sumaInstance.sumaMain();
    }

    /**
     * The Class Suma.
     */
    // Clase anidada llamada Suma
    public class Suma {

        /**
         * Suma main.
         */
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
