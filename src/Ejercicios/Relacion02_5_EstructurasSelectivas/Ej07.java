package Ejercicios.Relacion02_5_EstructurasSelectivas;

import java.util.Scanner;

public class Ej07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la primera nota");
        double nota1 = sc.nextDouble();
        System.out.println("Dime la segunda nota");
        double nota2 = sc.nextDouble();
        System.out.println("Dime la tercera nota");
        double nota3 = sc.nextDouble();

        double media = (nota1+nota2+nota3)/3;

        System.out.println("La media de tus tres notas es " + media);

    }
}
