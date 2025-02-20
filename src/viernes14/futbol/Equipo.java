package viernes14.futbol;

public class Equipo implements Comparable<Equipo> {
    private String nombre;
    private int puntos;
    private int golesAFavor;
    private int golesEnContra;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.puntos = 0;
        this.golesAFavor = 0;
        this.golesEnContra = 0;
    }

    public void actualizarPuntos(int nuevosPuntos) {
        this.puntos += nuevosPuntos;
    }

    public void actualizarGoles(int golesAFavor, int golesEnContra) {
        this.golesAFavor += golesAFavor;
        this.golesEnContra += golesEnContra;
    }

    public int getDiferenciaDeGoles() {
        return golesAFavor - golesEnContra;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public int getGolesAFavor() {
        return golesAFavor;
    }

    @Override
    public int compareTo(Equipo otroEquipo) {
        return Integer.compare(otroEquipo.puntos, this.puntos);
    }

    @Override
    public String toString() {
        return String.format("%-20s %-10d %-15d %-10d", nombre, puntos, golesAFavor, getDiferenciaDeGoles());
    }
}