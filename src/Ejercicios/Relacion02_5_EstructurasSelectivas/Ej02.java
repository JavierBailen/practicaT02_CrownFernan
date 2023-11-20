package Ejercicios.Relacion02_5_EstructurasSelectivas;

import java.util.Scanner;

public class Ej02 {
    public static void main(String[] args) {
        //Realiza un programa que pida una hora por teclado y que muestre luego buenos días, buenas
        //tardes o buenas noches según la hora. Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a
        //5. respectivamente. Sólo se tienen en cuenta las horas, los minutos no se deben introducir por
        //teclado.

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime una hora");
        int hora = sc.nextInt();

        if (hora<25&&hora>=1){

            if (hora>=6&&hora<13){
                System.out.println("Hola! son las " +hora+":00 de la mañana" +" Buenos dias!");

            }else{
                if (hora>=13&&hora<21){
                    System.out.println("Hola! son las "+hora+":00 de la tarde" +" Buenas tardes!");

                }else{
                    System.out.println("Hola! son las "+hora+":00 de la noche.Buenas noches!");

                }
            }
        }
    }
}
