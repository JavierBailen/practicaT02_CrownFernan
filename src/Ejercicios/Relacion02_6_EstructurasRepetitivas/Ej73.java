package Ejercicios.Relacion02_6_EstructurasRepetitivas;

import java.util.Scanner;

public class Ej73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el exponente x ");
        int num = sc.nextInt();
        System.out.println("Dime el exponente y ");
        int exponente = sc.nextInt();
        int elevado = 1;


        for (int i = 1;i<=exponente;i++){
           elevado *= num;
        }
        System.out.println(num+"^"+exponente +"= "+elevado);


    }
}
