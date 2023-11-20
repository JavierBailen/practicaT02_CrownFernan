package Ejercicios.Relacion02_3_LecturaDeDatosTeclado;

import java.util.Scanner;

public class Ej06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la base de tu triangulo equilatero");
        double baseTriangulo = sc.nextDouble();
        System.out.println("Dime la altura de tu triangulo equilatero y te digo su área");
        double alturaTriangulo = sc.nextDouble();;

        double areaTriangulo = (baseTriangulo*alturaTriangulo)/2;

        System.out.println("El área de tu triangulo es de " + areaTriangulo +"Cm2");


    }
}
