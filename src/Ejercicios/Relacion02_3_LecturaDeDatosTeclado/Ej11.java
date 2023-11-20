package Ejercicios.Relacion02_3_LecturaDeDatosTeclado;

import java.util.Scanner;

public class Ej11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la cantidad de Kb que quieres convertir a Mb");
        double cantidadKb = sc.nextDouble();
        double cantidadMb = cantidadKb *0.001;

        System.out.println(cantidadKb +"Kb son " +cantidadMb +"Mb");
    }
}
