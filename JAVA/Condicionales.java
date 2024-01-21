import javax.swing.JOptionPane;

public class Condicionales {

    public static void main(String[] args) {

        int numero;
        int dato = 5;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));

        if (numero != dato) {
            JOptionPane.showMessageDialog(null, "El numero es diferente de 5");
        } else {
            JOptionPane.showMessageDialog(null, "El numero es  5");
        }
    }
}