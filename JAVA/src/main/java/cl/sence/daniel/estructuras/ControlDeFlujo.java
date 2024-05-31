package cl.sence.daniel.estructuras;

import java.util.logging.Logger;

/**
 * La clase ControlDeFlujo demuestra el uso de estructuras de control de flujo
 * utilizando bucles for junto con las declaraciones break, continue y return.
 */
public class ControlDeFlujo {

    private static final Logger logger = Logger.getLogger(ControlDeFlujo.class.getName());
    private static final int MAX_ITERACIONES = 10;

    /**
     * El método principal que se ejecuta al iniciar el programa.
     *
     * @param args Argumentos de la línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        mostrarIteracionesConBreak();
        mostrarIteracionesConContinue();
        mostrarIteracionesConReturn();
    }

    /**
     * Muestra números del 0 al 9 utilizando un bucle for.
     * El bucle se interrumpe cuando el valor de i es igual a 5.
     */
    public static void mostrarIteracionesConBreak() {
        int b;

        // Bucle for que itera desde 0 hasta MAX_ITERACIONES
        for (b = 0; b < MAX_ITERACIONES; b++) {
            // Loguea el valor actual de i
            if (logger.isLoggable(java.util.logging.Level.INFO)) {
                logger.info(String.format("b = %d", b));
            }
            // Si i es igual a 5, se interrumpe el bucle
            if (b== 5) {
                break;
            }
            // Loguea el valor actual de i después del break
            if (logger.isLoggable(java.util.logging.Level.INFO)) {
                logger.info(String.format("b después del break = %d", b));
            }
        }
    }

    /**
     * Muestra números del 0 al 9 utilizando un bucle for.
     * La iteración actual se salta cuando el valor de i es igual a 5.
     */
    public static void mostrarIteracionesConContinue() {
        int c;

        // Bucle for que itera desde 0 hasta MAX_ITERACIONES
        for (c = 0; c < MAX_ITERACIONES; c++) {
            logger.info(String.format("c = %d", c));
            // Si i es igual a 5, se salta la iteración actual
            if (c== 5) {
                if (logger.isLoggable(java.util.logging.Level.INFO)) {
                    logger.info("Se salta la iteración con c = 5");
                }
                continue;
            }
            // Loguea el valor actual de i
            if (logger.isLoggable(java.util.logging.Level.INFO)) {
                logger.info(String.format("c = %d", c));
            }
        }
    }
    /**
     * Muestra números del 0 al 9 utilizando un bucle for.
     * El método se interrumpe y retorna cuando el valor de i es igual a 5.
     */
    public static void mostrarIteracionesConReturn() {
        int r;

        // Bucle for que itera desde 0 hasta MAX_ITERACIONES
        for (r= 0; r < MAX_ITERACIONES; r++) {
            // Loguea el valor actual de i
            if (logger.isLoggable(java.util.logging.Level.INFO)) {
                logger.info(String.format("r= %d", r));
            }
            // Si i es igual a 5, se interrumpe el método y retorna
            if (r == 5) {
                if (logger.isLoggable(java.util.logging.Level.INFO)) {
                    logger.info("Se interrumpe el método con r = 5");
                }
                return;
            }
        }
    }
}
