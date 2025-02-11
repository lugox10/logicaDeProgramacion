package programacion_Intensiva_java;

import java.util.ArrayList;
import java.util.List;

public class Materias {

    private MateriasDeProgramacion materia;
    private List<CalificacionNotas> notas;

    public Materias(MateriasDeProgramacion materia) {
        this.materia = materia;
        this.notas = new ArrayList<>();
    }

    public void agregarNota(double nota){
        notas.add(new CalificacionNotas(nota));
    }

    public double calcularPrmedio(){
       double suma=0;
       for(int i=0;i< notas.size();i++){
           suma+=notas.get(i).valorNota();
       }
       return suma / notas.size();
    }

    public String obtenerCalificacion(){
       String promedio = new CalificacionNotas(calcularPrmedio()).calificacion();
        return promedio;
    }

    public boolean materiaPerdida(){
        return calcularPrmedio() < 3.5;
    }

    public MateriasDeProgramacion getMateria(){
        return materia;
    }

    public void setMateria(MateriasDeProgramacion materia) {
        this.materia = materia;
    }

    public List<CalificacionNotas> getNotas() {
        return notas;
    }

    public void setNotas(List<CalificacionNotas> notas) {
        this.notas = notas;
    }
}
