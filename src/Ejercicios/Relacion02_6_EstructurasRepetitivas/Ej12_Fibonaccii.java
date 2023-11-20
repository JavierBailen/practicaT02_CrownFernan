package Ejercicios.Relacion02_6_EstructurasRepetitivas;

import java.util.Scanner;

public class Ej12_Fibonaccii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el num en la sucesion de fibonacci");
        int n = sc.nextInt();

        int termino1=0;
        int termino2=1;

        if (n>=1){
            System.out.print(termino1);
        }
        if (n>=2){
            System.out.print(", "+termino2);
        }

        for (int i = 3;i<=n;i++){
            int terminoActual = termino1+termino2;
            System.out.print(", "+terminoActual);
            termino1=termino2;
            termino2=terminoActual;
        }



    }
}
