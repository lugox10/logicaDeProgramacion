package viernes14.futbol.tranformacion_de_cifras;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad en números: ");
        double cantidad = scanner.nextDouble();

        if (cantidad >= 1000000) {
            System.out.println("Error: Solo se admiten números hasta 999,999.");
        } else {
            System.out.println("Cantidad en texto: " + TransformarNumeroATexto.convertir((int) cantidad));
        }

        scanner.close();
    }
}
