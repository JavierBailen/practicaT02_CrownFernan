package Ejercicios.Relacion02_3_LecturaDeDatosTeclado;

import java.util.Scanner;

public class Ej03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la cantidad de libras que quieres introducir a euros");
        double libras = sc.nextDouble();

        double precioEuro = 1.15;

        System.out.println(libras + "Libras son " + (libras*precioEuro) + " Euros");
    }
}
