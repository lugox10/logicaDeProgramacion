package viernes14.futbol;

public class Partido {
    private Equipo local;
    private Equipo visitante;
    private int golesLocal;
    private int golesVisitante;

    public Partido(Equipo local, Equipo visitante, int golesLocal, int golesVisitante) {
        this.local = local;
        this.visitante = visitante;
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
    }



    public void calcularResultado() {
        local.actualizarGoles(golesLocal, golesVisitante);
        visitante.actualizarGoles(golesVisitante, golesLocal);

        if (golesLocal > golesVisitante) {
            local.actualizarPuntos(3);
        } else if (golesLocal < golesVisitante) {
            visitante.actualizarPuntos(3);
        } else {
            local.actualizarPuntos(1);
            visitante.actualizarPuntos(1);
        }
    }
}