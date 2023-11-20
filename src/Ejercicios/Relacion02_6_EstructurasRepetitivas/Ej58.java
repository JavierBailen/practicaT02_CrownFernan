package Ejercicios.Relacion02_6_EstructurasRepetitivas;

import java.util.Scanner;

public class Ej58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un numero");
        int numIntroducido = sc.nextInt();
        int copiaNum = numIntroducido;
        int cantDigitos = 0;
        int sumaDigitos = 0;
        int mediaNumeros = 0;

        while (numIntroducido>0){
            cantDigitos++;
            int ultimoDigito = numIntroducido%10;
            numIntroducido/=10;
            sumaDigitos +=ultimoDigito;
        }
        double media = (double) sumaDigitos/cantDigitos;
        System.out.println("La media de los digitos de "+copiaNum+" es " +media);
    }
}
