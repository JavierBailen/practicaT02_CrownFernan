package Ejercicios.Relacion02_5_EstructurasSelectivas;

import java.util.Scanner;

public class Ej21_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tablas de la verdad: Selecciona (&&,||,!)");
        String tipoOperador = sc.next();

        switch (tipoOperador){
            case "&&"->{
                System.out.println("A"+"\t"+"B"+"\t"+"C");
                System.out.println("----------");
                System.out.println("T"+"\t"+"T"+"\t"+"="+"T");
                System.out.println("F"+"\t"+"T"+"\t"+"="+"F");
                System.out.println("T"+"\t"+"F"+"\t"+"="+"F");
                System.out.println("F"+"\t"+"F"+"\t"+"="+"F");
            }
            case "||"->{

            }
        }
    }
}
