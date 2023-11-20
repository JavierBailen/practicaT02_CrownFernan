package Ejercicios.Relacion02_6_EstructurasRepetitivas;

import java.util.Scanner;

public class Ej30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, introduce la primera hora. Día(1-7): ");
        int nombreDia1 = sc.nextInt();
        System.out.print("Hora: ");
        int horaDia1 = sc.nextInt();

        System.out.print("Por favor, introduce la segunda hora. Día(1-7): ");
        int nombreDia2 = sc.nextInt();
        System.out.print("Hora: ");
        int horaDia2 = sc.nextInt();

        int numHorasDiferencia = 0;

        if (nombreDia1 == nombreDia2) {
            System.out.println("Los días introducidos son iguales, selecciona 2 diferentes");
        } else {
            int horasPorDia = 24;
            int diferenciaDias = nombreDia2 - nombreDia1;

            if (diferenciaDias == -1) {
                //si la diferenciaDias da -1 quiere decir que los dias son consecutivos.
                numHorasDiferencia = (horaDia2 - horaDia1) + horasPorDia;
            } else if (diferenciaDias > 0) {
                numHorasDiferencia = (diferenciaDias * horasPorDia) + (horaDia2 - horaDia1);
            }

            System.out.println("Entre las " + horaDia1 + ":00 del día " + nombreDia1 + " y las " + horaDia2 + ":00 del día " + nombreDia2 + " Hay " + numHorasDiferencia + " Horas de diferencia");
        }
    }
}
