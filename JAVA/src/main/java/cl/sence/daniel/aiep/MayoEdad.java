package cl.sence.daniel.aiep;

import java.util.Scanner;

public class MayoEdad {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su edad: ");

        while(!sc.hasNextInt()){
            System.out.println("Ingrese un número valido: ");
            sc.next();
        }
        int edad = sc.nextInt();

        if(edad >= 18){
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("Eres menor de edad");
        }

    }

}