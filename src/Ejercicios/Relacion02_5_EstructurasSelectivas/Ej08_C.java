package Ejercicios.Relacion02_5_EstructurasSelectivas;

import java.util.Scanner;

public class Ej08_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la primera nota");
        double nota1 = sc.nextDouble();
        System.out.println("Dime la segunda nota");
        double nota2 = sc.nextDouble();
        System.out.println("Dime la tercera nota");
        double nota3 = sc.nextDouble();

        double media = (nota1+nota2+nota3)/3;

        System.out.println("La media de tus tres notas es " + media);

        if (media>0&&media<4.9){
            System.out.println("INSUFICIENTE");
        }else{
            if (media>=5&&media<7){
                System.out.println("BIEN");
            }else{
                if (media>=7&&media<9){
                    System.out.println("NOTABLE");
                }else{
                    if (media>=9&&media<11){
                        System.out.println("SOBRESALIENTE!");
                    }else{
                        System.out.println("Valor no válido para calificar");
                    }
                }
            }
        }
    }
}
