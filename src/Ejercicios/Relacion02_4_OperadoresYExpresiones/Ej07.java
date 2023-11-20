package Ejercicios.Relacion02_4_OperadoresYExpresiones;

import java.util.Scanner;

public class Ej07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("DIME TU EDAD");
        float edad = sc.nextFloat();
        float pulso = 220-edad;
        double maxima1 = pulso*0.9;
        double intensa = pulso*0.8;
        double moderada = pulso*0.7;
        double suave = pulso*0.6;
        double msuave = pulso*0.5;

        System.out.println("Su zona máxima está entre " + maxima1 +" Y " +pulso);
    }
}
