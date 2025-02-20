package _18_febrero.gestion_horarioClases;

import java.util.ArrayList;
import java.util.List;

public class HorarioClase {
    private String dia;
    private static final int HORARIO_DURACION = 4;
    private static final int CAPAXIDAD_ALUMNOS = 10;
    private List<Materia> materias;

    public HorarioClase(String dia) {
        this.dia = dia;
        this.materias = new ArrayList<>();
    }

    public String agragarMataria(String nombreMateria) {
        if (materias.size() >= HORARIO_DURACION) {
            return "No se pueden agregar más de 4 materias por día";
        } else {
            Materia nuevaMateria = new Materia(nombreMateria);
            materias.add(nuevaMateria);
            return "Materia: " + nombreMateria + " registrada con éxito en el día " + dia;
        }
    }



    public void verMaterias() {
        System.out.println("Materias programadas para el día " + dia + ":");
        for (Materia materia : materias) {
            System.out.println(materia.getNombreMateria());
        }
    }

    public String cantidadAlumnoXMateria(Materia materia, Alumno alumno) {
        if (materia.getAlumnos().size() >= CAPAXIDAD_ALUMNOS) {
            return "No se puede incribir más alumnos en la materia " + materia.getNombreMateria() + ". El grupo está lleno.";
        } else {
            materia.agragarAlumno(alumno);
            return "Alumno " + alumno.getNombreAlumno() + " inscrito en la materia " + materia.getNombreMateria() + " (Día: " + dia + ")";
        }
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }


}
