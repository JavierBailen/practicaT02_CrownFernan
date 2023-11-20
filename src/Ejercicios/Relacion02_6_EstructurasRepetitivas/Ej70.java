package Ejercicios.Relacion02_6_EstructurasRepetitivas;

import java.util.Scanner;

public class Ej70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero");
        String num = sc.next();



        for (int i =0; i<=num.length();i++){
            System.out.print(num.charAt(i));//Mostramos la cifra aqui.

            if (i!=num.length()-1){
                System.out.print(", ");
            }
        }






    }
}
