package Ejercicios.Relacion02_6_EstructurasRepetitivas;

public class Ej72 {
    public static void main(String[] args) {
        System.out.println("Numeros que son multiplos de 5 pero no de 3");
        for (int i = 0;i<=100;i++){
            if (i%5==0 && i%3!=0){
                System.out.println(i);
            }
        }
    }
}
