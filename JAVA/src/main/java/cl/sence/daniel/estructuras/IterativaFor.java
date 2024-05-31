package cl.sence.daniel.estructuras;

import java.util.logging.Logger;

public class IterativaFor {

    private static final Logger logger = Logger.getLogger(IterativaFor.class.getName());

    public static void main(String[] args) {

            mostrarNumeros();
    }

    /**
     * Muestra los números del 1 al 10 y del 1 al 5 utilizando un bucle for.
     */
    public static void mostrarNumeros() {
        // Declara la variable j fuera del bucle
        int j;
        /**
         * Utiliza un bucle for para iterar del 1 al 10.
         * Dentro de este bucle for, utiliza otro bucle for para iterar del 1 al 5.
         * En cada iteración, registra el valor de i y j.
         */
        for (int i = 1; i <= 10; i++) {
            for (j = 1; j <= 5; j++) {
                logger.info(String.format("i: %d, j: %d", i, j));
            }
        }
    }
}
