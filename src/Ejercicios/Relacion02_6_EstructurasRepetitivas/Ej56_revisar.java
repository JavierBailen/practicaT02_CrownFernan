package Ejercicios.Relacion02_6_EstructurasRepetitivas;

import java.util.Scanner;

public class Ej56_revisar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la altura");
        int altura = sc.nextInt();

        for (int i = altura;i>=1;i--){
            for (int j = 8;j>=1;j--){
                if (j<i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
