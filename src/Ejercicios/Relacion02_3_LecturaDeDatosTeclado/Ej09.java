package Ejercicios.Relacion02_3_LecturaDeDatosTeclado;

import java.util.Scanner;

public class Ej09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el radio de tu cono");
        double radioCono = sc.nextDouble();
        System.out.println("Dime la altura de tu cono");
        double alturaCono = sc.nextDouble();
        final double pi = Math.PI;
        double volumenCono = (1.0 / 3) * pi * Math.pow(radioCono, 2) * alturaCono;

        System.out.println("El volumen de tu cono es de " + volumenCono + " cm3 ");
    }
}
