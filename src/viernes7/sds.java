package viernes7;

public class sds {
    public static void main(String[] args) {


                // Puntos de cada equipo
                int equipo1 = 0;
                int equipo2 = 3;
                int equipo3 = 3;
                int equipo4 = 0;
                int equipo5 = 1;
                int equipo6 = 1;

                // Arreglos de equipos y sus puntos
                String[] equipos = {"equipo1", "equipo2", "equipo3", "equipo4", "equipo5", "equipo6"};
                int[] puntos = {equipo1, equipo2, equipo3, equipo4, equipo5, equipo6};

                // Ordenamiento simple: comparando y ordenando los puntos
                for (int i = 0; i < puntos.length - 1; i++) {
                    for (int j = i + 1; j < puntos.length; j++) {
                        // Si el punto del equipo i es menor que el de j, los intercambiamos
                        if (puntos[i] < puntos[j]) {
                            // Intercambiamos los puntos
                            int tempPuntos = puntos[i];
                            puntos[i] = puntos[j];
                            puntos[j] = tempPuntos;

                            // Intercambiamos los equipos en el mismo orden
                            String tempEquipo = equipos[i];
                            equipos[i] = equipos[j];
                            equipos[j] = tempEquipo;
                        }
                    }
                }

                // Mostrar los equipos ordenados de mayor a menor por puntos
                System.out.println("Equipos ordenados de mayor a menor puntaje:");
                for (int i = 0; i < equipos.length; i++) {
                    System.out.println(equipos[i] + " - " + puntos[i] + " puntos");
                }
            }
        }







