package Pruebas;

public class Casting {
    public static void main(String[] args) {
        int nota1 = 4;
        int nota2 = 7;
        int nota3 = 8;
        float media = 8;

        media = (float) (nota1+nota2+nota3)/3;

        System.out.println("La media es: " +media);
    }
}
