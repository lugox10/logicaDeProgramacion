package lunes10;

import java.util.Scanner;

public class Ejercicio_3_Palindromo {

    public static void main(String[] args) {

        //Amad a la Dama
        // reconocer
        //arenera
        //anilina
        //salas
        //oso

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una cadena de texto: ");
        String frase = scanner.nextLine();

        String frasesSinEspacios="";

        char caracter;
        for (int i = 0; i < frase.length(); i++) {
            caracter= frase.charAt(i);

            if (caracter != ' ') {
                frasesSinEspacios += caracter;
            }
        }
       String fraseAlReves= "";
        for(int i=frasesSinEspacios.length()-1 ;i >= 0;i--){ //es importante para que empiece desde el final
            caracter = frasesSinEspacios.charAt(i);
            fraseAlReves += caracter;
        }

        if(frasesSinEspacios.equalsIgnoreCase(fraseAlReves)){
            System.out.println("es palindromo");
        }else{
            System.out.println("no es palindromo");
        }
    }
}
