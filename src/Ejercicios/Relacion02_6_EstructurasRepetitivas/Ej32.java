package Ejercicios.Relacion02_6_EstructurasRepetitivas;

import java.util.Scanner;

public class Ej32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numPares=0;
        int sumaPares=0;

        System.out.println("Dime un numero ");
        String num = sc.next();

        System.out.print("Dígitos pares:");
        for (int i = 0;i<num.length();i++){

            if (num.charAt(i)%2==0){
                numPares++;
                System.out.print(num.charAt(i));
                sumaPares+= Character.getNumericValue(num.charAt(i)); //aqui obtenemos el valor específico en la posicion "i", es decir cuando num.charAt(i)%2==0
            }

        }
        System.out.println();
        System.out.println("Suma de los numeros pares: "+sumaPares);


    }
}
