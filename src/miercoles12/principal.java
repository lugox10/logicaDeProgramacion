package miercoles12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese la cantidad de estudiantes: ");
        int cantidadEstudiantes = scanner.nextInt();
        scanner.nextLine();

        List<Estudiante> estudiantes = new ArrayList<>();

        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.print("Ingrese el nombre del estudiante " + (i + 1) + ": ");
            String nombreEstudiante = scanner.nextLine();
            Estudiante estudiante = new Estudiante(nombreEstudiante);

            System.out.print("Ingrese la cantidad de materias de " + nombreEstudiante + ": ");
            int cantidadMaterias = scanner.nextInt();
            scanner.nextLine();

            for (int j = 0; j < cantidadMaterias; j++) {
                System.out.print("Ingrese el nombre de la materia " + (j + 1) + ": ");
                String nombreMateria = scanner.nextLine();
                Materia materia = new Materia(nombreMateria);

                for (int k = 0; k < 4; k++) {
                    double nota = 0;
                    while (true) {
                        System.out.print("Ingrese la nota " + (k + 1) + " para la materia " + nombreMateria + " (0-5): ");
                        if (scanner.hasNextDouble()) {
                            nota = scanner.nextDouble();
                            if (nota >= 0 && nota <= 5) {
                                break;
                            } else {
                                System.out.println("Nota fuera de rango. Debe estar entre 0 y 5.");
                            }
                        } else {
                            System.out.println("Entrada inválida. Ingrese un número válido.");
                            scanner.next();
                        }
                    }
                    materia.agregarNota(new Nota((float) nota));
                }
                scanner.nextLine();
                estudiante.agregarMateria(materia);
            }

            estudiantes.add(estudiante);
        }

        for (Estudiante estudiante : estudiantes) {
            System.out.println("--------------------------------------------------");
            System.out.println("Estudiante: " + estudiante.getNombre());
            System.out.println("Estado: " + estudiante.calcularPromedioCualitativo());
            System.out.println("Promedio Final: " + estudiante.getPromedioFinal());

            for (Materia materia : estudiante.getMaterias()) {
                System.out.println("Materia: " + materia.getNombre());
                for (Nota nota : materia.getCalificaciones()) {
                    System.out.println("  Calificación: " + nota.obtenerValorCualitativo());
                }
                System.out.println("Estado de la materia: " + (materia.estaAprobada() ? "Aprobada" : "Reprobada"));
            }
            System.out.println("--------------------------------------------------");
        }

        scanner.close();
    }
}