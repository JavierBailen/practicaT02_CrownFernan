package Ejercicios.Relacion02_5_EstructurasSelectivas;

import java.util.Scanner;

public class Ej16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int puntuacion = 0;

        System.out.println("Responde verdadero (V) o falso (F) a las siguientes preguntas:");

        System.out.print("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente (V/F): ");
        if (sc.next().equalsIgnoreCase("V")) {
            puntuacion += 3;
        }

        System.out.print("2. Ha aumentado sus gastos de vestuario (V/F): ");
        if (sc.next().equalsIgnoreCase("V")) {
            puntuacion += 3;
        }

        System.out.print("3. Ha perdido el interés que mostraba anteriormente por ti (V/F): ");
        if (sc.next().equalsIgnoreCase("V")) {
            puntuacion += 3;
        }

        System.out.print("4. Ahora se asea con más frecuencia (V/F): ");
        if (sc.next().equalsIgnoreCase("V")) {
            puntuacion += 3;
        }

        System.out.print("5. No te deja que mires la agenda de su teléfono móvil (V/F): ");
        if (sc.next().equalsIgnoreCase("V")) {
            puntuacion += 3;
        }

        System.out.print("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante (V/F): ");
        if (sc.next().equalsIgnoreCase("V")) {
            puntuacion += 3;
        }

        System.out.print("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a (V/F): ");
        if (sc.next().equalsIgnoreCase("V")) {
            puntuacion += 3;
        }

        System.out.print("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo (V/F): ");
        if (sc.next().equalsIgnoreCase("V")) {
            puntuacion += 3;
        }

        System.out.print("9. Has notado que últimamente se perfuma más (V/F): ");
        if (sc.next().equalsIgnoreCase("V")) {
            puntuacion += 3;
        }

        System.out.print("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo (V/F): ");
        if (sc.next().equalsIgnoreCase("V")) {
            puntuacion += 3;
        }

        System.out.println("Tu puntuación es: " + puntuacion);

        if (puntuacion >= 0 && puntuacion <= 10) {
            System.out.println("¡Enhorabuena! Tu pareja parece ser totalmente fiel.");
        } else if (puntuacion >= 11 && puntuacion <= 22) {
            System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia.");
        } else if (puntuacion >= 23 && puntuacion <= 30) {
            System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües qué es lo que está pasando por su cabeza.");
        }
    }
}
