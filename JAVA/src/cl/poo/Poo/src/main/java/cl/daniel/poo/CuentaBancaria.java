
package cl.daniel.poo;


public class CuentaBancaria {
    
    private String cmu;
    
     private String alias;
    
    private double saldo;
    
    private String moneda;
    
    private String tipo;
    
    
    public void mostrarDatos(){
       
        System.out.println(cmu + " "+ alias + " "+ saldo); 
    }
    
    
   public double getSaldo(){
       return saldo;
    }
   
   public String getALias(){
   return alias;
     }
   
   public void setAlias(String nuevoALias){
       if(nuevoALias != null){
       alias = nuevoALias;
       }
   }
   
   public void setMoneda(String moneda){
       if(moneda != null){
       this.moneda = moneda;
       }
   }
   
   public void setTipo(String tipo){
       if(tipo != null){
           this.tipo = tipo;
       }
   }
   
   
   
   public void depositar(double monto){
        if(monto > 0){
            saldo += monto;
        }else{
             System.out.println("ingrese un monto valido");
        }  
    }
    
    public boolean saldoDisponible(double monto){ 
         return saldo >= monto;
    }
     
     private void extraer(double monto){
         
         if(saldoDisponible(monto)){
         saldo -=monto;
         }
     } 
}
