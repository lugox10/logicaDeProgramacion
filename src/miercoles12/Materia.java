package miercoles12;

import java.util.ArrayList;
import java.util.List;

public class Materia {
    private float promedio;
    private boolean estaAprobada;
    private String nombre;
    private List<Nota> calificaciones;

    public Materia(String nombre) {
        this.promedio=0;
        this.estaAprobada = false;
        this.nombre = nombre;
        this.calificaciones = new ArrayList<>();
    }

    public void agregarNota(Nota nota){
        calificaciones.add(nota);
    }

    public String obtenerCalificacion() {
        float suma = 0;
        for (Nota calificacion : calificaciones) {
            suma += calificacion.getValor();
        }
        promedio = suma / calificaciones.size();

        return calcularCalificacionFinal(promedio);

    }

    private String calcularCalificacionFinal(float promedio) {

        if (promedio <= 3.5) {
            estaAprobada = false;
            return Estado.Aprobado.toString();

        } else {
            estaAprobada = true;
            return Estado.Reprobado.toString();
        }
    }

    public boolean estaAprobada() {
        return estaAprobada;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public void setEstaAprobada(boolean estaAprobada) {
        this.estaAprobada = estaAprobada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Nota> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(List<Nota> calificaciones) {
        this.calificaciones = calificaciones;
    }
}
