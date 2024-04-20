package cl.freelance;

public class TarjetaDeCredito extends FormaDePago{

    private int cuotas;

    public TarjetaDeCredito(int cuotas) {
        this.cuotas = cuotas;
    }

    @Override
    public void realizarPago() {
        super.realizarPago();
        System.out.println("Pagando con tarjeta de crédito en " + cuotas + " cuotas.");
    }
}
