package Ejercicios.Relacion02_4_OperadoresYExpresiones;

import java.util.Scanner;

public class Ej02 {
         /*
        Diseña un programa Java que calcule la suma, resta, multiplicación y división de dos números
        introducidos por teclado. Incorpora también las funciones que permitan realizar la potencia de
        un número y la raíz cuadrada del otro.
        Ejemplo de salida del programa para x=9, y=3:
        Introducir primer número: 9
        Introducir segundo número: 3
        x = 9.0 y = 3.0
        x + y = 12.0
        x - y = 6.0
        x * y = 27.0
        x / y = 3.0
        x ^ 2 = 81.0
        √ x = 3.0
        */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el primer numero: ");
        double num1 = sc.nextDouble();
        System.out.println("Dime el segundo numero: ");
        double num2 = sc.nextDouble();

        double suma = num1+num2;
        double resta = num1-num2;
        double multiplicacion = num1*num2;
        double division = num1/num2;
        double potencia = Math.pow(num1,2);
        double raizCuadrada = Math.sqrt(num1);

        System.out.printf("x =%.2f y = %.2f%n",num1,num2);
        System.out.printf("x+y=%.2f%n",suma);
        System.out.printf("x-y=%.2f%n",resta);
        System.out.printf("x*y=%.2f%n",multiplicacion);
        System.out.printf("x/y=%.2f%n",division);
        System.out.printf("x^2=%.2f%n",potencia);
        System.out.printf("√x=%.2f%n",raizCuadrada);
    }
}
