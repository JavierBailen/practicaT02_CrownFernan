package Ejercicios.Relacion02_3_LecturaDeDatosTeclado;

import java.util.Scanner;

public class Ej02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime la cantidad de euros que quieres convertir a libras");
        int cantEuros = sc.nextInt();
        double precioLibra = 0.87;

        System.out.println(cantEuros + " Euros son " + (cantEuros*precioLibra) + " Libras ");
    }
}
