package Pruebas;

import java.util.Scanner;

public class EjemploSwitch3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el nombre de un mes");

        String nombreMes = sc.next();
        int numeroMes=0;

        switch (nombreMes){
            case "enero"->{
                numeroMes=1;
                System.out.println(numeroMes);
            }

            case "febrero"->{
                numeroMes=2;
                System.out.println(numeroMes);
            }
            case "marzo"->{
                numeroMes=3;
                System.out.println(numeroMes);
            }
            case "abril"->{
                numeroMes=4;
                System.out.println(numeroMes);
            }
            case "mayo"->{
                numeroMes=5;
                System.out.println(numeroMes);
            }
            case "junio"->{
                numeroMes=6;
                System.out.println(numeroMes);
            }
            case "julio"->{
                numeroMes=7;
                System.out.println(numeroMes);
            }
            case "agosto"->{
                numeroMes=8;
                System.out.println(numeroMes);
            }
            case "septiembre"->{
                numeroMes=9;
                System.out.println(numeroMes);
            }
            case "octubre"->{
                numeroMes=10;
                System.out.println(numeroMes);
            }
            case "noviembre"->{
                numeroMes=11;
                System.out.println(numeroMes);
            }
            case "diciembre"->{
                numeroMes=12;
                System.out.println(numeroMes);
            }

        }
    }
}
