package jueves_13.cuanta_bancaria;

public class CuentaBancaria {
    private int NumeroDecuenta;
    private float saldo;
    private TipoCuentaBancaria tipoDeCuenta;

    public CuentaBancaria(int cuenta, float saldo, TipoCuentaBancaria tipoDeCuenta) {
        this.NumeroDecuenta = cuenta;
        this.saldo = saldo;
        this.tipoDeCuenta = tipoDeCuenta;
    }

    public void mostrarEstadoDeCuenta(){
        System.out.println( " tipo de Cuenta :"+ tipoDeCuenta + " numero :" + NumeroDecuenta + " saldo :" + saldo );
    }

    public String transferencia(CuentaBancaria cuentaDestino, float cantidad) {

        if (saldo < cantidad)
            return " Saldo insuficiente para la transferencia.";

        debitar(cantidad);
        cuentaDestino.acreditar(cantidad);

        return "Transferencia exitosa de $" + cantidad +  " a la cuenta número: " + cuentaDestino.getNumeroDecuenta();

    }

    private void debitar(float cantidad) {
        saldo -= cantidad;
    }


    private void acreditar(float cantidad) {
        saldo += cantidad;
    }


    public int getNumeroDecuenta() {
        return NumeroDecuenta;
    }

    public void setNumeroDecuenta(int numeroDecuenta) {
        this.NumeroDecuenta = numeroDecuenta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public TipoCuentaBancaria getTipoDeCuenta() {
        return tipoDeCuenta;
    }

    public void setTipoDeCuenta(TipoCuentaBancaria tipoDeCuenta) {
        this.tipoDeCuenta = tipoDeCuenta;
    }
}
