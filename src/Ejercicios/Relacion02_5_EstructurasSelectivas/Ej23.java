package Ejercicios.Relacion02_5_EstructurasSelectivas;

import java.util.Scanner;

public class Ej23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un año y te digo si es bisiesto");
        int año = sc.nextInt();

        if (año%400==0||año%100!=0&&año%4==0){
            System.out.println("Este año es bisiesto");

        }else{
            System.out.println("Este año no es bisiesto");
        }

    }
}
