package cl.sence.daniel.ejercicios;

import java.util.Scanner;
import java.util.logging.Logger;

public class MaquinaBebidas {

    private static final Logger logger = Logger.getLogger(MaquinaBebidas.class.getName());

    public static void main(String[] args) {

        // Se muestra el menú de opciones al usuario
        mostrarMenu();

        // Se lee la opción seleccionada por el usuario
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        // Se llama al método para procesar la opción seleccionada
        bebidaFavorita(opcion);

        // Se cierra el Scanner para liberar recursos
        scanner.close();
    }

    /**
     * Muestra el menú de opciones de bebidas al usuario.
     */
    public static void mostrarMenu() {
        logger.info("Bienvenido a la máquina de bebidas");
        logger.info("Seleccione una opción:");
        logger.info("1. Cerveza");
        logger.info("2. Vino");
        logger.info("3. Pisco");
        logger.info("4. Ron");
        logger.info("5. Whisky");
    }

    /**
     * Muestra un mensaje sobre la bebida favorita dependiendo de la opción seleccionada.
     *
     * @param opcion La opción seleccionada por el usuario.
     */
    public static void bebidaFavorita(int opcion) {
        switch (opcion) {
            case 1:
                logger.info("Cerveza, la mejor opción para el verano");
                break;
            case 2:
                logger.info("Vino, ideal para acompañar una buena comida");
                break;
            case 3:
                logger.info("Pisco, el destilado nacional");
                break;
            case 4:
                logger.info("Ron, perfecto para una fiesta en la playa");
                break;
            case 5:
                logger.info("Whisky, para los amantes de los sabores intensos");
                break;
            default:
                logger.info("Opción no reconocida");
        }
    }
}
