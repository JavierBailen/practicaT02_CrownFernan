package Ejercicios.Relacion02_4_OperadoresYExpresiones;

import java.util.Scanner;

public class Ej04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el primer lado del triangulo (L1)");
        double L1 = sc.nextDouble();
        System.out.println("Dime el segundo lado del triangulo (L2)");
        double L2 = sc.nextDouble();
        System.out.println("Dime el tercer lado del triangulo (L3)");
        double L3 = sc.nextDouble();

        double semiPerimetro = (L1+L2+L3)/2;
        double area = Math.sqrt(semiPerimetro*(semiPerimetro-L1)*(semiPerimetro-L2)*(semiPerimetro-L3)) ;


        System.out.println("El primer lado de tu triangulo mide " +L1 +" cm" + " El segundo lado mide " +L2 +" cm" +" El tercer lado mide " +L3 +"cm");
        System.out.printf("Por lo tanto, el área de tu triangulo es de %.2f Cm2",area);

    }
}
