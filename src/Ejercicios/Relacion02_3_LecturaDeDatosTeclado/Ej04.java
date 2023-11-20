package Ejercicios.Relacion02_3_LecturaDeDatosTeclado;

import java.util.Scanner;

public class Ej04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero");
        double num1 = sc.nextDouble();
        System.out.println("Dime otro numero");
        double num2 = sc.nextDouble();

        double suma = num1+num2;
        double multiplicacion = num1*num2;
        double resta = num1-num2;
        double division = num1/num2;


        System.out.println("La suma de " +num1 +" + " +num2 + " Es " +suma);
        System.out.println("La resta de " +num1 +" - " +num2 + " Es " +resta);
        System.out.println("La multiplicación de " +num1 +" * " +num2 + " Es " +multiplicacion);
        System.out.println("La división de " +num1 +" / " +num2 + " Es " +division);
    }
}
