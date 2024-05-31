package cl.sence.daniel.datos;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Variables {

    private static final Logger logger = Logger.getLogger(Variables.class.getName());

    /*
     * TIPOS DE VARIABLES
     * Variables de instancia: Son variables que pertenecen a una instancia de una clase.
     * Variables de clase: Son variables que pertenecen a la clase y no a una instancia de la clase.
     * Variables locales: Son variables declaradas dentro de un método, constructor o bloque.
     * Variables de parámetro: Son variables que se pasan a un método.
     * Variables primitivas: Son variables que almacenan valores primitivos.
     * Variables de referencia: Son variables que almacenan referencias a objetos.
     */

    /*
    TIPOS DE DATOS ENTEROS:
    + byte: 8 bits, rango de -128 a 127
    + short: 16 bits, rango de -32,768 a 32,767
    + int: 32 bits, rango de -2,147,483,648 a 2,147,483,647
    + long: 64 bits, rango de -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807
     */
    static int number = 10; // Variable int
    static float decimal = 10.5f; // Variable float
    static double bigDecimal = 10.5; // Variable double
    static long bigNumber = 1000000000L; // Variable long

    /*
    TIPOS DE DATOS DE CARÁCTER
    + char: 16 bits, rango de 0 a 65,535
     */
    char character = 'A'; // Variable char

    /*
    TIPOS DE DATOS BOOLEANOS
     */
    boolean flag = true; // Variable boolean
    boolean flag2 = false; // Variable boolean

    /*
    TIPOS DE DATOS DE CADENA
     */
    String name = "Daniel"; // Variable String
    String lastName = "Soto"; // Variable String

    /** Variable constante. */
    public static final int CONSTANT_VARIABLE = 100;

    /** Variable de instancia. */
    private String instanceVariable;

    /** Variable de clase (estática). */
    private static String classVariable;

    /** Variable local. */
    public void demonstrateLocalVariable() {
        int localVariable = 10; // Variable local
        if (logger.isLoggable(Level.INFO)) {
            logger.info("Variable local: " + localVariable);
        }
    }

    /** Constructor para inicializar la variable de instancia. */
    public Variables(String instanceVariable) {
        this.instanceVariable = instanceVariable;
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
        Variables funny = new Variables("Valor de la Variable de Instancia");
        funny.demonstrateLocalVariable();

        // Accediendo a la variable de instancia
        if (logger.isLoggable(Level.INFO)) {
            logger.info("Variable de instancia: " + funny.getInstanceVariable());
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
    }
}
