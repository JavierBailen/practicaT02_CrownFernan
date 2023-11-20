package Ejercicios.Relacion02_3_LecturaDeDatosTeclado;

import java.util.Scanner;

public class Ej08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime las horas que has trabajado esta semana y te digo lo que tienes que cobrar");
        double horasTrabajadas = sc.nextDouble();
        double precioXhora = 12;
        double salarioSemanal = horasTrabajadas*precioXhora;

        System.out.println("Debes cobrar " + salarioSemanal +" Euros a la semana");

    }
}
