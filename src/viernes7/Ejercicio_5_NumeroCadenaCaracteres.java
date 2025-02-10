package viernes7;

import java.util.Scanner;

public class Ejercicio_5_NumeroCadenaCaracteres {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Por favor, ingrese una cadena de texto:");
        String entrada = scanner.nextLine();

        String mayusculas = "";
        String minusculas = "";
        String numeros = "";
        String caracteresEspeciales = "";

        int numeroMayusculas = 0;
        int numeroMinusculas = 0;
        int numeroNumeros = 0;
        int numeroCaracteresEspeciales = 0;
        int totalCaracteres = 0;
        int numeroPalabras = 0;
        int numeroEspacios = 0;

        for (int i = 0; i < entrada.length(); i++) {
            if (Character.isUpperCase(entrada.charAt(i))) {
                mayusculas += entrada.charAt(i);
                numeroMayusculas++;
            } else if (Character.isLowerCase(entrada.charAt(i))) {
                minusculas += entrada.charAt(i);
                numeroMinusculas++;
            } else if (Character.isDigit(entrada.charAt(i))) {
                numeros += entrada.charAt(i);
                numeroNumeros++;
            } else if (Character.isWhitespace(entrada.charAt(i))) {
                numeroEspacios++;
            } else {
                caracteresEspeciales += entrada.charAt(i);
                numeroCaracteresEspeciales++;
            }
        }

        totalCaracteres = entrada.length();
        numeroPalabras = entrada.split(" ").length;


        System.out.println("Mayúsculas: " + mayusculas + " (" + numeroMayusculas + ")");
        System.out.println("Minúsculas: " + minusculas + " (" + numeroMinusculas + ")");
        System.out.println("Números: " + numeros + " (" + numeroNumeros + ")");
        System.out.println("Caracteres Especiales: " + caracteresEspeciales + " (" + numeroCaracteresEspeciales + ")");
        System.out.println("Total de Caracteres: " + totalCaracteres);
        System.out.println("Número de Palabras: " + numeroPalabras);
        System.out.println("Número de Espacios: " + numeroEspacios);

        scanner.close();
    }
}

