package miercoles12;

public class Nota {

    private float valor;


    public Nota(float valor) {
        this.valor = valor;
    }

    public String obtenerValorCualitativo() {

        if (valor <= 2.9) {
            return Calificacion.Insuficiente.toString();
        }
        if (valor >= 3.0 && valor <= 4.5) {
            return Calificacion.Bueno.toString();
        }
        if (valor >= 4.6 && valor <= 5.0) {
            return Calificacion.Excelente.toString();
        }
        return Calificacion.No_Definido.toString();
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

}
