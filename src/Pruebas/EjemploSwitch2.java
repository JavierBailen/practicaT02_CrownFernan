package Pruebas;

import java.util.Scanner;

public class EjemploSwitch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero y te digo que mes es");
        int mes=sc.nextInt();
        String nombreMes = " ";

        switch (mes) {
            case 1 -> {
                nombreMes = "Enero";
                System.out.println(nombreMes);
            }

            case 2 -> {
                nombreMes = "Febrero";
                System.out.println(nombreMes);
            }

            case 3 -> {
                nombreMes = "Marzo";
                System.out.println(nombreMes);
            }
            case 4 -> {
                nombreMes = "Abril";
                System.out.println(nombreMes);
            }

            case 5 -> {
                nombreMes = "Mayo";
                System.out.println(nombreMes);
            }

            case 6 -> {
                nombreMes = "Junio";
                System.out.println(nombreMes);
            }

            case 7 -> {
                nombreMes = "Julio";
                System.out.println(nombreMes);
            }

            case 8 -> {
                nombreMes = "Agosto";
                System.out.println(nombreMes);
            }

            case 9 -> {
                nombreMes = "Septiembre";
                System.out.println(nombreMes);
            }

            case 10 -> {
                nombreMes = "Octubre";
                System.out.println(nombreMes);
            }

            case 11 -> {
                nombreMes = "Noviembre";
                System.out.println(nombreMes);
            }
            case 12 -> {
                nombreMes = "Diciembre";
                System.out.println(nombreMes);
            }


        }


    }
}
