package viernes14.futbol;

public class TablaDePosisiones {
    public static void main(String[] args) {
        Marcador marcador = new Marcador();


        Equipo liverpool = new Equipo("Liverpool");
        Equipo milan = new Equipo("Milan");
        Equipo barcelona = new Equipo("Barcelona");
        Equipo manCity = new Equipo("Manchester City");
        Equipo manUnited = new Equipo("Manchester United");
        Equipo benfica = new Equipo("Benfica");
        Equipo realMadrid = new Equipo("Real Madrid");
        Equipo juventus = new Equipo("Juventus");
        Equipo psg = new Equipo("PSG");
        Equipo ajax = new Equipo("Ajax");

        marcador.agregarEquipo(liverpool);
        marcador.agregarEquipo(milan);
        marcador.agregarEquipo(barcelona);
        marcador.agregarEquipo(manCity);
        marcador.agregarEquipo(manUnited);
        marcador.agregarEquipo(benfica);
        marcador.agregarEquipo(realMadrid);
        marcador.agregarEquipo(juventus);
        marcador.agregarEquipo(psg);
        marcador.agregarEquipo(ajax);

        marcador.agragarPartido(liverpool, milan, 2, 1);
        marcador.agragarPartido(barcelona, manCity, 1, 1);
        marcador.agragarPartido(manUnited, benfica, 3, 2);
        marcador.agragarPartido(realMadrid, juventus, 4, 0);
        marcador.agragarPartido(psg, ajax, 0, 0);
        marcador.agragarPartido(liverpool, barcelona, 3, 1);
        marcador.agragarPartido(milan, manUnited, 2, 0);
        marcador.agragarPartido(manCity, realMadrid, 1, 2);
        marcador.agragarPartido(benfica, juventus, 2, 2);
        marcador.agragarPartido(psg, ajax, 1, 2);

        marcador.mostrarClasificacionEquipos();
    }
}