package Ejercicios.Relacion02_6_EstructurasRepetitivas;

import java.util.Scanner;

public class Ej28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un numero");
        int num=sc.nextInt();
        int factorial = 1; //hay que ponerlo a 1 ya que todo factorial se inicia en 1.


        for (int i =1;i<=num;i++){
            factorial *=i;

        }
        System.out.println("El factorial de "+num+" Es "+factorial);

    }
}
