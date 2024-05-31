package cl.sence.daniel.estructuras;

import java.util.logging.Logger;

public class Switch {

    private static final Logger logger = Logger.getLogger(Switch.class.getName());

    /**
     * Método principal que demuestra el uso de la estructura switch.
     *
     * @param args Argumentos de línea de comandos (no utilizado en este caso).
     */
    public static void main(String[] args) {

        logger.info("Que tipo de bebida has tomado?");
        String bebida = "cerveza";
        bebidaFavorita(bebida);

        logger.info("Selecciona una opción:");
        int option = 2;
        switchOption(option);
    }

    /**
     * Evalúa la opción seleccionada y muestra un mensaje según el caso.
     *
     * @param option La opción seleccionada.
     */
    public static void switchOption(int option) {
        switch (option) {
            case 1:
                logger.info("Opción 1 seleccionada");
                break;
            case 2:
                logger.info("Opción 2 seleccionada");
                break;
            case 3:
                logger.info("Opción 3 seleccionada");
                break;
            default:
                logger.info("Opción no reconocida");
        }
    }

    /**
     * Evalúa la opción seleccionada y muestra un mensaje según el caso.
     *
     * @param bebida La opción seleccionada.
     *  1. cerveza
     *   2. vino
     *   3. pisco
     *    4. ron
     *     5. whisky
     */
    public static void bebidaFavorita(String bebida){

        switch(bebida){
            case "cerveza":
                logger.info("Cerveza, la mejor opción para el verano");
                break;
            case "vino":
                logger.info("Vino, la mejor opción para una cena romántica");
                break;
            case "pisco":
                logger.info("Pisco, la mejor opción para un terremoto");
                break;
            case "ron":
                logger.info("Ron, la mejor opción para un mojito");
                break;
            case "whisky":
                logger.info("Whisky, la mejor opción para un whisky sour");
                break;
            default:
                logger.info("Puedes conducir tranquilo, no has tomado nada, o al menos no una de las opciones válidas");
        }
    }
}
