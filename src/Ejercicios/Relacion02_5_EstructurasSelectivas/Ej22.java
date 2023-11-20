package Ejercicios.Relacion02_5_EstructurasSelectivas;

import java.util.Scanner;

public class Ej22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la cantidad de tu importe(€)");
        double importeCompra = sc.nextDouble();
        double descuento =0;
        double cantidadDescontada = 0;
        double importeTotal = 0;




        if (importeCompra<200){
            descuento = 0;
            cantidadDescontada=importeCompra;
            System.out.println("Tu importe al ser menor de 200€ no tiene descuento, tu importe a total es: " + importeCompra+"€");
        }else{
            if (importeCompra>=200&&importeCompra<=500){

                cantidadDescontada=importeCompra*0.05;
                importeTotal=importeCompra-cantidadDescontada;
                System.out.println("Tu importe total es de: " + importeCompra);
                System.out.println("tu importe oscila entre 200€-500€, tienes un 5% de descuento, pagas : " +importeTotal+"€");
            }else{
                if (importeCompra>501&&importeCompra<=1000){
                    descuento=0.10;
                    cantidadDescontada=importeCompra*descuento;
                    importeTotal=importeCompra-cantidadDescontada;
                    System.out.println("Tu importe total es de: " +importeCompra+"€");
                    System.out.println("Tu importe oscila entre 501€-1000€, tienes un descuento del 10%, pagas: " +importeTotal+"€");
                }else{
                    if (importeCompra>1000){
                        descuento=0.15;
                        cantidadDescontada=importeCompra*descuento;
                        importeTotal=importeCompra-cantidadDescontada;
                        System.out.println("Tu importe total es de: "+importeCompra+"€");
                        System.out.println("Tu importe supera los 1000€, se aplica un 15% de descuento, pagas: " +importeTotal+"€");
                    }
                }
            }
        }
    }
}
