package Pruebas;

import java.util.Scanner;

public class pruebaEj56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la altura del triángulo: ");
        int altura = sc.nextInt();

        for (int i =0;i<altura;i++) {
            for (int j = 0;j<i;j++){
                System.out.print(" ");
            }
            for (int k = 0; k<2*(altura-i);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
