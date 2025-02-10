package viernes7;

import java.util.Scanner;

public class Ejercicio_4_NumerosFibonachi {

    public static void main(String[] args) {
        // En matemática, la sucesión de Fibonacci se trata
        // de una serie infinita de números naturales que empieza con un 0 y un 1
        // y continúa añadiendo números que son la suma de los dos anteriores: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597…

        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la cantidad de números Fibonacci que desea obtener
        System.out.print("Ingrese la cantidad de números Fibonacci a obtener: ");
        int cantidadDeNumeros = scanner.nextInt();


        if (cantidadDeNumeros <= 0) {
            System.out.println("Por favor ingrese un número mayor que 0.");
        } else {

            long[] secuenciaFibonacci = new long[cantidadDeNumeros];


            secuenciaFibonacci[0] = 0;
            if (cantidadDeNumeros > 1) {
                secuenciaFibonacci[1] = 1;
            }


            for (int i = 2; i < cantidadDeNumeros; i++) {
                secuenciaFibonacci[i] = secuenciaFibonacci[i - 1] + secuenciaFibonacci[i - 2];
            }

            System.out.println("Los primeros " + cantidadDeNumeros + " números Fibonacci son:");
            for (int i = 0; i < cantidadDeNumeros; i++) {
                System.out.println(secuenciaFibonacci[i]);
            }
        }


        scanner.close();
    }
}
