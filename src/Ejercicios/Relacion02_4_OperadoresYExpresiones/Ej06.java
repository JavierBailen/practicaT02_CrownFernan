package Ejercicios.Relacion02_4_OperadoresYExpresiones;

import java.util.Scanner;

public class Ej06 {
    //Solicitar al usuario dos valores, y determinar qué número es mayor. Usa el operador ternario.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero");
        int num1 = sc.nextInt();
        System.out.println("Dime otro numero");
        int num2 = sc.nextInt();


        int numMayor= (num1>num2)?num1:num2; //resultado(lo que queremos)= (condicion)?x:y; (Si se cumple la condición se tomará como resultado el valor1(x) si no es así se tomará como resultado el valor2(y)


        System.out.println("El numero mayor es " +numMayor);
    }
}
