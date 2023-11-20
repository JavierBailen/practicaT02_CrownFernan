package Ejercicios.Relacion02_5_EstructurasSelectivas;


import java.util.Scanner;

import static Ejercicios.Relacion02_3_LecturaDeDatosTeclado.Ej13.ANSI_RESET;


public class Ej11_C {
    public static void main(String[] args) {
        //Escribe un programa que dada una hora determinada (horas y minutos), calcule los segundos
        //que faltan para llegar a la medianoche.
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime una hora");
        int hora = sc.nextInt();
        System.out.println("Dime minutos");
        int minutos = sc.nextInt();

        int minutosAsegundos=minutos*60;
        int horasAsegundo=hora*3600; //Multiplicamos por 3600 ya que son los segundos que hay en 1 hora.
        int medianoche = (12*60)*60;//segundos que tienen que pasar hasta medianoche
        int horasYminutosAsegundos = horasAsegundo+minutosAsegundos;

        System.out.println("Has introducido la hora: " +hora +":"+minutos+ " Minutos");
        System.out.println("Según las horas y minutos que has introducido son : "+ANSI_CYAN +horasYminutosAsegundos +" Segundos"+ANSI_RESET );
        System.out.println("Quedan : " +(medianoche-horasYminutosAsegundos)+" Segundos hasta la media noche");



    }

    public static String ANSI_CYAN = "\u001B[36m";

}
