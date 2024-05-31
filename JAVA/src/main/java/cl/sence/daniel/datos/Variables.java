package cl.sence.daniel.datos;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Variables {

    private static final Logger logger = Logger.getLogger(Variables.class.getName());

    /**
     * DATO IMPORTANTE:
     * Las variables son contenedores que almacenan valores. En Java, todas las variables deben ser declaradas antes de que se puedan utilizar.
      * La sintaxis para declarar una variable es: tipo nombreVariable = valor
     * Donde:
     * + tipo: Es el tipo de dato de la variable.
     * + nombreVariable: Es el nombre de la variable.
     * + valor: Es el valor de la variable.
     */

    /**
     * DATO INTERESANTE:
     * JAVA es un lenguaje de programación orientado a objetos, por lo que lo que TO -DO  en Java es un objeto.
     * En Java, los objetos se crean a partir de clases.
     * Una clase es un modelo que define las variables y los métodos que un objeto puede tener.
     * Una variable es una instancia de una clase.
     * Una variable de instancia es una variable que pertenece a una instancia de una clase.
     * String es una clase en Java que se utiliza para representar cadenas de texto. Al ser una clase, se puede crear una instancia de la clase String.
     * String, al igual que todas las clases en Java, tiene atributos y métodos, por eso se puede acceder a los métodos de la clase String.
     */

    /**
     * TIPOS DE VARIABLES:
     * - Variables de instancia: Son variables que pertenecen a una instancia de una clase.
     * - Variables de clase: Son variables que pertenecen a la clase y no a una instancia de la clase.
     * - Variables locales: Son variables declaradas dentro de un método, constructor o bloque.
     * - Variables de parámetro: Son variables que se pasan a un método.
     * - Variables primitivas: Son variables que almacenan valores primitivos.
     * - Variables de referencia: Son variables que almacenan referencias a objetos.
     */

    /**
     * TIPOS DE DATOS ENTEROS:
     * + byte: 8 bits, rango de -128 a 127
     * + short: 16 bits, rango de -32,768 a 32,767
     * + int: 32 bits, rango de -2,147,483,648 a 2,147,483,647
     * + long: 64 bits, rango de -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807
     */
    static int number = 10; // Variable int
    static float decimal = 10.5f; // Variable float
    static double bigDecimal = 10.5; // Variable double
    static long bigNumber = 1000000000L; // Variable long

    /**
     * TIPOS DE DATOS DE CARÁCTER:
     * + char: 16 bits, rango de 0 a 65,535
     */
    char character = 'A'; // Variable char

    /**
     * TIPOS DE DATOS BOOLEANOS:
     */
    boolean flag = true; // Variable boolean
    boolean flag2 = false; // Variable boolean

    /**
     * TIPOS DE DATOS DE CADENA:
     */
    String name = "Daniel"; // Variable String
    String lastName = "Soto"; // Variable String

    // Variables String con valores asignados correctamente
    String istMyLife = "It's My Life, but it's now or never, I ain't gonna live forever";
    String holdTheLine = "Hold the line, love isn't always on time, oh oh oh, hold the line, love isn't always on time, oh oh oh";
    String iWantToBreakFree = "I want to break free, I want to break free, I want to break free from your lies, you're so self satisfied I don't need you";
    String message = "       Hello World        ";

    // Operaciones con la variable de tipo String
    int longitud = istMyLife.length(); // Longitud de la cadena
    int indice = istMyLife.indexOf("Life"); // Índice de la palabra "Life"
    char getCharacter = istMyLife.charAt(0); // Carácter en la posición 0
    String subString = holdTheLine.substring(0, 4); // Subcadena desde la posición 0 hasta la 4
    String minusculas = holdTheLine.toLowerCase(); // Cadena en minúsculas
    String mayusculas = holdTheLine.toUpperCase(); // Cadena en mayúsculas
    String reemplazo = iWantToBreakFree.replace("free", "libre"); // Reemplazo de "free"
    String sinEspacios = message.trim(); // Elimina los espacios en blanco al inicio y al final
    boolean contiene = iWantToBreakFree.contains("hamburguesa"); // Contiene la palabra "hamburguesa"

    /** Variable constante. */
    public static final int CONSTANT_VARIABLE = 100;

    /** Variable de instancia. */
    private String instanceVariable;

    /** Variable de clase (estática). */
    private static String classVariable;

    /** Constructor para inicializar la variable de instancia. */
    public Variables(String instanceVariable) {
        this.instanceVariable = instanceVariable;
    }

    /** Método que demuestra una variable local. */
    public void demonstrateLocalVariable() {
        int localVariable = 10; // Variable local
        if (logger.isLoggable(Level.INFO)) {
            logger.info("Variable local: " + localVariable);
        }
    }

    /** Obtiene la variable de instancia. */
    public String getInstanceVariable() {
        return instanceVariable;
    }

    /** Establece la variable de instancia. */
    public void setInstanceVariable(String instanceVariable) {
        this.instanceVariable = instanceVariable;
    }

    /** Obtiene la variable de clase. */
    public static String getClassVariable() {
        return classVariable;
    }

    /** Establece la variable de clase. */
    public static void setClassVariable(String classVariable) {
        Variables.classVariable = classVariable;
    }

    public static void main(String[] args) {
        if (logger.isLoggable(Level.INFO)) {
            logger.info("Número: " + number);
            logger.info("Decimal: " + decimal);
            logger.info("Gran Decimal: " + bigDecimal);
            logger.info("Gran Número: " + bigNumber);
        }

        // Demostrando variable local
        Variables localVar = new Variables("Valor de la Variable de Instancia");
        localVar.demonstrateLocalVariable();

        // Accediendo a la variable de instancia
        if (logger.isLoggable(Level.INFO)) {
            logger.info("Variable de instancia: " + localVar.getInstanceVariable());
        }

        // Estableciendo y obteniendo la variable de clase
        Variables.setClassVariable("Valor de la Variable de Clase");
        if (logger.isLoggable(Level.INFO)) {
            logger.info("Variable de clase: " + Variables.getClassVariable());
        }

        // Accediendo a la variable constante
        if (logger.isLoggable(Level.INFO)) {
            logger.info("Variable constante: " + Variables.CONSTANT_VARIABLE);
        }

        // Accediendo a otras variables no utilizadas previamente
        Variables example = new Variables("Ejemplo");
        if (logger.isLoggable(Level.INFO)) {
            logger.info("Character: " + example.character);
            logger.info("Flag: " + example.flag);
            logger.info("Flag2: " + example.flag2);
            logger.info("Name: " + example.name);
            logger.info("Last Name: " + example.lastName);
            logger.info("Longitud: " + example.longitud);
            logger.info("Índice: " + example.indice);
            logger.info("Primer carácter: " + example.getCharacter);
            logger.info("Subcadena: " + example.subString);
            logger.info("Minusculas: " + example.minusculas);
            logger.info("Mayusculas: " + example.mayusculas);
            logger.info("Reemplazo: " + example.reemplazo);
            logger.info("Contiene 'hamburguesa': " + example.contiene);
            logger.info("Sin espacios: " + example.sinEspacios);
        }

        // Llamando métodos setter y getter
        localVar.setInstanceVariable("Nuevo Valor de Instancia");
        if (logger.isLoggable(Level.INFO)) {
            logger.info("Nuevo valor de instancia: " + localVar.getInstanceVariable());
        }

        Variables.setClassVariable("Nuevo Valor de Clase");
        if (logger.isLoggable(Level.INFO)) {
            logger.info("Nuevo valor de clase: " + Variables.getClassVariable());
        }
    }
}
