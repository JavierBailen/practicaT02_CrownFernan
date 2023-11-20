package Ejercicios.Relacion02_5_EstructurasSelectivas;

import java.util.Scanner;

public class Ej24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la nota del primer control");
        double nota1 = sc.nextDouble();
        System.out.println("Dime la nota del segundo control");
        double nota2 = sc.nextDouble();

        double media = (nota1+nota2)/2;
        String apto = "";

        if (media>=5){
            System.out.println("Nota del primer control: " +nota1+" "+"Nota del segundo control: " +nota2);
            System.out.printf("Tu nota de programación es de:%.2f ",media);
        }else{
            if (media<5){
                System.out.println("Nota del primer control: " +nota1+" "+"Nota del segundo control: "+nota2);
                System.out.println("¿Has aprobado la recuperación?(si/no):");
                apto=sc.next();
                if (apto.equals("si")){
                    media=5;
                    System.out.println("Tu media es: " +media);
                }else{
                    System.out.println("Tu media es :"+media);
                }
            }
        }
    }
}
