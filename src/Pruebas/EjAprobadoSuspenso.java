package Pruebas;

import java.util.Scanner;

public class EjAprobadoSuspenso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la nota que tienes y te digo la calificación");
        double nota = sc.nextDouble();

        if (nota<5){
            System.out.println("Insuficiente");
        }else{
            if (nota>=5 && nota <=6){
                System.out.println("Suficiente");
            }else{
                if (nota>=6 && nota <7){
                    System.out.println("Bien");
                }else{
                    if (nota>=7 && nota<=8.6){
                        System.out.println("Notable");
                    }else {
                        if (nota>=8.6 && nota <10.1){
                            System.out.println("Sobresaliente");
                        }else{
                            System.out.println("Nota no válida");
                        }
                    }
                }
            }
        }
    }

}
