package martes11.programacion_Intensiva_java;

public record CalificacionNotas(double valorNota) {

    public String calificacion(){
        if(valorNota < 3.5){
            return "insuficiente";
        }else if (valorNota < 4.5 ){
            return "bueno";
        }else{
            return "exelente";
        }
    }
}
