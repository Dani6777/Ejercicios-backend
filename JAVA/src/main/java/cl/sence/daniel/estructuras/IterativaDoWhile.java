package cl.sence.daniel.estructuras;

import java.util.logging.Logger;

public class IterativaDoWhile {

    private static final Logger logger = Logger.getLogger(IterativaDoWhile.class.getName());

    public static void main(String[] args) {

        int contador = 1;

        do {
            if (logger.isLoggable(java.util.logging.Level.INFO)) {
                logger.info(String.format("contador: %d", contador));
            }
            contador++;
        } while(contador <= 5);
    }
}
