package Ejercicios.Relacion02_6_EstructurasRepetitivas;

import java.util.Scanner;

public class Ej62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero");
        int num = sc.nextInt();
        int numTemp=num;
        int cantNumBuenaSuerte = 0;
        int cantNumMalaSuerte =0;
        int ultimoDigito=0;




        while (num>0){

            ultimoDigito=num%10;

            if (ultimoDigito==3 || ultimoDigito==7 || ultimoDigito==8 || ultimoDigito == 9){
                cantNumBuenaSuerte++;
            }else{
                cantNumMalaSuerte++;
            }

            num/=10;
        }



        if (cantNumMalaSuerte>=cantNumBuenaSuerte){
            System.out.println("El numero "+numTemp+" No es afortunado");
        }else{
            System.out.println("El numero "+ numTemp+" Es afortunado");
        }

    }
}
