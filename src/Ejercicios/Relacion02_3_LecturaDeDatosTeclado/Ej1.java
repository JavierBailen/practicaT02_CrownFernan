package Ejercicios.Relacion02_3_LecturaDeDatosTeclado;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un numero");
        int num1 = sc.nextInt();
        System.out.println("Dime otro numero");
        int num2 = sc.nextInt();

        int multiplicacion = num1*num2;

        System.out.println("La multiplicación entre " + num1 + " Y  " +num2 + " Es  " + multiplicacion);

    }
}
