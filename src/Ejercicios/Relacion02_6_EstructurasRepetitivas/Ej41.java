package Ejercicios.Relacion02_6_EstructurasRepetitivas;

import java.util.Scanner;

public class Ej41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un numero entero positivo");
        long numIntroducido = sc.nextLong();
        long copiaNum=numIntroducido;
        int ultimoDigito=0;
        int cantDigitosImpares=0;
        int cantDigitosPares=0;


        while (numIntroducido>0){
            ultimoDigito= (int) (numIntroducido%10);

            if (ultimoDigito%2==0){
                cantDigitosPares++;
            }else {
                cantDigitosImpares++;
            }
            numIntroducido/=10;


        }
        System.out.println("El "+copiaNum+" Contiene "+cantDigitosPares+ " Digitos Pares y "+cantDigitosImpares+" digitos impares");
    }
}
