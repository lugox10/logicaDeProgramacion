/*package miercoles12;

import java.util.ArrayList;

public class GestionEstudiante {

    public static void main(String[] args) {

        ArrayList<Estudiante> student = new ArrayList<>();

       Estudiante estudiante = new Estudiante("andres");
        Materia materia1= new Materia("java");
        Materia materia2 = new Materia("spring");
        Materia materia3 = new Materia("angular");

        materia1.getCalificaciones().add(new Nota(3.1f));
        materia1.getCalificaciones().add(new Nota(4.5f));
        materia1.getCalificaciones().add(new Nota(4.0f));
        materia1.getCalificaciones().add(new Nota(2.1f));

        materia2.getCalificaciones().add(new Nota(4.1f));
        materia2.getCalificaciones().add(new Nota(4.7f));
        materia2.getCalificaciones().add(new Nota(4.0f));
        materia2.getCalificaciones().add(new Nota(4.1f));

        materia3.getCalificaciones().add(new Nota(3.1f));
        materia3.getCalificaciones().add(new Nota(3.7f));
        materia3.getCalificaciones().add(new Nota(3.0f));
        materia3.getCalificaciones().add(new Nota(3.1f));

        estudiante.getMaterias().add(materia1);
        estudiante.getMaterias().add(materia3);

        for (Materia materia : estudiante.getMaterias()){
            for(Nota nota : materia.getCalificaciones()){
                System.out.println("la materia: "+materia.getNombre() + " tiene una calificacion: "+nota.obtenerValorCualitativo());
            }

            System.out.println("la materia: "+ materia.getNombre() + " tiene un estado: "+materia.obtenerCalificacion());
            System.out.println("-------------------------------------------------------------------------");
        }
        System.out.println("**************************************************************************+");
        System.out.println("el estudiante: "+ estudiante.getNombre()+" a: " +estudiante.calcularPromedioCualitativo() + "el año lectivo");
        System.out.println("**************************************************************************+");
    }
}*/
