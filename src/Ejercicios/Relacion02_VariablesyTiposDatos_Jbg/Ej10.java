package Ejercicios.Relacion02_VariablesyTiposDatos_Jbg;

public class Ej10 {
    public static void main(String[] args) {
        boolean casadoOno =  /*1*/ true;
        int MAXIMO = 999999;  /*2*/  /*Es int porque los short solo llegan hasta 32767*/
        byte diaSemana = 1;/*3*/ /*Es byte porque para representar los dias de la semana (1-7) nos basta con los valores que nos pueden dar las variables de tipo byte*/
        short diaAño =300; /*4*/ /*Es short ya que los bytes solo llegan hasta 128 y nos hará falta llegar hasta 365*/
        char sexo = 'H'; /*5*/ /*Para representar esto nos basta con variables tipo character*/
        Long tiempoMilisegundos = 3123165464613213566L; /*6*/ /*Como necesitaremos muchisimos valores para representar los segundos escogemos una variable de tipo Long*/
        float factura = 123.5f; /*7*/ /*Para facturar seguramente, para tener más exactitud con los pagos necesitaremos decimales, por ello utilizamos una variable de tipo float (double si queremos más exactitud);*/
        Long poblacionMundial = 7500000000L; //Lo mismo que para los milisegundos, necesitamos muchos valores, por ello escogemos Long
        System.out.println(MAXIMO);

        System.out.println("----EJERCICIOS DE VARIABLES Y TIPOS DE DATOS----");
        System.out.println("El valor de la variable casado es " + casadoOno);
        System.out.println("El valor de la variable MAXIMO es " + MAXIMO);
        System.out.println("El valor de la variable diaSemana es " + diaSemana);
        System.out.println("El valor de la variable diaAño es " + diaAño);
        System.out.println("El valor de la variable sexo es " + sexo);
        System.out.println("El valor de la variable tiempoMilisegundos es " + tiempoMilisegundos);
        System.out.println("El valor de la variable factura es " + factura);
        System.out.println("El valor de la variable poblacionMundial es " + poblacionMundial);
        System.out.println("El valor de la variable 5 es 2 y 8 respectivamente");





    }
}
