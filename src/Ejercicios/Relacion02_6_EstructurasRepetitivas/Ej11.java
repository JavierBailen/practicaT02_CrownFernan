package Ejercicios.Relacion02_6_EstructurasRepetitivas;

import java.util.Scanner;

import static Ejercicios.Relacion02_3_LecturaDeDatosTeclado.Ej13.ANSI_BLUE;
import static Ejercicios.Relacion02_3_LecturaDeDatosTeclado.Ej13.ANSI_RESET;

public class Ej11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un numero");
        int numIntroducido=sc.nextInt();
        int cuadrado=0;
        int cubo=0;

        for (int i=numIntroducido+1;i<=numIntroducido+5;i++){

            cuadrado= (int) Math.pow(i,2);
            cubo = (int) Math.pow(i,3);
            System.out.printf("Numero:%d\n Cuadrado:%d \n cubo:%d\n",i,cuadrado,cubo);
            System.out.println();


        }

    }
}
