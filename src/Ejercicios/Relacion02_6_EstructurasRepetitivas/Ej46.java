package Ejercicios.Relacion02_6_EstructurasRepetitivas;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ej46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dime altura del rectangulo");
        int altura = sc.nextInt();
        System.out.println("Dime anchura del rectangulo");
        int anchura = sc.nextInt();

        /*
        En los bucles, la variable i determina el numero de filas, la variable j del bucle interior determina el numero de columnas
        y las instrucciones que se hacen para imprimir asteriscos.
         */


        if (altura>2&&anchura>2){
           /* for (int i = 1;i<=altura;i++){

                for (int j =1;j<=anchura;j++){
                    //COLUMNAS

                    if (i==1 || i==altura || j==1 || j==anchura){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();

            }
            */

            System.out.println("Solución alternativa");
            //Este de abajo es igual que el último(Primera fila)
            for (int i =1; i<=anchura;i++) System.out.print("*");

            for (int i=1;i<=altura-2;i++){
                System.out.print("\n*");
                for (int k=1;k<=anchura-2;k++) System.out.print(" ");
                System.out.print("*");

            }
            System.out.println();
            //Este de abajo es igual que el de arriba del todo (Ultima Fila)
            for (int i =1; i<=anchura;i++) System.out.print("*");


        }else{
            System.out.println("Error");
        }



    }
}
