package viernes14.futbol.tranformacion_de_cifras;

import java.util.Scanner;

public class TransformarNumeroATexto {

    private static final String[] UNIDADES = { "", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve" };
    private static final String[] DIEZ_VEINTE = { "diez", "once", "doce", "trece", "catorce", "quince", "dieciséis", "diecisiete", "dieciocho", "diecinueve" };
    private static final String[] DECENAS = { "", "diez", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa" };
    private static final String[] CENTENAS = { "", "cien", "doscientos", "trescientos", "cuatrocientos", "quinientos", "seiscientos", "setecientos", "ochocientos", "novecientos" };

    public static String convertir(int numero) {
        if (numero == 0) {
            return "cero";
        }
        return convertirNumero(numero);
    }

    private static String convertirNumero(int numero) {
        if (numero < 10) {
            return UNIDADES[numero];
        } else if (numero < 20) {
            return DIEZ_VEINTE[numero - 10];
        } else if (numero < 100) {
            return DECENAS[numero / 10] + (numero % 10 != 0 ? " y " + UNIDADES[numero % 10] : "");
        } else if (numero < 1000) {
            return (numero == 100 ? "ciento" : CENTENAS[numero / 100] + (numero % 100 != 0 ? " " + convertirNumero(numero % 100) : ""));
        } else if (numero < 1000000) {  // Soporte hasta 999,999
            int miles = numero / 1000;
            int resto = numero % 1000;
            String milesTexto = (miles == 1 ? "mil" : convertirNumero(miles) + " mil");
            return milesTexto + (resto != 0 ? " " + convertirNumero(resto) : "");
        } else {
            return "Número demasiado grande";
        }
    }

    public static String convertirConMoneda(double cantidad) {
        int parteEntera = (int) cantidad;
        int centavos = (int) Math.round((cantidad - parteEntera) * 100);
        return convertir(parteEntera) + " pesos" + (centavos > 0 ? " con " + convertir(centavos) + " centavos" : "");
    }


}