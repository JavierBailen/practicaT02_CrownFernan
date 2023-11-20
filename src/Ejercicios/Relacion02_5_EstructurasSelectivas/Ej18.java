package Ejercicios.Relacion02_5_EstructurasSelectivas;

import java.util.Scanner;

public class Ej18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime cuantas cifras va a tener tu numero(1-5)");
        int numCifras=sc.nextInt();
        System.out.println("Dime una cifra");
        int num= sc.nextInt();
        int primerDigito=0;

        switch (numCifras){
            case 1:
              primerDigito=num;
                System.out.println(primerDigito);
              break;
            case 2:
                primerDigito=(num%100)/10;//al calcular "num%100" es lo mismo que quitar siempre el ultimo digito de num. Tambien lo dividimos para que el numero de 2 cifras pase a ser solo de 1
                System.out.println(primerDigito);
                break;//
            case 3:
                primerDigito=(num/100);
                System.out.println(primerDigito);
                break;

            case 4:
                primerDigito=num/1000;
                System.out.println(primerDigito);
                break;

            case 5:
                primerDigito=num/10000;
                System.out.println(primerDigito);
                break;

        }



    }
}
