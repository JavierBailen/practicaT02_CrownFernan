package Ejercicios.Relacion02_6_EstructurasRepetitivas;

import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero");
        long num = sc.nextLong();
        long copiaNum = num;
        int cantDigitos = 0;

        while (num>0){
            cantDigitos++;
            num/=10;
        }
        System.out.println("El numero "+copiaNum+" Tiene "+cantDigitos+" Digitos");


    }
}
