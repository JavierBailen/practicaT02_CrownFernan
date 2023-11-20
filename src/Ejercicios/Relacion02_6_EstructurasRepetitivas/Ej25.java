package Ejercicios.Relacion02_6_EstructurasRepetitivas;

import java.util.Scanner;

public class Ej25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        System.out.println("Dime un numero");
        int num = sc.nextInt();

        String numString=String.valueOf(num);
        String numAlReves="";

        for (int i =numString.length()-1;i>=0;i--){
            numAlReves+=numString.charAt(i);
        }
        System.out.println("El numero al reves es: " + numAlReves);


    }
}
