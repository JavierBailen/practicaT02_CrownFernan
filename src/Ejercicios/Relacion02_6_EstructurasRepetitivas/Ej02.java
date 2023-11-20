package Ejercicios.Relacion02_6_EstructurasRepetitivas;

public class Ej02 {
    public static void main(String[] args) {
        int num=0;
        System.out.println("Numeros múltiplo de 5: ");
        while (num<=100){
            num++;
            if (num%5==0){
                System.out.println(num);
            }
        }
    }
}
