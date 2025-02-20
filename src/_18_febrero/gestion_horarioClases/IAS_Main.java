package _18_febrero.gestion_horarioClases;

public class IAS_Main {

    public static void main(String[] args) {

        //    Scanner datos = new Scanner(System.in);
        //   System.out.println("ingrese el nombre del alumno");
        //   System.out.println("elija un dia de la semana ");
        //   System.out.println("");


        HorarioClase lunes = new HorarioClase("Lunes");
        HorarioClase martes = new HorarioClase("Martes");

        lunes.agragarMataria("Matematicas");
        lunes.agragarMataria("Historia");
        lunes.agragarMataria("Ciencias");
        lunes.agragarMataria("Ingles");


        martes.agragarMataria("Geografia");
        martes.agragarMataria("Biologia");
        martes.agragarMataria("Fisica");
        martes.agragarMataria("artistica");

        Alumno andres = new Alumno("andres");
        Alumno daniela = new Alumno("daniela");

        System.out.println(lunes.cantidadAlumnoXMateria(lunes.getMaterias().get(0), andres));
        System.out.println(lunes.cantidadAlumnoXMateria(lunes.getMaterias().get(1), daniela));

        andres.getVerHorario().add(lunes);
        andres.getVerHorario().add(martes);
        andres.verHorario();


        System.out.println("-----*** Alumnos inscritos en las materias del lunes ***-----");
        for (Materia materia : lunes.getMaterias()) {
            materia.verAlumnos();
        }

        System.out.println("-----**** Materias del martes ****-----");
        martes.verMaterias();
    }
}
