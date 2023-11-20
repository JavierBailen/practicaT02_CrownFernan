package Ejercicios.Relacion02_5_EstructurasSelectivas;

import java.util.Scanner;

public class Ej01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un día de la semana lectiva (1-5)");
        int diaSemana = sc.nextInt();

        if (diaSemana==1){
            System.out.println("Hoy es Lunes, te toca BB.DD");
        }else{
            if (diaSemana==2){
                System.out.println("Hoy es Martes, te toca Programación");
            }else{
                if (diaSemana==3){
                    System.out.println("Hoy es Miércoles, te toca BB.DD");
                }else {
                    if (diaSemana==4){
                        System.out.println("Hoy es Jueves, te toca BB.DD");
                    }else{
                        if (diaSemana==5){
                            System.out.println("Hoy es VIERNES!, te toca programación");
                        }else{
                            System.out.println("Hoy vas a venir tú, campeón");
                        }
                    }
                }
            }
        }
    }
}
