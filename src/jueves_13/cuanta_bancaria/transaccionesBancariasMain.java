package jueves_13.cuanta_bancaria;

public class transaccionesBancariasMain {
    public static void main(String[] args) {


        CuentaBancaria cuenta1 = new CuentaBancaria(999999999, 200000, TipoCuentaBancaria.Ahorrro);
        CuentaBancaria cuenta2 = new CuentaBancaria(222222222,500000,TipoCuentaBancaria.Corriente);

        ClienteBancario cliente1 = new ClienteBancario("Juan Pérez", cuenta1);
        ClienteBancario cliente2 = new ClienteBancario("daniela",cuenta2);
        System.out.println("Estado antes de la transferencia:");
        cliente1.informacionBancari();

        System.out.println("\nRealizando transferencia.......");
        System.out.println("realizar tranferencia \n " + cuenta1.transferencia(cuenta2,100000));

        System.out.println("Estado despues de la transferencia:");
        cliente1.informacionBancari();
        cliente2.informacionBancari();
    }
}
