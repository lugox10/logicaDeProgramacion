package viernes7;

import java.util.Scanner;

public class Ejercicio_2_MinimoComunMultiplo {
    public static void main(String[] args) {
        //es el numero de menor valo que es multiplo divisor de ellos.
        //se pueden optener mediate su propia secuencia de multiplos
        //tambien se pueden optenr mediante una division de numeros primo

            Scanner entradaUsuario = new Scanner(System.in);

            System.out.println("Ingresa el primer número:");
            int primerNumero = entradaUsuario.nextInt();

            System.out.println("Ingresa el segundo número:");
            int segundoNumero = entradaUsuario.nextInt();

            int resultadoMcm = calcularMcm(primerNumero, segundoNumero);


            System.out.println("El MCM de " + primerNumero + " y " + segundoNumero + " es: " + resultadoMcm);
        }

        public static int calcularMcd(int primerNumero, int segundoNumero) {
            while (segundoNumero != 0) {
                int residuo = segundoNumero;
                segundoNumero = primerNumero % segundoNumero;
                primerNumero = residuo;
            }
            return primerNumero;
        }


        public static int calcularMcm(int primerNumero, int segundoNumero) {
            return (primerNumero * segundoNumero) / calcularMcd(primerNumero, segundoNumero);
        }
    }