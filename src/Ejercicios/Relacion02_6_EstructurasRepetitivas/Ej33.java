package Ejercicios.Relacion02_6_EstructurasRepetitivas;

import java.util.Scanner;

public class Ej33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la altura");
        int altura = sc.nextInt();
        System.out.println("Dime la anchura");
        int anchura= sc.nextInt();

        for (int filas = 1; filas <=altura; filas++){
            for (int columnas = 1; columnas <=anchura; columnas++){
                //La tercera condición del if determina la base, asi se calcula para que para cada medida que introduzcamos siempre falten dos asteriscos a cada esquina.
                if (columnas ==1 && filas <altura || columnas ==anchura && filas <altura || filas ==altura && (columnas >1 && columnas <anchura)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
