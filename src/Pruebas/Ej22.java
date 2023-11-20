package Pruebas;

import java.util.Scanner;

public class Ej22 {
    public static void main(String[] args) {


        boolean esPrimo;

        for (int i =2;i<=100;i++){
            esPrimo=true;

            for (int j=2;j<i;j++){
                if (i%j==0){
                    esPrimo=false;
                    break;
                }
            }

            if (esPrimo){
                System.out.println(i);
            }


        }


    }
}
