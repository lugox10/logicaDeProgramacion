package miercoles12;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private float promedioFinal;
    private String nombre;
    private List<Materia> materias;

    public Estudiante(String nombre) {
        this.promedioFinal = 0;
        this.nombre = nombre;
        this.materias = new ArrayList<>();
    }

    public void agregarMateria(Materia materia){
        materias.add(materia);
    }

    public String calcularPromedioCualitativo() {
        int contador = 0;
        float suma = 0;
        for (Materia materia : materias) {
            suma += materia.getPromedio();

            if (!materia.estaAprobada()) {
                contador++;
            }
        }
        promedioFinal = suma / materias.size();
        return calcularEstadoEstudiante(contador);
    }

    private String calcularEstadoEstudiante(int contador) {
        if (contador >= 2) {
            return Estado.Reprobado.toString();
        } else {
            return Estado.Aprobado.toString();
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    public float getPromedioFinal() {
        return promedioFinal;
    }

    public void setPromedioFinal(float promedioFinal) {
        this.promedioFinal = promedioFinal;
    }
}
