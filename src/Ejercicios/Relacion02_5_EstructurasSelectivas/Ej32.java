package Ejercicios.Relacion02_5_EstructurasSelectivas;

import java.util.Scanner;

public class Ej32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precioPalmera=1.40;
        String bebida="";
        double precioTotal=0;
        double precioZumo=1.50;
        double precioCafe=1.20;
        double precioDonut=1;
        String tipoPitufo="";
        double precioPitufo=0;

        System.out.println("Que ha tomado de comer?(palmera,donut,pitufo): ");
        String tipoComida = sc.next();

        switch (tipoComida){

            case "palmera":
                System.out.println("Qué ha tomado de beber?(zumo o cafe):");
                bebida=sc.next();

                if (bebida.equals("zumo")){
                    precioTotal=precioPalmera+precioZumo;
                    System.out.println("Zumo: 1.50€");
                } else if (bebida.equals("cafe")) {
                    precioTotal=precioPalmera+precioCafe;
                    System.out.println("Cafe: 1.20€");
                }
                System.out.println("Palmera: 1.40€");
                System.out.println("Total desayuno: " +precioTotal+"€");
                break;






            case "donut":


                System.out.println("Qué ha tomado de beber?(zumo o cafe):");
                bebida=sc.next();

                if (bebida.equals("zumo")){
                    precioTotal=precioDonut+precioZumo;
                    System.out.println("Zumo: 1.50€");
                } else if (bebida.equals("cafe")) {
                    precioTotal=precioDonut+precioCafe;
                    System.out.println("Cafe: 1.20€");
                }
                System.out.println("Donut: 1€");
                System.out.println("Total desayuno: " +precioTotal+"€");
                break;




            case "pitufo":
                System.out.println("Con qué ha tomado el pitufo?");
                tipoPitufo=sc.next();
                System.out.println("Que ha tomado de beber?(cafe o zumo)");
                bebida=sc.next();

                if (tipoPitufo.equals("aceite")){
                    precioPitufo=1.20;
                    System.out.println("Pitufo con aceite: 1.20€");
                } else if (tipoPitufo.equals("tortilla")) {
                    precioPitufo=1.60;
                    System.out.println("Pitufo con tortilla: 1.60€");
                }

                if (bebida.equals("zumo")){
                    precioTotal=precioPitufo+precioZumo;
                    System.out.println("Zumo: 1.50€");
                } else if (bebida.equals("cafe")) {
                    precioTotal=precioPitufo+precioCafe;
                    System.out.println("Cafe: 1.20€");
                }
                System.out.println("Total desayuno: "+precioTotal+"€");
                break;


        }

    }
}
