package Ejercicios.Relacion02_5_EstructurasSelectivas;

import java.util.Scanner;

public class Ej17 {
    public static void main(String[] args) {
        System.out.println("Dime un numero");
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       int ultimoDigito = num%10;

        System.out.println("La ultima cifra es: " +ultimoDigito);
    }
}
