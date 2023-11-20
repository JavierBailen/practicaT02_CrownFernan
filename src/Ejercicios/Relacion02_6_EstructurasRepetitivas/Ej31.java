package Ejercicios.Relacion02_6_EstructurasRepetitivas;

import java.util.Scanner;

public class Ej31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la altura de la L");
        int altura = sc.nextInt();
        int anchura = (altura+1)/2;

        for (int i =1;i<=altura;i++){

            for (int j=1;j<=anchura+1;j++){
                if (i==altura || j==1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }
}
