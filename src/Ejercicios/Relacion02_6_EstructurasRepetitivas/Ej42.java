package Ejercicios.Relacion02_6_EstructurasRepetitivas;

import java.util.Scanner;

public class Ej42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dime un numero entero positivo");
        int numIntroducido = sc.nextInt();


        for (int i = numIntroducido;i<=numIntroducido+4;i++){
            //con este bucle sacamos los 5 numeros posteriores al introducido
            int contadorDivisores=0;
            //con este bucle recorremos desde 1 hasta el valor de i en cada vuelta y comprobamos si al dividir
            //i entre j su resto da 0, si es así quiere decir que tenemos un divisor exacto y aumentamos en 1 la variable "contadorDivisores".
            //si un numero tiene 2 divisores es primo, si tiene más no lo es.
            for (int j=1;j<=i;j++){
                if (i%j==0){
                    contadorDivisores++;
                }


            }
            if (contadorDivisores==2){
                System.out.println(i+" Es primo");

            }else{
                System.out.println(i+" No es primo");
            }

        }


    }
}
