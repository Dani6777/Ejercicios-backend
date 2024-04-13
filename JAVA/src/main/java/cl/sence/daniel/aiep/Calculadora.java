package cl.sence.daniel.aiep;

public class Calculadora {

    public  static void main(String[] args) {
        System.out.println("Suma: " + sumar(5, 3));
        System.out.println("Resta: " + restar(5, 3));
        System.out.println("Multiplicación: " + multiplicar(5, 3));
        System.out.println("División: " + dividir(5, 3));
    }

    public static int sumar(int num1, int num2){
        return num1 + num2;
    }

    public static int restar(int num1, int num2){
        return num1 - num2;
    }

    public static int multiplicar(int num1, int num2){
        return num1 * num2;
    }
    public static int dividir(int num1, int num2){
        if (num2 == 0){
            System.out.println("No se puede dividir por 0");
            return 0;
        }else {
            return num1 / num2;
        }
    }
}
