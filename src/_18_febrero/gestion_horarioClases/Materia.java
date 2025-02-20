package _18_febrero.gestion_horarioClases;

import java.util.ArrayList;
import java.util.List;

public class Materia {

    private String nombreMateria;
    private List<Alumno> alumnos;
    protected static final int CAPAXIDAD_ALUMNOS = 10;

    public Materia(String nombreMateria) {
        this.nombreMateria = nombreMateria;
        this.alumnos = new ArrayList<>();
    }

    public String agragarAlumno(Alumno alumno) {
        if (alumnos.size() < CAPAXIDAD_ALUMNOS) {
            alumnos.add(alumno);
            return "Alumno " + alumno.getNombreAlumno() + " inscrito en la materia.";
        } else {
            return "No se pueden inscribir más alumnos en la materia " + nombreMateria + ". El grupo está lleno.";
        }
    }

    public void verAlumnos() {
        System.out.println("Alumnos inscritos en la materia " + nombreMateria + ":");
        for (Alumno alumno : alumnos) {
            System.out.println(alumno.getNombreAlumno());
        }
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }



    @Override
    public String toString() {
        return this.nombreMateria;
    }
}
