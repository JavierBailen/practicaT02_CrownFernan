package Pruebas;

import java.util.Scanner;

public class trianguloIzq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el numero de filas");
        int numFilas = sc.nextInt();

        for (int i =1;i<=numFilas;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
