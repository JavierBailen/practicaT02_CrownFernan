package Ejercicios.Relacion02_6_EstructurasRepetitivas;

import java.util.Scanner;

public class Ej26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un número");
        int num = sc.nextInt();
        System.out.println("Dime un dígito");
        int digito = sc.nextInt();
        String numString = String.valueOf(num);
        boolean encontrado = false;

        for (int i = 0; i < numString.length(); i++) {

            if (numString.charAt(i) - 48 == digito) {
                //(El -48 es el valor que hay que restar para obtener el numero que queremos(48 es el valor de '0' en ASCII) de la cadena y asi
                //tendremos el valor de la posicion que buscamos y la comparamos con el digito que ha introducido el usuario.

                System.out.println("El dígito " + digito + " está en la posición " + (i + 1));
                break; // Detener la búsqueda una vez que se encuentra el dígito
            }
        }


    }
}
