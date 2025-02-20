package viernes14.futbol;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Marcador {
    private List<Equipo> equipos;

    public Marcador() {
        equipos = new ArrayList<>();
    }

    public void agregarEquipo(Equipo equipo) {
        equipos.add(equipo);
    }

    public void agragarPartido(Equipo local, Equipo visitante, int golesLocal, int golesVisitante) {
        Partido partido = new Partido(local, visitante, golesLocal, golesVisitante);
        partido.calcularResultado();
    }

    public void mostrarClasificacionEquipos() {
        Collections.sort(equipos);
        System.out.println("\nClasificación de equipos:");
        System.out.println("---------------------------------------------------------------");
        System.out.printf("%-20s %-10s %-15s %-10s%n", "Equipo", "Puntos", "Goles a favor", "Diferencia de goles");
        System.out.println("---------------------------------------------------------------");

        for (Equipo equipo : equipos) {
            System.out.println(equipo);
        }
    }
}