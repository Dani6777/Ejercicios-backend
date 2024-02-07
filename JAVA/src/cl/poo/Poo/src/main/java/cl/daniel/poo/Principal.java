
package cl.daniel.poo;



public class Principal {

    public static void main(String[] args) {
        
        Auto mercedes = new Auto();
        
        // el estado del objeto inical
       //  System.out.println("el estado inicial del objeto es :"+ " "+mercedes.color);
        
        mercedes.color = "amarillo";
        mercedes.conAire = true;
        mercedes.kms = 100;
        mercedes.patente = "djf22";
        
        //el estado del objeto despues de establecer atributos
        //System.out.println(mercedes);
        
        
        CuentaBancaria dm = new CuentaBancaria();
        
        dm.cmu = "3234k4j3lf";
        dm.alias = "miCuenta";
        dm.mostrarDatos();
        
        System.out.println(dm.obtenerSaldo());
        dm.depositar(300);
        System.out.println(dm.obtenerSaldo());
        
    }
}
