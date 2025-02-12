package viernes7;

import java.util.Scanner;

public class proyecto {

    public static void main(String[] args) {



        int materiasPerdidas = 0;
        double promedioGeneral = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de estudiantes: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nEstudiante " + i);


            for (int j = 1; j <= 3; j++) {
                System.out.println("Materia " + j);
                double sumaNotas = 0;


                for (int k = 1; k <= 4; k++) {
                    System.out.print("Ingrese la nota " + k + ": ");
                    sumaNotas += scanner.nextDouble();
                }


                double promedioMateria = sumaNotas / 4;
                System.out.println("Promedio de la materia: " + promedioMateria);


                if (promedioMateria < 3.5) {
                    materiasPerdidas++;
                }

                // Sumar el promedio de la materia al promedio general
                promedioGeneral += promedioMateria;
            }

            // Calcular el promedio general del estudiante
            promedioGeneral /= 3;

            // Evaluar si el estudiante aprobó o reprobó
            if (materiasPerdidas >= 2) {
                System.out.println("El estudiante Reprobó.");
            } else {
                System.out.println("El estudiante A probó.");
            }

            // Mostrar el promedio general del estudiante
            System.out.println("Promedio general: " + promedioGeneral);
        }

        // Cerrar el scanner
        scanner.close();
    }
}


