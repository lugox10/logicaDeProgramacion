package martes11.programacion_Intensiva_java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IASArquitectura {

    private Scanner entradaDatos;
    private List<EstudianteIAS> estudiantes;

    public IASArquitectura() {
        this.entradaDatos = new Scanner(System.in);
        this.estudiantes = new ArrayList<>();
    }

    public void calificacionDeEstudisante(){
        System.out.print("ingrese la cantidad de estudintes a calificar:");
        int cantidadEstudiantes= entradaDatos.nextInt();
        entradaDatos.nextLine();

        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.print("Ingrese el nombre del estudiante: ");
            String nombre = entradaDatos.nextLine();
            EstudianteIAS estudiante = new EstudianteIAS(nombre);

            for (int j = 0; j < MateriasDeProgramacion.values().length; j++) {
                List<Double> notas = new ArrayList<>();
                System.out.println("Ingrese 4 notas (entre 0 y 5) para:\n " + MateriasDeProgramacion.values()[j] );
                for (int k = 0; k < 4; k++) {
                    double nota;
                    while (true) {
                        if (entradaDatos.hasNextDouble()) {
                            nota = entradaDatos.nextDouble();
                            if (nota >= 0 && nota <= 5) {
                                break;
                            } else {
                                System.out.println("Nota fuera de rango. Debe estar entre 0 y 5. Intente de nuevo:");
                            }
                        } else {
                            System.out.println("Entrada inválida. Ingrese un número válido entre 0 y 5:");
                            entradaDatos.next();
                        }
                    }
                    notas.add(nota);
                }
                entradaDatos.nextLine();
                estudiante.agregarNotas(MateriasDeProgramacion.values()[j], notas);
            }
            estudiantes.add(estudiante);
        }
        mostrarResultados();
    }

    public void mostrarResultados() {
        for (int i = 0; i < estudiantes.size(); i++) {
            estudiantes.get(i).mostrarResultados();
        }
    }


}

