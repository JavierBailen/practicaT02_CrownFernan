package Ejercicios.Relacion02_5_EstructurasSelectivas;


import java.util.Scanner;

public class Ej26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca base imponible");
        double baseImponible = sc.nextDouble();
        System.out.print("Introduzca tipo de IVA (general, reducido o superreducido): ");
        String tipoIva = sc.next();
        double cantidadIva =0;
        double descuentoIva =0;
        double precioFinalSinCodigo = 0;
        double precioFinalConCodigo = 0;
        double diferencia = 0;



        cantidadIva=switch (tipoIva){
            case "general"->0.21;
            case "reducido"->0.10;
            case "superreducido"->{
                System.out.println("El IVA es superreducido");
                yield 0.04;
            }
            default->0.21;
        };


       /* switch (tipoIva){
            case "general":
             cantidadIva = 0.21;

             break;

            case "reducido":
                cantidadIva =0.10;

                break;

            case "superreducido":
                cantidadIva = 0.04;

                break;




        }

        */
        descuentoIva = baseImponible*cantidadIva;
        precioFinalSinCodigo = baseImponible+descuentoIva;

        System.out.println("Introduzca el código promocional (nopro,mitad,menos5 o 5porc): ");
        String tipoCodigo = sc.next();

        switch (tipoCodigo){
            case "nopro":
               precioFinalConCodigo=precioFinalSinCodigo;
                diferencia = precioFinalConCodigo-precioFinalSinCodigo;
               break;


            case "mitad":
                precioFinalConCodigo=precioFinalSinCodigo/2;
                diferencia = precioFinalConCodigo-precioFinalSinCodigo;
                break;

            case "menos5":
                precioFinalConCodigo=precioFinalSinCodigo-5;
                diferencia = precioFinalConCodigo-precioFinalSinCodigo;
                break;
            case "5por":
                precioFinalConCodigo=precioFinalSinCodigo-(precioFinalSinCodigo*0.05);
                diferencia = precioFinalConCodigo-precioFinalSinCodigo;
                break;
        }
        System.out.println();
        System.out.println("Base imponible :" +baseImponible+"€");
        System.out.println("IVA: "+cantidadIva+"% "+""+descuentoIva+"€");
        System.out.println("Precio con IVA : " +precioFinalSinCodigo+"€");
        System.out.println("Cod promo. " +tipoCodigo +":"+diferencia+"€");
        System.out.println("TOTAL: " +precioFinalConCodigo+"€");

    }
}
