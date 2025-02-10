package viernes7;

import java.util.Scanner;

public class Ejercicio_6_ArbolAsteriscos {

        public static void main(String[] args) {

            System.out.println("Hello, World!");

            Scanner scanner = new Scanner(System.in);

            System.out.println("Por favor, ingrese la altura del arbol o pirmide:");
            int alturaPiramide = scanner.nextInt();
            System.out.println("___________________________________________________");

            for(int altura = 1; altura <= alturaPiramide; altura++){
                for(int espacios=1;espacios <= alturaPiramide-altura; espacios++){
                    System.out.print(" ");
                }
                for(int asteriscos=1;asteriscos <= (altura*2)-1;asteriscos++){
                    System.out.print("*");
                }
                System.out.println();
            }



        }
}
