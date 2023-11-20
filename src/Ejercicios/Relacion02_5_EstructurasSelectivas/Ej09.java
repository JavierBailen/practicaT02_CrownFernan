package Ejercicios.Relacion02_5_EstructurasSelectivas;

import java.util.Scanner;

public class Ej09 {
    public static void main(String[] args) {
        //Realiza un programa que resuelva una ecuación de segundo grado (del tipo ax2+bx+c =
        //0).

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el coeficiente (a)");
        double a = sc.nextDouble();
        System.out.println("Dime el coeficiente (b)");
        double b = sc.nextDouble();
        System.out.println("Dime el coeficiente (c)");
        double c = sc.nextDouble();


        double bCuadrado = Math.pow(b,2);
        double raizFormula = Math.sqrt(bCuadrado-4*a*c)/(2*a);
        double formula1 = -b+raizFormula;
        double formula2 = -b-raizFormula;

        System.out.println("La primera solución es x= " +formula1);
        System.out.println("La segunda solución es x= " +formula2);
    }
}
