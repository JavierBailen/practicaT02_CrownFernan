package Ejercicios.Relacion02_3_LecturaDeDatosTeclado;

import java.util.Scanner;

public class Ej07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la base imponible de la factura y te digo la factura total");
        double baseImponible = sc.nextDouble();

        double facturaCompleta = baseImponible * 1.21;
        double totalIva = baseImponible*0.21;

        System.out.println("*****FACTURACIÓN*****");
        System.out.println("Base imponible: " +baseImponible +"Euros");
        System.out.println("IVA General: 21%");
        System.out.println("Factura total: " + facturaCompleta + " Euros");
    }
}
