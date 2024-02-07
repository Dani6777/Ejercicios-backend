
package cl.daniel.poo;


public class CuentaBancaria {
    
    String cmu;
    
    String alias;
    
    double saldo;
    
    
    void mostrarDatos(){
        System.out.println(cmu + " "+ alias + " "+ saldo); 
    }
    
    
   double obtenerSaldo(){
       return saldo;
    }
   
    void depositar(double monto){
        if(monto > 0){
            saldo += monto;
        }else{
             System.out.println("ingrese un monto valido");
        }  
    }
}
