package Ejercicios.Relacion02_6_EstructurasRepetitivas;

import java.util.Scanner;

public class Ej08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero y te digo su tabla de multiplicar");
        int numTabla = sc.nextInt();

        for (int i =1;i<=10;i++){
            System.out.printf("%d * %d = %d \n" ,numTabla, i , (numTabla*i));
        }
    }
}
