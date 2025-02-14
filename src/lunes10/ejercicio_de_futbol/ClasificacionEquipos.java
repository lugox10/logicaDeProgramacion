package lunes10.ejercicio_de_futbol;

import java.util.ArrayList;
import java.util.List;

public class ClasificacionEquipos {
    public static void main(String[] args) {
        List<Equipo> listaEquipos = new ArrayList<>();
        listaEquipos.add(new Equipo("Real Madrid", 5, 15, 5));
        listaEquipos.add(new Equipo("Milan", 10, 12, 4));
        listaEquipos.add(new Equipo("Manchester City", 8, 14, 6));
        listaEquipos.add(new Equipo("Barcelona", 8, 14, 5));
        listaEquipos.add(new Equipo("Manchester United", 6, 10, 7));
        listaEquipos.add(new Equipo("Benfica", 6, 8, 6));
        listaEquipos.add(new Equipo("Juventus", 5, 7, 8));
        listaEquipos.add(new Equipo("Liverpool", 10, 20, 9));
        listaEquipos.add(new Equipo("PSG", 3, 5, 10));
        listaEquipos.add(new Equipo("Ajax", 1, 4, 12));

        for (int i = 0; i < listaEquipos.size() - 1; i++) {
            for (int j = i + 1; j < listaEquipos.size(); j++) {
                if (listaEquipos.get(i).getPuntos() < listaEquipos.get(j).getPuntos() ||
                                (listaEquipos.get(i).getPuntos() == listaEquipos.get(j).getPuntos() &&
                                listaEquipos.get(i).getGolesAFavor() < listaEquipos.get(j).getGolesAFavor()) ||
                                (listaEquipos.get(i).getPuntos() == listaEquipos.get(j).getPuntos() &&
                                listaEquipos.get(i).getGolesAFavor() == listaEquipos.get(j).getGolesAFavor() &&
                                listaEquipos.get(i).getDiferenciaDeGoles() < listaEquipos.get(j).getDiferenciaDeGoles())) {

                    Equipo equipoTemporal = listaEquipos.get(i);
                    listaEquipos.set(i, listaEquipos.get(j));
                    listaEquipos.set(j, equipoTemporal);
                }
            }
        }

        System.out.println("\nClasificación de equipos:\n");
        System.out.printf("%-20s %-10s %-15s %-15s\n", "Equipo", "Puntos", "Goles a favor", "Diferencia de goles");
        System.out.println("---------------------------------------------------------------");
        for (Equipo equipo : listaEquipos) {
            System.out.printf("%-20s %-10d %-15d %-15d\n", equipo.getNombreEquipo(), equipo.getPuntos(),
                    equipo.getGolesAFavor(), equipo.getDiferenciaDeGoles());
        }
    }
}
