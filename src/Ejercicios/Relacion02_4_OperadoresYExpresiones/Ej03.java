package Ejercicios.Relacion02_4_OperadoresYExpresiones;

import java.util.Scanner;

public class Ej03 {
    //Diseña un programa Java que solicite un numero de 5 dígitos del teclado, separe el
    //numero en sus dígitos individuales y los muestre por pantalla. Por ejemplo, si el
    //número es 53123 que muestre: 5 3 1 2 3.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero de 5 cifras");
        int numeroIntroducido = sc.nextInt();

        int primerDigito = numeroIntroducido/10000;
        int segundoDigito = (numeroIntroducido/1000)%10;
        int tercerDigito = (numeroIntroducido/100)%10;
        int cuartoDigito = (numeroIntroducido/10)%10;
        int quintoDigito = numeroIntroducido%10;


        System.out.println("Has introducido : "+ numeroIntroducido);
        System.out.println("Tu numero separado : " +primerDigito +" " +segundoDigito +" " +tercerDigito +" "
                +cuartoDigito +" " + +quintoDigito +" ");
    }
}
