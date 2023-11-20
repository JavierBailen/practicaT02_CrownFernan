package Ejercicios.Relacion02_6_EstructurasRepetitivas;

import java.util.Scanner;

public class Ej68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Dime un numero y te lo dislo-co");
        long num = sc.nextLong();
        long copiaNum=num;
        long multiplicador = 1;
        long numDislocado=0;



            while (num>0){
                long ultimoDigito=num%10;

                if (ultimoDigito%2==0){
                    ultimoDigito=ultimoDigito+1;
                }else{
                    ultimoDigito=ultimoDigito-1;
                }
                numDislocado=ultimoDigito*multiplicador+numDislocado;
                num/=10;
                //En un principio se multiplicará por 10, despues por 100, 1000....etc
                multiplicador*=10;


            }


        System.out.println("El numero "+copiaNum+" Dislo-cado sale: "+ numDislocado);
    }
}
