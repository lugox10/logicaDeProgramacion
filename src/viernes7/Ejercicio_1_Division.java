package viernes7;

public class Ejercicio_1_Division {

    public static void main(String[] args) {
        System.out.println("hola");

//tengo que determinar cuantos numeros esta el divisor en el numero a divideir

        int numeroADividir =10;
        int numeroDivisor =2;
        int cuantasVecesEsta =0;
        int comprobarDivision;


        for (int i = 0; numeroADividir >= numeroDivisor; i++) {
            numeroADividir = numeroADividir - numeroDivisor;
            cuantasVecesEsta = cuantasVecesEsta + 1;
        }

       comprobarDivision = numeroDivisor *cuantasVecesEsta;

        System.out.println(cuantasVecesEsta);
        System.out.println(comprobarDivision);
    }
}
