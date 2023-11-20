package Ejercicios.Relacion02_5_EstructurasSelectivas;

import java.util.Scanner;

public class Ej30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int precioTarta=0;
        int precioBaseTartaManzana=18;
        int precioBaseTartaFresa=16;

        System.out.println("Elija un sabor(Manzana,fresa,chocolate)");
        String tipoTarta = sc.next();
        System.out.println("¿Quiere nata?(si/no)");
        String nataSiOno = sc.next();
        System.out.println("¿Quieres ponerle nombre? (si/no)");
        String nombreSiOno = sc.next();


        switch (tipoTarta){

            case "manzana":


                precioTarta=18;
                if (nataSiOno.equals("si")&&nombreSiOno.equals("si")){
                    precioTarta= (int) (precioTarta+5.25);//5.25 es por la suma de la nata y el nombre

                    System.out.println("Tarta de manzana: " +precioBaseTartaManzana+"€");
                    System.out.println("Con nata: " +" 2.5€");
                    System.out.println("Con nombre: "+" 2.75€");
                    System.out.println("Total: "+(precioBaseTartaManzana+2.75+2.5+"€"));
                    break;
                }else {
                    if (nataSiOno.equals("si")&&nombreSiOno.equals("no")){
                        precioTarta= (int) (precioTarta+2.5);//2.5 solo por la nata

                        System.out.println("Tarta de manzana: "+ precioBaseTartaManzana+"€");
                        System.out.println("Con nata: "+" 2.5€");
                        System.out.println("sin nombre: "+" 0€");
                        System.out.println("Total: "+(precioBaseTartaManzana+2.5)+"€");
                        break;
                    }else {
                        if (nataSiOno.equals("no")&&nombreSiOno.equals("si")){
                            precioTarta= (int) (precioTarta+2.75);//2.75 por el nombre

                            System.out.println("Tarta de manzana: "+ precioBaseTartaManzana+"€");
                            System.out.println("Sin nata: "+"0€");
                            System.out.println("Con nombre: "+" 2.75€");
                            System.out.println("Total: "+(precioBaseTartaManzana+2.75)+"€");
                            break;
                        }else{
                            precioTarta= (int) (precioTarta+2.75);//2.75 por el nombre

                            System.out.println("Tarta de manzana: "+ precioBaseTartaManzana+"€");
                            System.out.println("Sin nata: "+"0€");
                            System.out.println("Sin nombre: "+" 0€");
                            System.out.println("Total: "+(precioBaseTartaManzana)+"€");
                            break;
                        }
                    }

                }

            case "fresa":

                precioTarta=16;

                if (nataSiOno.equals("si")&&nombreSiOno.equals("si")){
                    precioTarta= (int) (precioTarta+5.25);//5.25 es por la suma de la nata y el nombre

                    System.out.println("Tarta de fresa: " +precioBaseTartaFresa+"€");
                    System.out.println("Con nata: " +" 2.5€");
                    System.out.println("Con nombre: "+" 2.75€");
                    System.out.println("Total: "+(precioBaseTartaFresa+2.75+2.5+"€"));
                    break;
                }else {
                    if (nataSiOno.equals("si")&&nombreSiOno.equals("no")){
                        precioTarta= (int) (precioTarta+2.5);//2.5 solo por la nata

                        System.out.println("Tarta de fresa: "+ precioBaseTartaFresa+"€");
                        System.out.println("Con nata: "+" 2.5€");
                        System.out.println("sin nombre: "+" 0€");
                        System.out.println("Total: "+(precioBaseTartaFresa+2.5)+"€");
                        break;
                    }else {
                        if (nataSiOno.equals("no")&&nombreSiOno.equals("si")){
                            precioTarta= (int) (precioTarta+2.75);//2.75 por el nombre

                            System.out.println("Tarta de fresa: "+ precioBaseTartaManzana+"€");
                            System.out.println("Sin nata: "+"0€");
                            System.out.println("Con nombre: "+" 2.75€");
                            System.out.println("Total: "+(precioBaseTartaFresa+2.75)+"€");
                            break;
                        }

                    }

                }
            case "chocolate":

                precioTarta=0;
                System.out.println("¿Qué tipo de chocolate quieres?");
                String tipoChocolate = sc.next();

                if (tipoChocolate.equals("negro")){
                    precioTarta=14;


                    if (nataSiOno.equals("si")&&nombreSiOno.equals("si")){
                        precioTarta= (int) (precioTarta+5.25);//5.25 es por la suma de la nata y el nombre

                        System.out.println("Tarta de chocolate negro: " +"14€");
                        System.out.println("Con nata: " +" 2.5€");
                        System.out.println("Con nombre: "+" 2.75€");
                        System.out.println("Total: "+(14+2.75+2.5+"€"));//precio de la tarta choc neg+complementos
                        break;
                    }else {
                        if (nataSiOno.equals("si")&&nombreSiOno.equals("no")){
                            precioTarta= (int) (precioTarta+2.5);//2.5 solo por la nata

                            System.out.println("Tarta de chocolate negro: "+"14€");
                            System.out.println("Con nata: "+" 2.5€");
                            System.out.println("sin nombre: "+" 0€");
                            System.out.println("Total: "+(14+2.5)+"€");
                            break;
                        }else {
                            if (nataSiOno.equals("no")&&nombreSiOno.equals("si")){
                                precioTarta= (int) (precioTarta+2.75);//2.75 por el nombre

                                System.out.println("Tarta de chocolate negro: "+"14€");
                                System.out.println("Sin nata: "+"0€");
                                System.out.println("Con nombre: "+" 2.75€");
                                System.out.println("Total: "+(14+2.75)+"€");
                                break;
                            }else{
                                precioTarta= (int) (precioTarta+2.75);//2.75 por el nombre

                                System.out.println("Tarta de chocolate negro: "+ precioBaseTartaManzana+"€");
                                System.out.println("Sin nata: "+"0€");
                                System.out.println("Sin nombre: "+" 0€");
                                System.out.println("Total: "+"14€");
                                break;
                            }
                        }

                    }
                }else {
                    if (tipoChocolate.equals("blanco")){
                        precioTarta=15;

                        if (nataSiOno.equals("si")&&nombreSiOno.equals("si")){
                            precioTarta= (int) (precioTarta+5.25);//5.25 es por la suma de la nata y el nombre

                            System.out.println("Tarta de chocolate blanco: " +"15€");
                            System.out.println("Con nata: " +" 2.5€");
                            System.out.println("Con nombre: "+" 2.75€");
                            System.out.println("Total: "+(15+2.75+2.5+"€"));//precio de tart choc blanc+complementos
                            break;
                        }else {
                            if (nataSiOno.equals("si")&&nombreSiOno.equals("no")){
                                precioTarta= (int) (precioTarta+2.5);//2.5 solo por la nata

                                System.out.println("Tarta de chocolate blanco: "+"15€");
                                System.out.println("Con nata: "+" 2.5€");
                                System.out.println("sin nombre: "+" 0€");
                                System.out.println("Total: "+(15+2.5)+"€");
                                break;
                            }else {
                                if (nataSiOno.equals("no")&&nombreSiOno.equals("si")){
                                    precioTarta= (int) (precioTarta+2.75);//2.75 por el nombre

                                    System.out.println("Tarta de chocolate blanco: "+ "15€");
                                    System.out.println("Sin nata: "+"0€");
                                    System.out.println("Con nombre: "+" 2.75€");
                                    System.out.println("Total: "+(15+2.75)+"€");
                                    break;
                                }else{
                                    precioTarta= (int) (precioTarta+2.75);//2.75 por el nombre

                                    System.out.println("Tarta de chocolate blanco: "+"15€");
                                    System.out.println("Sin nata: "+"0€");
                                    System.out.println("Sin nombre: "+" 0€");
                                    System.out.println("Total: "+"15€");
                                    break;
                                }
                            }

                        }
                    }
                }
        }
        System.out.println("GRACIAS Y HASTA PRONTO!");
    }
}
