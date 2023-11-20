package Ejercicios.Relacion02_3_LecturaDeDatosTeclado;

import java.util.Scanner;

public class Ej12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la nota de tu primer examen (40%)");
        double notaExamen1 = sc.nextDouble();
        System.out.println("Dime la media que deseas");
        double mediaDeseada = sc.nextDouble();
        double notaExamen2 = (mediaDeseada-0.4*notaExamen1)/0.6;

        System.out.println("Has sacado un " + notaExamen1 +"En el primer examen(40%), y quieres de media un " + mediaDeseada +" Por lo tanto, para llegar a esa media te hace falta sacar en el segundo examen (60%) un " + notaExamen2);

    }
}
