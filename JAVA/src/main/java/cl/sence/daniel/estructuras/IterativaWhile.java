package cl.sence.daniel.estructuras;

import java.util.logging.Logger;

public class IterativaWhile {

    private static final Logger logger = Logger.getLogger(IterativaWhile.class.getName());

    public static void main(String[] args) {

        // Inicializa el contador en 1
        int contador = 1;

        // Itera mientras el contador sea menor o igual a 5
        while(contador <= 5){
            // Registra el valor actual del contador
            logger.info("contador: " + contador);
            // Incrementa el contador en 1 para la próxima iteración
            contador++;
        }
    }
}
