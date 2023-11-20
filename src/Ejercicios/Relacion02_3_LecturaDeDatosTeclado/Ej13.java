package Ejercicios.Relacion02_3_LecturaDeDatosTeclado;

import java.util.Scanner;

public class Ej13 {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Proporciona el nombre: ");
        String libro = sc.next();
        System.out.println("Proporciona el id ");
        int id = sc.nextInt();
        System.out.println("Proporciona el precio");
        double precio = sc.nextDouble();
        System.out.println("Proporciona el envio gratuito");
        String gratuitoOno = sc.next();

        System.out.println(ANSI_BLUE + libro + "#" + id + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "Precio :" + precio +" Euros"+ ANSI_RESET);
        System.out.println(ANSI_RED + "Envio gratuito " + gratuitoOno);

    }
}
