package Ejercicios.Relacion02_6_EstructurasRepetitivas;

import java.util.Scanner;

public class Ej39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero entero positivo");
        int numIntroducido = sc.nextInt();
        int factorial = 1;


        for (int i = 1;i<=numIntroducido;i++){
            factorial *=i;
            System.out.printf("%d! = %d\n",i,factorial);

        }


    }
}
