import cl.sence.daniel.ejercicios.Pitagoras;
import org.jetbrains.annotations.TestOnly;



public class PitagorasTest {

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {


        Pitagoras pruebaPitagoras = new Pitagoras();

        double resultado = pruebaPitagoras.calcularHipotenusa(5, 6);

        System.out.println("la hipotenusa es: "+ resultado);


    }
}
