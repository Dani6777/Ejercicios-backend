package cl.sence.daniel.datos;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Operadores {

    private static final Logger logger = Logger.getLogger(Operadores.class.getName());

    /**
     * Método principal que demuestra diferentes operaciones aritméticas y lógicas.
     *
     * @param args Argumentos de línea de comandos (no utilizado en este caso).
     */

    /**
     * DATOS IMPORTANTES
     *  el simbolo '=' es un operador de asignación, el cual asigna el valor de la derecha a la variable de la izquierda,
     * a direrencia del lenguaje natural, en programación el simbolo = no es un operador de igualdad.
     * el  operados de igualdad en programación  es ==.
     * y en pseduocodigo es <- .
     */
    public static void main(String[] args) {
        Operadores operadores = new Operadores();

        double a = 5;
        double b = 6;

        operadores.suma(a, b);
        operadores.resta(a, b);
        operadores.multiplicacion(a, b);
        operadores.division(a, b);
        operadores.modulo(a, b);
        operadores.incrementoDecremento();
        operadores.comparacion(a, b);
        operadores.logicos(a, b);

        double c = 100;
        c += 5; // c = c + 5
        c -= 5; // c = c - 5
        c *= 5; // c = c * 5
        c /= 5; // c = c / 5
        c %= 5; // c = c % 5
        c++; // c = c + 1
        c--; // c = c - 1

        if (logger.isLoggable(Level.INFO)) {
            logger.info("c después de operadores de asignación especiales: " + c);
        }
    }

    /**
     * Realiza la operación de suma entre dos números enteros.
     *
     * @param a Primer número entero.
     * @param b Segundo número entero.
     */
    public void suma(double a, double b) {
        double c = a + b;
        if (logger.isLoggable(Level.INFO)) {
            logger.info("Suma: " + c);
        }
    }

    /**
     * Realiza la operación de resta entre dos números enteros.
     *
     * @param a Primer número entero (minuendo).
     * @param b Segundo número entero (sustraendo).
     */
    public void resta(double a, double b) {
        double d = a - b;
        if (logger.isLoggable(Level.INFO)) {
            logger.info("Resta: " + d);
        }
    }

    /**
     * Realiza la operación de multiplicación entre dos números enteros.
     *
     * @param a Primer número entero.
     * @param b Segundo número entero.
     */
    public void multiplicacion(double a, double b) {
        double e = a * b;
        if (logger.isLoggable(Level.INFO)) {
            logger.info("Multiplicación: " + e);
        }
    }

    /**
     * Realiza la operación de división entre dos números enteros.
     *
     * @param a Dividendo.
     * @param b Divisor.
     */
    public void division(double a, double b) {
        double f = a / b;
        if (logger.isLoggable(Level.INFO)) {
            logger.info("División: " + f);
        }
    }
    /**
     * Realiza la operación de módulo entre dos números enteros.
     *
     * @param a Número entero (dividendo).
     * @param b Número entero (divisor).
     */
    public void modulo(double a, double b) {
        double g = a % b;
        if (logger.isLoggable(Level.INFO)) {
            logger.info("Módulo: " + g);
        }
    }
    /**
     * Realiza ejemplos de incremento y decremento.
     */
    public void incrementoDecremento() {
        int x = 10;
        x += 5;
        if (logger.isLoggable(Level.INFO)) {
            logger.info("x después de +=: " + x);
        }
        int y = 20;
        y++;
        if (logger.isLoggable(Level.INFO)) {
            logger.info("y después de incremento (++): " + y);
        }
        int z = 30;
        z--;
        if (logger.isLoggable(Level.INFO)) {
            logger.info("z después de decremento (--): " + z);
        }
    }
    /**
     * Realiza ejemplos de operadores de comparación.
     *
     * @param a Primer número entero a comparar.
     * @param b Segundo número entero a comparar.
     */
    public void comparacion(double a, double b) {
        boolean esIgual = (a == b); // Operador de igualdad
        boolean esDistinnto = (a != b); // Operador de desigualdad
        boolean esMenor = (a < b); // Operador de menor que
        boolean esMenorIgual = (a <= b); // Operador de menor o igual que
        boolean esMayor = (a > b); // Operador de mayor que
        boolean esMayorIgual = (a >= b); // Operador de mayor o igual que

        if (logger.isLoggable(Level.INFO)) {
            logger.info("a == b: " + esIgual); //resultado de la operación de igualdad es verdadero si ambos operandos son iguales
            logger.info("a != b: " + esDistinnto); //resultado de la operación de desigualdad es verdadero si ambos operandos son diferentes
            logger.info("a < b: " + esMenor); //resultado de la operación de menor que es verdadero si el primer operando es menor que el segundo
            logger.info("a <= b: " + esMenorIgual); //resultado de la operación de menor o igual que es verdadero si el primer operando es menor o igual que el segundo
            logger.info("a > b: " + esMayor); //resultado de la operación de mayor que es verdadero si el primer operando es mayor que el segundo
            logger.info("a >= b: " + esMayorIgual); //resultado de la operación de mayor o igual que es verdadero si el primer operando es mayor o igual que el segundo
        }
    }
    /**
     * Realiza ejemplos de operadores lógicos.
     *
     * @param a Primer número entero.
     * @param b Segundo número entero.
     */
    public void logicos(double a, double b) {
        boolean resultadoAND = (a < 10) && (b > 5); // Operador AND
        boolean resultadoOR = (a > 10) || (b < 5); // Operador OR
        boolean resultadoNOT = (a <= b); // Operador NOT

        /**
         * Tabla de verdad de los operadores lógicos
         * -----------------------------------------
         * Operador | Tabla de verdad
         * Enunciado para (&&)
         * Si eres mayor de edad y tienes licencia de conducir, puedes manejar.
         * Si eres mayor de edad y no tienes licencia de conducir, no puedes manejar.
         * Si no eres mayor de edad y tienes licencia de conducir, no puedes manejar.
         * Si no eres mayor de edad y no tienes licencia de conducir, no puedes manejar.
         *
         * AND (&&)
         * a | b | a && b
         * V | V | V
         * V | F | F
         * F | V | F
         * F | F | F
         * ------------
         * Enunciado para (||)
         * Si tienes pasaporte o visa, puedes viajar al extranjero.
         * Si tienes pasaporte o no tienes visa, puedes viajar al extranjero.
         * Si no tienes pasaporte o tienes visa, puedes viajar al extranjero.
         * Si no tienes pasaporte o no tienes visa, no puedes viajar al extranjero.
         * OR (||)
         * a | b | a || b
         * V | V | V
         * V | F | V
         * F | V | V
         * F | F | F
         * ------------
         * Enunciado para (!)
         * Si no tienes licencia de conducir, no puedes manejar.
         * Si tienes licencia de conducir, puedes manejar.
         * NOT (!)
         * a | !a
         * V | F
         * F | V
         * ------------
         */

        if (logger.isLoggable(Level.INFO)) {
            logger.info("(a < 10) && (b > 5): " + resultadoAND); // resultado de la operación AND es verdadero si ambos operandos son verdaderos
            logger.info("(a > 10) || (b < 5): " + resultadoOR); // resultado de la operación OR es verdadero si al menos uno de los operandos es verdadero
            logger.info("!(a < b): " + resultadoNOT); // resultado de la operación NOT es verdadero si el operando es falso
        }
    }
}
