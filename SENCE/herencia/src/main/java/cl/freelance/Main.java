package cl.freelance;

public class Main {
    public static void main(String[] args) {
        // Crear instancia de Billetera con TarjetaDeCredito
        TarjetaDeCredito tarjeta = new TarjetaDeCredito(3);
        Billetera billeteraConTarjeta = new Billetera(tarjeta);
        billeteraConTarjeta.pagar(); // Realizando pago... Pagando con tarjeta de crédito en 3 cuotas.

        // Crear instancia de Billetera con Moneda
        Moneda moneda = new Moneda("USD");
        Billetera billeteraConMoneda = new Billetera(moneda);
        billeteraConMoneda.pagar(); // Realizando pago... Pagando con moneda USD.
    }
}