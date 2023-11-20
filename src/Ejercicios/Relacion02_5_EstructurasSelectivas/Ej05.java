package Ejercicios.Relacion02_5_EstructurasSelectivas;

import java.util.Scanner;

public class Ej05 {
    public static void main(String[] args) {
        //Realiza un programa que resuelva una ecuación de primer grado (del tipo ax + b = 0).

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime valor para el coeficiente a");
        double a = sc.nextDouble();
        System.out.println("Dime el valor del coeficiente b");
        double b = sc.nextDouble();

        double x = -b/a;

        System.out.printf("%.0fx + %.0f=0 \n",a,b);
        System.out.printf("x=%.0f/%.0f \n", b, a);
        System.out.println("x="+x);


    }
}
