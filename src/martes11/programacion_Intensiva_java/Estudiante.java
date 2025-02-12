package martes11.programacion_Intensiva_java;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {

    private String nombre;
    private List<Materias> materias;

    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.materias = new ArrayList<>();

        MateriasDeProgramacion[] listaMaterias = MateriasDeProgramacion.values();
        for (int i = 0; i < listaMaterias.length; i++) {
            materias.add(new Materias(listaMaterias[i]));
        }
    }

    public void agregarNotas(MateriasDeProgramacion materiaNombre, List<Double> notas) {
        for (int materia = 0; materia < materias.size(); materia++) {
            if (materias.get(materia).getMateria() == materiaNombre) {
                for (int nota = 0; nota < notas.size(); nota++) {
                    materias.get(materia).agregarNota(notas.get(nota));
                }
                break;
            }
        }
    }
    public String promedioDeAprobacionDeMaterias(){
        int materiasPerdidas=0;
        for (int i = 0; i < materias.size(); i++) {
            if(materias.get(i).materiaPerdida()) {
                materiasPerdidas++;
            }
        }
        if(materiasPerdidas >=2){
            return "Reprobado";

        }else{
           return "Aprobado";
        }
    }

    public double calculoDePromedioGeneral(){
        int suma=0;
        for(int i=0;i<materias.size();i++){
            suma += materias.get(i).calcularPrmedio();
        }
        return suma / materias.size();
    }

    public void mostrarResultados() {
        System.out.println("\nEstudiante: " + nombre);
        for (int i = 0; i < materias.size(); i++) {
            System.out.println("Materia: " + materias.get(i).getMateria() + " => Promedio: "
                    + materias.get(i).calcularPrmedio() + " => Calificacion: " + materias.get(i).obtenerCalificacion());
        }
        System.out.println("Promedio General: " + calculoDePromedioGeneral());
        System.out.println("Estado Final: " + promedioDeAprobacionDeMaterias());
        System.out.println("----------------------------------------------------------");
    }
}

