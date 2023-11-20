package Ejercicios.Relacion02_6_EstructurasRepetitivas;

import java.util.Scanner;

public class Ej23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumaNumeros=0;
        int numIntroducidos=0;
        int contadorNums=0;
        int media = 0;

        do {
            System.out.println("Dime numeros");
             numIntroducidos = sc.nextInt();

             sumaNumeros+=numIntroducidos;
            System.out.println("Te queda: "+(10000-sumaNumeros));
            contadorNums++;


                    if (sumaNumeros>=10000){
                         media=  sumaNumeros/contadorNums;
                         System.out.println("Total acumulado: "+sumaNumeros);
                         System.out.println("Media: "+media);
                         System.out.println("contador de numeros: " +contadorNums);
                    }



        }while (sumaNumeros<10000);



    }
}
