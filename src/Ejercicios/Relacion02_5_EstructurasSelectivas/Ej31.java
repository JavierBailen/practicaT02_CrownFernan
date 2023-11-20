package Ejercicios.Relacion02_5_EstructurasSelectivas;

import java.util.Scanner;

public class Ej31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Turno del jugador 1: (piedra,papel o tijera): ");
        String jugada1=sc.next();
        System.out.println("Turno del jugador 2: (piedra, papel o tijera): ");
        String jugada2=sc.next();



        if(jugada1.equals("piedra")&&jugada2.equals("papel")) System.out.println("Gana el jugador 2");
        else if (jugada1.equals("piedra")&&jugada2.equals("tijeras")) System.out.println("Gana el jugador 1");
        else if (jugada1.equals("piedra")&&jugada2.equals("piedra")) System.out.println("Empate");
        else if (jugada1.equals("papel")&&jugada2.equals("piedra")) System.out.println("Gana el jugador 2");
        else if (jugada1.equals("papel")&&jugada2.equals("tijera")) System.out.println("Gana el jugador 2");
        else if (jugada1.equals("papel")&&jugada2.equals("papel")) System.out.println("Empate");
        else if (jugada1.equals("tijeras")&&jugada2.equals("papel")) System.out.println("Gana el jugador 1");
        else if (jugada1.equals("tijeras")&&jugada2.equals("piedra")) System.out.println("Gana el jugador 2");
        else if (jugada1.equals("tijeras")&&jugada2.equals("tijera")) System.out.println("Empate"); {

        }
        {

        }
        {

        }
        {

        }
        {

        }
        {
            
        }
        {
            
        }
        {
            
        }
    }
}
