package Ejercicios.Relacion02_5_EstructurasSelectivas;

import java.util.Scanner;

public class Ej29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int precioBaseEntrada=8;
        int precioBaseEntradaMiercoles=5;
        double descuentoTarjeta=0.10;
        int importeEntradasSinDescuento=0;
        int importeEntradas=0;
        double cantidadDescuentoTarjeta=0;
        int precioEntradaJueves=11;//para 2 personas

        System.out.println("Venta de entradas Cines Eladio, el mejor de tu barrio");
        System.out.print("Numero de entradas: ");
        int numEntradas = sc.nextInt();
        System.out.print("Dia de la semana: ");
        String diaSemana = sc.next();
        System.out.println("Tienes la tarjeta Cines Eladio?(s/n)");
        String tarjetaOno=sc.next();


        switch (diaSemana){

            case "lunes":

                if (tarjetaOno.equals("s")){
                    cantidadDescuentoTarjeta=(numEntradas*precioBaseEntrada)*0.10;
                    System.out.println(cantidadDescuentoTarjeta);

                    System.out.println("Aquí tienes tus entradas para el lunes(Día normal). Gracias por tu compra.");
                    System.out.println("Total :  "+(numEntradas*precioBaseEntrada)+"€");
                    System.out.println("Descuento: "+cantidadDescuentoTarjeta+"€");
                    System.out.println("A pagar: "+""+((numEntradas*precioBaseEntrada)-cantidadDescuentoTarjeta)+"€");
                    break;

                }else{
                    cantidadDescuentoTarjeta=(numEntradas*precioBaseEntrada)*0.10;
                    System.out.println(cantidadDescuentoTarjeta);

                    System.out.println("Aquí tienes tus entradas. Gracias por tu compra.");
                    System.out.println("Total :  "+(numEntradas*precioBaseEntrada)+"€");
                    System.out.println("Descuento: "+"-0€");
                    System.out.println("A pagar: "+""+((numEntradas*precioBaseEntrada))+"€");
                    break;
                }


            case "martes", "sabado", "viernes", "domingo":

                if (tarjetaOno.equals("s")){
                    cantidadDescuentoTarjeta=(numEntradas*precioBaseEntrada)*0.10;


                    System.out.println("Aquí tienes tus entradas (Día normal). Gracias por tu compra.");
                    System.out.println("Total :  "+(numEntradas*precioBaseEntrada)+"€");
                    System.out.println("Descuento: "+cantidadDescuentoTarjeta+"€");
                    System.out.println("A pagar: "+""+((numEntradas*precioBaseEntrada)-cantidadDescuentoTarjeta)+"€");
                    break;
                }else{

                    cantidadDescuentoTarjeta=(numEntradas*precioBaseEntrada)*0.10;


                    System.out.println("Aquí tienes tus entradas. Gracias por tu compra.");

                    System.out.println("Total :  "+(numEntradas*precioBaseEntrada)+"€");
                    System.out.println("Descuento: "+"-0€");
                    System.out.println("A pagar: "+""+((numEntradas*precioBaseEntrada))+"€");
                    break;
                }

            case "miercoles":
                precioBaseEntrada=5;

                if (tarjetaOno.equals("s")){
                    cantidadDescuentoTarjeta=(numEntradas*precioBaseEntrada)*0.10;


                    System.out.println("Aquí tienes tus entradas para el Miércoles(Día del espectador). Gracias por tu compra.");
                    System.out.println("Total :  "+(numEntradas*precioBaseEntrada)+"€");
                    System.out.println("Descuento: "+cantidadDescuentoTarjeta+"€");
                    System.out.println("A pagar: "+""+((numEntradas*precioBaseEntrada)-cantidadDescuentoTarjeta)+"€");
                    break;
                }else{
                    cantidadDescuentoTarjeta=(numEntradas*precioBaseEntrada)*0.10;


                    System.out.println("Aquí tienes tus entradas para el Miércoles(Día del espectador). Gracias por tu compra.");
                    System.out.println("Entradas pareja");
                    System.out.println("Precio por entrada de pareja");
                    System.out.println("Total :  "+(numEntradas*precioBaseEntrada)+"€");
                    System.out.println("Descuento: "+"-0€");
                    System.out.println("A pagar: "+""+((numEntradas*precioBaseEntrada))+"€");
                    break;
                }

            case "jueves":

                if (tarjetaOno.equals("s")){

                    cantidadDescuentoTarjeta=(((double) numEntradas /2)*11)*0.10;



                    System.out.println("Aquí tienes tus entradas para el Jueves(Día de la pareja). Gracias por tu compra.");
                    System.out.println("Entradas de pareja: "+(numEntradas/2));
                    System.out.println("Precio por entrada de pareja: " +precioEntradaJueves+"€");
                    System.out.println("Total :  "+((numEntradas/2)*11)+"€");
                    System.out.println("Descuento: "+cantidadDescuentoTarjeta+"€");
                    System.out.println("A pagar: "+""+(((numEntradas/2)*11)-cantidadDescuentoTarjeta)+"€");
                    break;
                }else{
                    cantidadDescuentoTarjeta=(((double) numEntradas /2)*11)*0.10;



                    System.out.println("Aquí tienes tus entradas para el jueves(Día de la pareja). Gracias por tu compra.");
                    System.out.println("Entradas de pareja: "+(numEntradas/2));
                    System.out.println("Precio por entrada de pareja: " +precioEntradaJueves+"€");
                    System.out.println("Total :  "+((numEntradas/2)*11)+"€");
                    System.out.println("Descuento: "+cantidadDescuentoTarjeta+"€");
                    System.out.println("A pagar: "+""+(((numEntradas/2)*11)-cantidadDescuentoTarjeta)+"€");
                    break;
                }


        }

    }
}
