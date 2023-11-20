package Ejercicios.Relacion02_5_EstructurasSelectivas;

import java.util.Scanner;

public class Ej04 {
    //Vamos a ampliar uno de los ejercicios de la relación anterior para considerar las horas extras.
    //Escribe un programa que calcule el salario semanal de un trabajador teniendo en cuenta que
    //las horas ordinarias (40 primeras horas de trabajo) se pagan a 12 euros la hora. A partir de la
    //hora 41, se pagan a 16 euros la hora.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime las horas que has trabajado esta semana");

        int horasSemTrabajadas = sc.nextInt();
        int cantidadTopeHorasOrdinarias=40;
        int salarioSemanal=0;
        int precioHasta40Hrs=12;
        int precio41HorasEnAdelante=16;


        if (horasSemTrabajadas<=40){
            salarioSemanal=horasSemTrabajadas*precioHasta40Hrs;
            System.out.println("Has trabajado " +horasSemTrabajadas+ " Horas esta semana, por lo tanto te corresponden: " +salarioSemanal+" Euros");
        }else{
            if (horasSemTrabajadas>=41){
                 salarioSemanal = (cantidadTopeHorasOrdinarias*precioHasta40Hrs)+(horasSemTrabajadas-cantidadTopeHorasOrdinarias)*precio41HorasEnAdelante;

                System.out.println("El salario semanal es: " +salarioSemanal +" Euros");

                System.out.println("Los "+(salarioSemanal-cantidadTopeHorasOrdinarias*precioHasta40Hrs+" Euros extra son debidos a tus horas extra esta semana, "
                        +(horasSemTrabajadas-cantidadTopeHorasOrdinarias))+"(Horas extra)");


            }
        }

    }


}
