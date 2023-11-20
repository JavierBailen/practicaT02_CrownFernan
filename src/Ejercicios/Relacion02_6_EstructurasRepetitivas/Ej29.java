package Ejercicios.Relacion02_6_EstructurasRepetitivas;

import java.util.Scanner;

public class Ej29 {
    public static void main(String[] args) {
        //Escribe un programa que muestre por pantalla todos los números enteros positivos
        //menores a uno leído por teclado que no sean divisibles entre otro también leído de
        //igual forma.

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero");
        int num1=sc.nextInt();
        System.out.println("Dime otro numero");
        int num2=sc.nextInt();


        for (int i = 1;i<=num1;i++){
            if (i%num2!=0){
                System.out.println(" Numeros menores a "+num1+" Que no son divisibles con "+num2+" :"+i);
            }
        }


    }
}
