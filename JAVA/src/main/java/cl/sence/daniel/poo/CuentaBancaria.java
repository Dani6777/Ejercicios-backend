package cl.sence.daniel.poo;

public class CuentaBancaria {
    private String numeroCuenta;
    private String alias;
    private double saldo;
    private String moneda;
    private String tipoCuenta;

    public void mostrarDatos() {
        System.out.println(numeroCuenta + " " + alias + " " + saldo + " " + moneda + " " + tipoCuenta);
    }

    public double getSaldo() {
        return saldo;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String nuevoAlias) {
        if (nuevoAlias != null) {
            alias = nuevoAlias;
        }
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String nuevaMoneda) {
        if (nuevaMoneda != null) {
            this.moneda = nuevaMoneda;
        }
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String nuevoTipoCuenta) {
        if (nuevoTipoCuenta != null) {
            this.tipoCuenta = nuevoTipoCuenta;
        }
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        } else {
            throw new IllegalArgumentException("Ingrese un monto válido");
        }
    }

    public boolean saldoDisponible(double monto) {
        return saldo >= monto;
    }

    private void extraer(double monto) {
        if (saldoDisponible(monto)) {
            saldo -= monto;
        }
    }

    // Constructor con saldo inicial en 0
    public CuentaBancaria(String alias, String moneda, String tipoCuenta) {
        this.alias = alias;
        this.moneda = moneda;
        this.tipoCuenta = tipoCuenta;
        this.saldo = 0;
    }

    // Constructor por defecto
    public CuentaBancaria() {
        // Puedes establecer valores por defecto si es necesario
    }

    // Constructor con referencia al constructor por defecto
    public CuentaBancaria(String moneda, String tipoCuenta) {
        this("alias por defecto", moneda, tipoCuenta);
    }

    //metodo toString
    @Override
    public String toString() {
        return "CuentaBancaria{" + "numeroCuenta=" + numeroCuenta + ", alias=" + alias + ", saldo=" + saldo + ", moneda=" + moneda + ", tipoCuenta=" + tipoCuenta + '}';
    }
}
