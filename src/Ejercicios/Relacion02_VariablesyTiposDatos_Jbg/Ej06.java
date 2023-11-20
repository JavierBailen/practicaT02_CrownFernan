package Ejercicios.Relacion02_VariablesyTiposDatos_Jbg;

public class Ej06 {
    public static void main(String[] args) {
        //Escribe un programa que calcule el total de una factura a partir de la base imponible (precio
        //sin IVA). La base imponible estará almacenada en una variable.

        double iva = 1.24;
        int baseImponible = 100;


        System.out.println("*****FACTURACIÓN*****");
        System.out.println("Base imponible de la factura: " +baseImponible);
        System.out.println("IVA general : 24% ");
        System.out.println("FACTURA TOTAL: " + (baseImponible*iva) + " EUROS, Gracias y vuelva pronto!");



    }
}
