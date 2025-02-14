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

    public String transferencia(String cuentaDestino,float cantidad){

        if( saldo > cantidad){
            saldo-=cantidad;
           return "tranferencia exitosa a la cuenta numero: "+ cuentaDestino;
        }else{
            return "transferenci fallida";
        }
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
