package jueves_13.cuanta_bancaria;

public class transaccionesBancariasMain {
    public static void main(String[] args) {


        CuentaBancaria cuenta1 = new CuentaBancaria(445632, 200000, TipoCuentaBancaria.Ahorrro);

        ClienteBancario cliente1 = new ClienteBancario("Juan Pérez", cuenta1);

        System.out.println("Estado antes de la transferencia:");
        cliente1.informacionBancari();

        System.out.println("realizar tranferencia \n " + cuenta1.transferencia("789654",5000));
        System.out.println("\nRealizando transferencia.......");


        System.out.println("Estado despues de la transferencia:");
        cliente1.informacionBancari();
    }
}
