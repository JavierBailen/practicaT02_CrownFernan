package Ejercicios.Relacion02_6_EstructurasRepetitivas;

import java.util.Scanner;

public class Ej22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contadorDivisores ;

        for (int i = 2; i<=100;i++){
            boolean esPrimo = true;


            for (int j= 2;j<i;j++){
                if (i%j==0){
                    esPrimo= false;
                    break;
                }
            }
            if (esPrimo){
                System.out.println(i+" Es primo");
            }
        }
    }
}
