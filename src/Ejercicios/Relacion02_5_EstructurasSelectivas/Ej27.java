package Ejercicios.Relacion02_5_EstructurasSelectivas;

import java.util.Scanner;

public class Ej27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1  - Programador Junior");
        System.out.println("2  - Programador Senior");
        System.out.println("3  - Jefe de Proyecto");
        System.out.print("Introduzca el cargo del empleado (1-3)");
        int numeroCargo = sc.nextInt();
        double sueldoBrutoSinComisiones = 0;
        double sueldoBrutoConComisiones =0;
        double irpf=0;
        double comisionIrpf=0;
        double sueldoNeto=0;
        double salarioBase=0;

        System.out.println("¿Cuántos días ha estado de viaje con clientes?");
        double diasConClientes = sc.nextDouble();
        System.out.println("Introduzca su estado civil(1-Soltero, 2-Casado)");
        double casadoOno = sc.nextDouble();

        switch (numeroCargo){
            case 1:
                salarioBase=950;
                 sueldoBrutoSinComisiones=950;
                 sueldoBrutoConComisiones=sueldoBrutoSinComisiones+(diasConClientes*30);
                if (casadoOno==1){
                    irpf=0.25;
                }else {
                    irpf=0.20;
                }
                comisionIrpf=sueldoBrutoConComisiones*irpf;
                sueldoNeto=sueldoBrutoConComisiones-comisionIrpf;
               break;

            case 2:
                salarioBase=1200;
                sueldoBrutoSinComisiones=1200;
                sueldoBrutoConComisiones=sueldoBrutoSinComisiones+(diasConClientes*30);
                if (casadoOno==1){
                    irpf=0.25;
                }else{
                    irpf=0.20;
                }
                comisionIrpf=sueldoBrutoConComisiones*irpf;
                sueldoNeto=sueldoBrutoConComisiones-comisionIrpf;
                break;


            case 3:
                salarioBase=1600;
                sueldoBrutoSinComisiones=1600;
                sueldoBrutoConComisiones=sueldoBrutoSinComisiones+(diasConClientes*30);
                if (casadoOno==1){
                    irpf=0.25;
                }else{
                    irpf=0.20;
                }
                comisionIrpf=sueldoBrutoConComisiones*irpf;
                sueldoNeto=sueldoBrutoConComisiones-comisionIrpf;
                break;
        }
        System.out.println("----------------------------");
        System.out.println("Sueldo base: " +salarioBase+"€");
        System.out.println("Dietas: " +diasConClientes+" Viajes"+(diasConClientes*30+"€"));
        System.out.println("---------------------------");
        System.out.println("Sueldo bruto: "+sueldoBrutoConComisiones+"€");
        System.out.println("Retención de IRPF "+irpf+"%"+": "+comisionIrpf+"€");
        System.out.println("---------------------------");
        System.out.println("Sueldo neto a percibir: "+sueldoNeto+"€");

    }
}
