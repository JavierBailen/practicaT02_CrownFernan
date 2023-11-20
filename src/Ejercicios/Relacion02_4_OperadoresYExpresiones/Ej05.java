package Ejercicios.Relacion02_4_OperadoresYExpresiones;

import java.util.Scanner;

public class Ej05 {
    //Diseña un programa para calcular el área y perímetro de un rectángulo. Solicita al usuario
    //aquellos datos que necesites.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime la base de tu rectángulo");
        double base = sc.nextDouble();
        System.out.println("Dime la altura o lado de tu rectángulo");
        double lado = sc.nextDouble();

        double areaRectangulo= base*lado;
        double perimetro = (base*2)+(lado*2);

        System.out.println("El área de tu rectángulo es " + areaRectangulo +"Cm2");
        System.out.println("El perimetro de tu rectángulo es " + perimetro +"Cm2");
    }
}
