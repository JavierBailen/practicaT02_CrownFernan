package Ejercicios.Relacion02_5_EstructurasSelectivas;

import java.util.Scanner;

public class Ej14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero entero y te digo si es divisible entre 5 y si es par");
        int numero = sc.nextInt();

        if (numero%2==0&&numero%5==0){
            System.out.println("Tu numero es divisible entre 5 y es par");
        }else{
            if (numero%2==0&&numero%5!=0){
                System.out.println("Tu numero es par pero no es divisible entre 5");
            }else{
                if (numero%2!=0&&numero%5==0){
                    System.out.println("Tu numero es impar pero es divisible entre 5");
                }
            }

        }
    }
}
