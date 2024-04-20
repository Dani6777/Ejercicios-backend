package cl.freelance;

public class Billetera {
    private FormaDePago metodoPago;

    public Billetera(FormaDePago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public void pagar() {
        metodoPago.realizarPago();
    }
}
