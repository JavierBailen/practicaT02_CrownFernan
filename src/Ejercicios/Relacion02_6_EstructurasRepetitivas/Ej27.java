package Ejercicios.Relacion02_6_EstructurasRepetitivas;

import java.util.Scanner;

public class Ej27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int contadorMultiplos3=0;
        int sumaMultiplos3=0;
        int numerosMultiplos3=0;

        for (int i =1;i<=num;i++){

            if (i%3==0){
                contadorMultiplos3++;
                sumaMultiplos3 +=i;
                numerosMultiplos3=i;

                System.out.println(numerosMultiplos3+" Es múltiplo de 3");
                System.out.println();

            }



        }
        System.out.println("Contador de numeros multiplos de 3: " +contadorMultiplos3);
        System.out.println("Suma de numeros multiplos de 3: " +sumaMultiplos3);

    }
}
