package Ejercicios.Relacion02_6_EstructurasRepetitivas;

import java.util.Scanner;

public class Ej21 {
    public static void main(String[] args) {
        //Realiza un programa que vaya pidiendo números hasta que se introduzca un numero
        //negativo y nos diga cuantos números se han introducido, la media de los impares y el
        //mayor de los pares. El número negativo sólo se utiliza para indicar el final de la
        //introducción de datos pero no se incluye en el cómputo.


        Scanner sc = new Scanner(System.in);
        int sumaNumeros =0;
        int sumaImpares;
        int mayorPares=0;
        double mediaNumeros=0;
        int contadorNums=0;
        int mediaImpares;
        int contadorNumImpares=0;


        do {
            mediaImpares=0;
            sumaImpares=0;
            System.out.println("Dime numeros hasta llegar a 10.000");
            int numIntroducido = sc.nextInt();
             sumaNumeros +=numIntroducido;
             contadorNums++;

            if (sumaNumeros>=10000){
                mediaNumeros= (double) sumaNumeros /contadorNums;

                if (numIntroducido%2!=0){
                    contadorNumImpares++;
                    sumaImpares+=numIntroducido;
                    mediaImpares= sumaImpares/contadorNumImpares;
                }
            }



        }while (sumaNumeros<10000);

        System.out.println("Numeros introducidos hasta llegar a 10.000: " +contadorNums);
        System.out.println("Media de los numeros impares: " + mediaImpares);


    }
}
