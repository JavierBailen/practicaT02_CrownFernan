package Ejercicios.Relacion02_5_EstructurasSelectivas;

import java.util.Scanner;

public class Ej12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int calificacion = 0;

        System.out.println("Minicuestionario sobre las asignaturas del curso");
        System.out.println("Responde 'a' para Verdadero y 'b' para Falso:");

        // Pregunta 1
        System.out.println("1. Java es un lenguaje de programación.");
        String respuesta1 = sc.next();
        if (respuesta1.equals("a")) {
            calificacion++;
        }

        // Pregunta 2
        System.out.println("2. El agua tiene la fórmula química H2O.");
        String respuesta2 = sc.next();
        if (respuesta2.equals("a")) {
            calificacion++;
        }

        // Pregunta 3
        System.out.println("3. París es la capital de Alemania.");
        String respuesta3 = sc.next();
        if (respuesta3.equals("b")) {
            calificacion++;
        }

        // Pregunta 4
        System.out.println("4. El sol gira alrededor de la Tierra.");
        String respuesta4 = sc.next();
        if (respuesta4.equals("b")) {
            calificacion++;
        }

        // Pregunta 5
        System.out.println("5. 2 + 2 = 5.");
        String respuesta5 = sc.next();
        if (respuesta5.equals("b")) {
            calificacion++;
        }

        // Pregunta 6
        System.out.println("6. ¿1 + 1 = 2?");
        String respuesta6 = sc.next();
        if (respuesta6.equals("a")) {
            calificacion++;
        }

        // Pregunta 7
        System.out.println("7. El acelerón es una asignatura en este curso.");
        String respuesta7 = sc.next();
        if (respuesta7.equals("b")) {
            calificacion++;
        }

        // Pregunta 8
        System.out.println("8. El ciclo del agua implica evaporación y lluvia.");
        String respuesta8 = sc.next();
        if (respuesta8.equals("a")) {
            calificacion++;
        }

        // Pregunta 9
        System.out.println("9. 10 / 2 = 3.");
        String respuesta9 = sc.next();
        if (respuesta9.equals("b")) {
            calificacion++;

        }

        // Pregunta 10
        System.out.println("10. Un triángulo tiene cuatro lados.");
        String respuesta10 = sc.next();
        if (respuesta10.equals("b")) {
            calificacion++;
        }

        System.out.println("Tu calificación final es: " + calificacion + " puntos.");
    }
}

