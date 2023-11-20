package Ejercicios.Relacion02_6_EstructurasRepetitivas;

import java.util.Scanner;

public class Ej17 {
    public static void main(String[] args) {
        //Realiza un programa que sume los 100 números siguientes a un número entero y
        //positivo introducido por teclado. Se debe comprobar que el dato introducido es
        //correcto (que es un número positivo).

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un numero: ");
        int num = sc.nextInt();
        int suma = 0;

        if (num>0){

            for (int i =num+1;i<=num +100;i++){
                suma=i+num;

            }

            System.out.println("La suma de los 100 siguientes numeros a partir del " +num+" es: "+(suma));
        }else{
            System.out.println("Valor negativo");

        }




    }
}
