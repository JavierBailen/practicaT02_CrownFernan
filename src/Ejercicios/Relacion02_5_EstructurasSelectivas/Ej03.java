package Ejercicios.Relacion02_5_EstructurasSelectivas;

import java.util.Scanner;

public class Ej03 {
    public static void main(String[] args) {
        //Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente nombre del
        //día de la semana.
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un dia del 1 al 7 y te digo el dia de la semana que es");
        int diaSemana = sc.nextInt();

        switch (diaSemana){
            case 1:
                System.out.println("Lunes");
                break;

            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
        }
    }
}
