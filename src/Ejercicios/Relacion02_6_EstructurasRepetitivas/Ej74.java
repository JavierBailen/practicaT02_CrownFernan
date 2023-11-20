package Ejercicios.Relacion02_6_EstructurasRepetitivas;

import java.util.Scanner;

public class Ej74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int combinacion = 5486;
        int numIntentos = 4;

        do {
            System.out.println("CAJA RURAL. INTRODUZCA COMBINACIÓN PARA ABRIR LA CAJA");
            int combiIntroducida= sc.nextInt();

            if (combiIntroducida==combinacion){
                System.out.println("COMBINACIÓN CORRECTA, ABRIENDO CAJA...");
                break;
            }else{
                numIntentos--;
                System.out.println("COMBINACIÓN INCORRECTA. TE QUEDAN: "+numIntentos+" Intentos ");

                if (numIntentos==0){
                    System.out.println("NUMERO DE INTENTOS CONSUMIDOS. BLOQUEANDO CAJA...");
                    break;
                }
            }
        }while (numIntentos>0);

    }
}
