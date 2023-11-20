package Ejercicios.Relacion02_6_EstructurasRepetitivas;

import java.util.Scanner;

public class Ej47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la altura");
        int altura = sc.nextInt();
        System.out.println("Dime la anchura");
        int anchura = sc.nextInt();


        if (altura%2==0 || altura<5){
            System.out.println("Error");
        }else{
            for (int i =1;i<=altura;i++){

                for (int j=1;j<=anchura;j++){
                    if (i==1 || i==(altura/2)+1 || i==altura || j==1 || j==anchura){
                        System.out.print("M");
                    }else {
                        System.out.print(" ");
                    }

                }
                System.out.println();
            }
        }


    }
}
