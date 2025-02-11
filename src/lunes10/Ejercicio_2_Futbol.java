package lunes10;

public class Ejercicio_2_Futbol {

    public static void main(String[] args) {

            /* resultados de la fecha
               equipo1 0-3 equipo2
               equipo3 3-0 equipo4
               equipo5 1-1 equipo6   */

        int equipo1 = 0;
        int equipo2 = 3;
        int equipo3 = 3;
        int equipo4 = 0;
        int equipo5 = 1;
        int equipo6 = 1;


        int[] equipos1 = {equipo1, equipo2, equipo3, equipo4, equipo5, equipo6};
        String[] equipos = {"equipo1", "equipo2", "equipo3", "equipo4", "equipo5", "equipo6"};
        int[] puntos = {0, 3, 3, 0, 1, 1};

        int mejorPuntaje = 0;
        int mejorEquipo = 0;


        for (int i = 0; i < equipos.length; i++) {
            System.out.println(equipos[i] + " - " + puntos[i] + " puntos");
            if (puntos[i] > mejorPuntaje) {
                mejorPuntaje = puntos[i];
                mejorEquipo = i;
            }
        }


            System.out.println("El equipo con el mejor puntaje es: " + equipos[mejorEquipo] + " con " + mejorPuntaje + " puntos");

    }
}