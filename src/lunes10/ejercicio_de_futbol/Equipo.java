package lunes10.ejercicio_de_futbol;

public class Equipo {

    private String nombreEquipo;
    private int puntos;
    private int golesAFavor;
    private int golesEnContra;

    public Equipo(String nombreEquipo, int puntos, int golesAFavor, int golesEnContra) {
        this.nombreEquipo = nombreEquipo;
        this.puntos = puntos;
        this.golesAFavor = golesAFavor;
        this.golesEnContra = golesEnContra;
    }

    public int getDiferenciaDeGoles() {
        return golesAFavor - golesEnContra;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getGolesAFavor() {
        return golesAFavor;
    }

    public void setGolesAFavor(int golesAFavor) {
        this.golesAFavor = golesAFavor;
    }

    public int getGolesEnContra() {
        return golesEnContra;
    }

    public void setGolesEnContra(int golesEnContra) {
        this.golesEnContra = golesEnContra;
    }
}
