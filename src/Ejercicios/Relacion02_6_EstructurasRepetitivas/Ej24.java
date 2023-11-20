package Ejercicios.Relacion02_6_EstructurasRepetitivas;

import java.util.Scanner;

public class Ej24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero");
        int num = sc.nextInt();

        for (int i = 1;i<=4;i++){
            for (int j = 0;j<4-i;j++){
                System.out.print(" ");
            }
            for (int k= 1; k<=2*i-1;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }

}
