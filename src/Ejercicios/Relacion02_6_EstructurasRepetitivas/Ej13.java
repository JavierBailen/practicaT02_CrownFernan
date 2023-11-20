package Ejercicios.Relacion02_6_EstructurasRepetitivas;

import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contadorNegativos=0;
        int contadorPositivos=0;
        int contadorCeros = 0;

        for (int i=1;i<=10;i++){

            System.out.println("Introduce 1 numero ,"+(11-i)+" Numeros a introducir para continuar:");
            int numIntroducido = sc.nextInt();


                if (numIntroducido<0){
                    contadorNegativos++;
                }else{
                    if (numIntroducido>0){
                        contadorPositivos++;
                    }else{
                        contadorCeros++;
                    }
                }
        }
        System.out.println("De los 10 numeros introducidos "+contadorPositivos+" Eran positivos y "+contadorNegativos+" Eran negativos y "+contadorCeros+" era cero");

    }
}
