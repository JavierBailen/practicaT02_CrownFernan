package Ejercicios.Relacion02_6_EstructurasRepetitivas;

import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double media = 0;
        int contadorNums=0;
        int sumaNumeros=0;//Variable que utilizo para sumar el valor de cada numero introducido
        int num;

        do {//Este bucle se va a ejecutar como mínimo 1 VEZ , después comprueba condiciones y si son las pactadas se repite el contenido.

            System.out.println("Dime numeros y te digo la media (Introduce un numero negativo para dejar de introducir numeros)");
            num = sc.nextInt();

                 if (num>=0){
                     sumaNumeros=sumaNumeros+num;
                     contadorNums++;
                    }

        } while (num >= 0);

        if (contadorNums>0){
            media= (double) sumaNumeros /contadorNums;
            System.out.println("La media de tus numeros es: "+media);
            System.out.println("Cantidad de números introducidos: " +contadorNums);
        }else{
            System.out.println("Valores no válidos");
        }
    }
}
