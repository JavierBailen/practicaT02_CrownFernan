package Ejercicios.Relacion02_6_EstructurasRepetitivas;

import java.util.Scanner;

public class Ej36 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        long numero = sc.nextLong();

        long numeroOriginal = numero;
        long numeroInvertido = 0;

        while (numero > 0) {
            long digito = numero % 10;
            numeroInvertido = (numeroInvertido * 10) + digito;
            numero /= 10;
        }

        if (numeroOriginal == numeroInvertido) {
            System.out.println("El número " + numeroOriginal + " es capicúa.");
        } else {
            System.out.println("El número " + numeroOriginal + " no es capicúa.");
        }
    }
}
