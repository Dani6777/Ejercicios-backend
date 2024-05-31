package cl.sence.daniel.estructuras;
import java.util.logging.Logger;

/**
 * Clase que demuestra el uso de condicionales para determinar si una persona es mayor de edad.
 */
public class Condicional {

    private static final Logger logger = Logger.getLogger(Condicional.class.getName());

    /**
     * Método principal que demuestra el uso de condicionales para determinar si una persona es mayor de edad.
     *
     * @param args Argumentos de línea de comandos (no utilizado en este caso).
     */
    public static void main(String[] args) {
        int age = 60;
        esMayorEdad(age);
    }

    /**
     * Determina si una persona es mayor de edad basándose en su edad.
     *
     * @param edad La edad de la persona.
     */
    public static void esMayorEdad(int edad) {

        if (edad >= 60) {
            logger.info("Puedes entrar a la disco, pero no olvides tu bastón");
        } else if (edad > 18) {
            logger.info("Puedes entrar a la disco");
        } else if (edad == 18) {
            logger.info("Tienes la edad justa para entrar a la disco, no olvides tu carnet de identidad");
        } else {
            logger.info("No puedes entrar a la disco");
        }
    }
}
