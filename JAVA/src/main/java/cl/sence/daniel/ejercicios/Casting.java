package cl.sence.daniel.ejercicios;

public class Casting {
    public static void main(String[] args) {
        double d = 35.25;
        double dd = 35.99;

        // convertir un double d a un int
        int i = (int) d;

        // convertir un double dd a un int
        int ii = (int) dd;
        System.out.println(i);
        System.out.println(ii);

        // casting implicito
        int a = 35;
        float b = a;
        System.out.println("El valor de b es: " + b);
    }
}
