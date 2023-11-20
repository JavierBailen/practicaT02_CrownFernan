package Ejercicios.Relacion02_5_EstructurasSelectivas;

import java.util.Scanner;

public class Ej28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la altura de la bandera");
        double altura = sc.nextDouble();
        System.out.println("Introduce la anchura de la bandera");
        double anchura = sc.nextDouble();
        System.out.println("Quieres bordado? (s/n)");
        String bordadoOno = sc.next();
        double medidaBandera = altura * anchura;
        double precioBandera = (medidaBandera)/100;
        double precioGastosEnvio =3.25;
        double precioBordado =2.5;
        double precioBaseBandera;
        double precioTotalBandera=0;

        if (bordadoOno.equals("s")) {
            precioBaseBandera = precioBandera;
            precioTotalBandera = precioBandera + precioBordado + precioGastosEnvio;
            System.out.println("Gracias! Aquí tiene el desglose de su compra.");
            System.out.println("Bandera de " + medidaBandera + " cm2: " + precioBaseBandera + "€");
            System.out.println("Gastos de bordado: " + precioBordado + "€");
            System.out.println("Gastos de envío: " + precioGastosEnvio + "€");
            System.out.println("Total: " + precioTotalBandera + "€");

        } else if (bordadoOno.equals("n")) {
            precioBaseBandera = precioBandera;
            precioBordado = 0;
            precioTotalBandera = precioBandera + precioGastosEnvio;
            System.out.println("Gracias! Aquí tiene el desglose de su compra.");
            System.out.println("Bandera de " + medidaBandera + " cm2: " + precioBaseBandera + "€");
            System.out.println("Gastos de bordado: " + precioBordado + "€");
            System.out.println("Gastos de envío: " + precioGastosEnvio + "€");
            System.out.println("Total: " + precioTotalBandera + "€");
        }
    }
}
