package Ejercicios.Relacion02_5_EstructurasSelectivas;

import java.util.Scanner;

public class Ej06 {
    public static void main(String[] args) {
        //Realiza un programa que calcule el tiempo que tardará en caer un objeto desde una altura
        //h. Aplica la fórmula t = √2h/g siendo g = 9:81m/s2

        double g = 9.81;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime una altura (h)");
        double h = sc.nextDouble();

        double t = Math.sqrt(2*h/g);

        System.out.println("El tiempo que tardará tu objeto en caer será " + t +" Segundos");


    }
}
