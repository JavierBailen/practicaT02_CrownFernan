package Pruebas;

import java.util.Scanner;

public class PiramideInvertida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la altura");
        int h = sc.nextInt();

        for (int i =h;i>0;i--){
            //i=h(5),
            for (int j= h;j>i;j--){
                System.out.print(" ");
            }

            for (int k = 0;k<2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
