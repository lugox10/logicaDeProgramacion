package viernes7;

import java.util.Scanner;

public class proyecto {

    public static void main(String[] args) {

        // Crear el objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir la cantidad de estudiantes
        System.out.print("Ingrese la cantidad de estudiantes: ");
        int n = scanner.nextInt();

        // Iterar sobre los estudiantes
        for (int i = 1; i <= n; i++) {
            System.out.println("\nEstudiante " + i);

            // Inicializar contador de materias perdidas
            int materiasPerdidas = 0;
            double promedioGeneral = 0;

            // Iterar sobre las 3 materias
            for (int j = 1; j <= 3; j++) {
                System.out.println("Materia " + j);
                double sumaNotas = 0;

                // Leer las 4 notas de la materia
                for (int k = 1; k <= 4; k++) {
                    System.out.print("Ingrese la nota " + k + ": ");
                    sumaNotas += scanner.nextDouble();
                }

                // Calcular el promedio de la materia
                double promedioMateria = sumaNotas / 4;
                System.out.println("Promedio de la materia: " + promedioMateria);

                // Evaluar si la materia está perdida
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
                System.out.println("El estudiante reprobó.");
            } else {
                System.out.println("El estudiante aprobó.");
            }

            // Mostrar el promedio general del estudiante
            System.out.println("Promedio general: " + promedioGeneral);
        }

        // Cerrar el scanner
        scanner.close();
    }
}


