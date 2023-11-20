package Ejercicios.Relacion02_6_EstructurasRepetitivas;

import java.util.Scanner;

public class Ej71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int copiaNum=num;
        int ultimaCifra =0;
        int numInvertido = 0;

        while (num>0){
            ultimaCifra = num%10;
            numInvertido = numInvertido *10+ultimaCifra;
            num/=10;
        }

        if (numInvertido==copiaNum){
            System.out.println("Numero capicua");
        }else {
            System.out.println("No es capicua");
        }



    }
}
