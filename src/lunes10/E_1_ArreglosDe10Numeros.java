package lunes10;

public class E_1_ArreglosDe10Numeros {

    public static void main(String[] args) {

        int[] numero = {51, 54, 5, 22, 6, 9, 7, 8, 5, 4};

        int mayor = 0;
        int menor = 0;
        int promedio = 0;
        int suma = 0;

        for (int i = 0; i < numero.length; i++) {
            if (i == 0) {
                menor = numero[i];
                mayor = numero[i];
            } else if (numero[i] < menor) {
                menor = numero[i];
            } else if (numero[i] > mayor) {
                mayor = numero[i];
            }

            suma = suma + numero[i];
        }

        promedio =  suma / numero.length;

        System.out.println(numero.length);
        System.out.println(suma);
        System.out.println("el numero menor es :" + menor);
        System.out.println("el numero mayor es :" + mayor);
        System.out.println("promedio: " + promedio);
    }
}
