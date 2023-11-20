package Ejercicios.Relacion02_4_OperadoresYExpresiones;

import java.util.Scanner;

public class Ej01 {
    public static void main(String[] args) {
        /*
        Diseña un programa Java para resolver una ecuación de primer grado con una incógnita (x),
        suponiendo que los coeficientes de la ecuación (C1 y C2) se introducen desde teclado.
        C1x + C2 = 0
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el coeficiente C1");
        double C1 = sc.nextDouble();
        System.out.println("Dime el coeficiente C2");
        double C2 = sc.nextDouble();

        double x = -C2/C1;

        System.out.println(C1+"x"+"+"+C2+"=0");
        System.out.println("La solución a tu ecuación es " + x);
    }
}
