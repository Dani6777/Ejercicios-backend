package cl.freelance;

public class Moneda extends FormaDePago{
    private String tipoMoneda;

    public Moneda(String tipoMoneda) {
        this.tipoMoneda = tipoMoneda;
    }

    // Sobrescribir método realizarPago
    public void realizarPago() {
        super.realizarPago();
        System.out.println("Pagando con moneda " + tipoMoneda + ".");
    }
}
