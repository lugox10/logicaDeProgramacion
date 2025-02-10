package viernes7;

import java.util.Scanner;

public class Ejercicio_3_NumerosPrimos {
//   public static void main(String[] args) {
//
//      //los numeros Primos son numeros enteros que tienen solo dos divisores: ellos mismos y el 1.
//
//      Scanner entrada = new Scanner(System.in);
//
//      System.out.println("indique asta que numero quiere optener numeros primos");
//      int limiteInferior = 1;
//      int limiteSuperior = entrada.nextInt();
//
//      for (int i = limiteInferior; i <= limiteSuperior; i++) {
//          int divisores = 0;
//          for (int j = 1; j <= i / 2; j++) {
//              if (i % j == 0) {
//                  divisores += 2;
//              }
//              if (divisores > 2) {
//                  break;
//              }
//          }
//          if (divisores == 2) {
//              System.out.println(i);
//          }
//      }
//  }


//public static void main(String[] args) {
//    Scanner entrada = new Scanner(System.in);
//    System.out.println("Indique cuántos números primos desea encontrar:");
//    int cantidadPrimos = entrada.nextInt();

//    // Variables para contar la cantidad de números primos encontrados
//    int contadorPrimos = 0;
//    int numero = 2;  // Comenzamos desde el primer número primo

//    // Bucle para encontrar los números primos
//    while (contadorPrimos < cantidadPrimos) {
//        int divisores = 0;

//        // Bucle para verificar cuántos divisores tiene el número
//        for (int j = 1; j <= numero / 2; j++) {
//            if (numero % j == 0) {
//                divisores += 2; // Se cuentan los divisores: 1 y el número mismo
//            }
//            if (divisores > 2) {
//                break; // Si tiene más de 2 divisores, no es primo
//            }
//        }

//        // Si el número tiene exactamente 2 divisores, es primo
//        if (divisores == 2) {
//            System.out.println(numero); // Imprimir el número primo
//            contadorPrimos++; // Contar el número primo encontrado
//        }

//        // Incrementar el número para seguir buscando
//        numero++;
//    }

//    // Imprimir la cantidad de números primos encontrados (siempre será igual a la cantidad pedida)
//    System.out.println("Se han encontrado " + cantidadPrimos + " números primos.");
//}


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Mostrar el menú de opciones
        System.out.println("¿Qué quieres hacer?");
        System.out.println("1. Encontrar números primos hasta un cierto número.");
        System.out.println("2. Encontrar una cantidad específica de números primos.");
        int opcion = entrada.nextInt();
        // Opción 1: Encontrar números primos hasta un límite superior
        if (opcion == 1) {
            System.out.println("Indique hasta qué número desea obtener los números primos:");
            int limiteSuperior = entrada.nextInt();
            int contadorPrimos = 0;
            // Buscar primos hasta el límite superior
            for (int i = 2; i <= limiteSuperior; i++) {
                int divisores = 0;
                for (int j = 1; j <= i / 2; j++) {
                    if (i % j == 0) {
                        divisores += 2;
                    }
                    if (divisores > 2) {
                        break;
                    }
                }
                // Si tiene exactamente 2 divisores, es primo
                if (divisores == 2) {
                    System.out.println(i);
                    contadorPrimos++;
                }
            }
            System.out.println("Cantidad de números primos encontrados: " + contadorPrimos);
        }


        // Opción 2: Encontrar una cantidad específica de números primos
        else if (opcion == 2) {
            System.out.println("Indique cuántos números primos desea encontrar:");
            int cantidadPrimos = entrada.nextInt();
            int contadorPrimos = 0;
            int numero = 2;

            while (contadorPrimos < cantidadPrimos) {
                int divisores = 0;
                for (int j = 1; j <= numero / 2; j++) {
                    if (numero % j == 0) {
                        divisores += 2;
                    }
                    if (divisores > 2) {
                        break;
                    }
                }

                if (divisores == 2) {
                    System.out.println(numero);
                    contadorPrimos++;
                }
                numero++;
            }
            System.out.println("Se han encontrado " + cantidadPrimos + " números primos.");
        } else {
            System.out.println("Opción no válida. Por favor, elija 1 o 2.");
        }
    }
}