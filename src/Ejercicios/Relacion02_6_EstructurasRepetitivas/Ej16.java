package Ejercicios.Relacion02_6_EstructurasRepetitivas;

import java.util.Scanner;

public class Ej16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.println("Dime un numero:");
            num = sc.nextInt();

            if (num <= 1){
                System.out.println("No primo");
            }else {
                
                int contadorDeDivsores = 0;
                for (int i = 1; i <= num; i++) {
                    if (num % i == 0) {
                        contadorDeDivsores++;
                    }
                }

                if (contadorDeDivsores == 2) {
                    System.out.println("Primo");
                } else {
                    System.out.println("No primo");
                }
            }
        } while (num > 0);
    }
}
