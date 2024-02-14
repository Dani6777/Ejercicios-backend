
package cl.daniel.poo;

public class JavaRobot {

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        if (nombre != null) {
            this.nombre = nombre;
        }
    }

    // constructor por defecto
    public JavaRobot() {
    }

    // sobre carga del metodo constructor
    public JavaRobot(String nombre) {
        setNombre(nombre);
    }

    public void saludar(String nombrePersona) {
        System.out.println("Hola " + nombrePersona + ", soy " + nombre);

    }

    // sobre carga del metodo
    public void saludar() {
        saludar("EXTRAÑO");
    }

    public void mover(int pasos) {
        System.out.println("Me movi " + pasos + " pasos");
    }

}
