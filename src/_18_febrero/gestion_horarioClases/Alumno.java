package _18_febrero.gestion_horarioClases;

import java.util.ArrayList;
import java.util.List;

public class Alumno {

    private String nombreAlumno;
    private List<HorarioClase> verHorario;

    public Alumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
        this.verHorario = new ArrayList<>();
    }

    public void verHorario() {
        System.out.println("Horarios de clases para " + nombreAlumno + ":");
        for (HorarioClase horarioClase : verHorario) {
            System.out.println(horarioClase.getDia() + " - " + horarioClase.getMaterias());
        }
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public List<HorarioClase> getVerHorario() {
        return verHorario;
    }

    public void setVerHorario(List<HorarioClase> verHorario) {
        this.verHorario = verHorario;
    }

}
