package Ejercicios.Relacion02_3_LecturaDeDatosTeclado;

import java.util.Scanner;

public class Ej05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la base del rectangulo");
        int baseRectangulo = sc.nextInt();
        System.out.println("Dime la altura del rectangulo");
        int alturaRectangulo = sc.nextInt();

        int areaRectangulo = baseRectangulo*alturaRectangulo;

        System.out.println("El área de tu rectangulo es de " + areaRectangulo + " Cm2");


    }
}
