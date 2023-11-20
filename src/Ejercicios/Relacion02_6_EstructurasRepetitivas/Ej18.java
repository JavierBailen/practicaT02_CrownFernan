package Ejercicios.Relacion02_6_EstructurasRepetitivas;

import java.util.Scanner;

public class Ej18 {
    public static void main(String[] args) {
        //Escribe un programa que obtenga los números enteros comprendidos entre dos
        //números introducidos por teclado y validados como distintos, el programa debe
        //empezar por el menor de los enteros introducidos e ir incrementando de 7 en 7.
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un numero");
        int num1 = sc.nextInt();
        System.out.println("Dime otro numero");
        int num2 = sc.nextInt();

        if (num1!=num2){

            if (num1>num2){
                for (int i=num2;i<num1;i+=7){
                    System.out.println(i);
                }
            }else{
                if (num2>num1){

                    for (int i=num1;i<num2;i+=7){
                        System.out.println(i);
                    }
                }
            }

        }
    }
}
