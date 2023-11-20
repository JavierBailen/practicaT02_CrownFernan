package Ejercicios.Relacion02_6_EstructurasRepetitivas;

public class Ej03 {
    public static void main(String[] args) {
        int num=1;
        do {
           if (num%5==0){
               System.out.println(num);
           }
           num++;

        }while (num<=100);
    }
}
