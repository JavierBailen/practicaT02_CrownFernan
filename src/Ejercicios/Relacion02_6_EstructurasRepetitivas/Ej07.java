package Ejercicios.Relacion02_6_EstructurasRepetitivas;

import java.util.Scanner;

public class Ej07 {
    public static void main(String[] args) {
        int claveCorrecta = 5486;
        int claveIntroducida=0;
        int intentos =4;
        Scanner sc = new Scanner(System.in);

        for (int i =1;i<=4;i++){
            System.out.println("Dime la clave para abrir la caja fuerte: ");
            claveIntroducida=sc.nextInt();

            if (claveIntroducida==claveCorrecta){
                System.out.println("Clave correcta, abriendo caja...");
                break;

            }else{

                System.out.println("Error, te quedan "+(intentos-i)+" Intentos");

            }

            if (intentos-i==0){
                System.out.println("Caja bloqueada");
            }

        }
    }
}
