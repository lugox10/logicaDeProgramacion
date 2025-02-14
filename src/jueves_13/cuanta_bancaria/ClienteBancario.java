package jueves_13.cuanta_bancaria;

public class ClienteBancario {

   private String nombre;
   private CuentaBancaria cuenta;

   public ClienteBancario(String nombre, CuentaBancaria cuenta) {
      this.nombre = nombre;
      this.cuenta = cuenta;
   }

   public void informacionBancari(){
      System.out.println("cliente :" + nombre);
      cuenta.mostrarEstadoDeCuenta();
   }

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public String getCuenta() {
      return cuenta.toString();
   }

   public void setCuenta(CuentaBancaria cuenta) {
      this.cuenta = cuenta;
   }
}
