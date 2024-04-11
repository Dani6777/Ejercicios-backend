package cl.sence.daniel;

import cl.sence.daniel.poo.CuentaBancaria;
import cl.sence.daniel.poo.JavaRobot;

public class Main {
    public static void main(String[] args) {

        CuentaBancaria dm = new CuentaBancaria("miCuenta","peso","corriente");
        JavaRobot robot = new JavaRobot("MR ROBOT");

        robot.saludar();
        System.out.println(dm);
    }



}