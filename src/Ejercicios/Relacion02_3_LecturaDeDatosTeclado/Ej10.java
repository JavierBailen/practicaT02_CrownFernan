package Ejercicios.Relacion02_3_LecturaDeDatosTeclado;

import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la cantidad de Mb que quieres convertir a Kb");
        double mB = sc.nextDouble();
        double kB = mB*1000;

        System.out.println(mB +"Mb son " + kB +" Kb");
    }
}
