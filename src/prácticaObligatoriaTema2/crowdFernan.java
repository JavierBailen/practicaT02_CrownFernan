package prácticaObligatoriaTema2;

import java.util.Scanner;

public class crowdFernan {





    public static void sistemaAcceso(){
        int numIntentos = 2;
        String contraAdmin = "admin";
        String contraGestor = "gestor";
        String contraInversor = "inversor";
        String usuarioAdmin = "admin";
        String usuarioGestor = "gestor";
        String usuarioInversor = "inversor";
        String usuarioInversor2="inversor2";
        String contraUsuarioInversor2="inversor2";
        boolean usuarioAdminActivo = false;
        boolean usuarioGestorActivo = false;
        boolean usuarioInversorActivo = false;
        boolean usuarioInversor2Activo = false;
        boolean usuarioGestorBloqueado= false;
        boolean usuarioInversorBloqueado= false;
        boolean usuarioInversor2Bloqueado= false;


        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("USUARIO: ");
            String usuarioIntroducido = sc.next();
            System.out.print("CONTRASEÑA: ");
            String contraseniaIntroducida = sc.next();




            if (contraseniaIntroducida.equals(contraAdmin) && usuarioIntroducido.equals(usuarioAdmin)){
                usuarioAdminActivo=true;
                System.out.println("Bienvenido Administrador! \u2705");
                break;
            } else if (usuarioIntroducido.equals(usuarioGestor)) {
                usuarioGestorActivo=true;
                if (contraseniaIntroducida.equals(contraGestor)){
                    System.out.println("Bienvenido Gestor! \u2705");
                    break;
                }else{
                    System.out.println("CONTRASEÑA INCORRECTA, TE QUEDAN: "+numIntentos+" Intentos");
                    numIntentos--;
                    if (numIntentos<0){
                        usuarioGestorBloqueado=true;
                        System.out.println("Estas bloqueado Gestor. Habla con el Admin \u274C");
                    }
                }
                System.out.println("Bienvenido Gestor!");
                break;
            }else if ( usuarioIntroducido.equals(usuarioInversor)){
                usuarioInversorActivo=true;
                if (contraseniaIntroducida.equals(contraInversor)){
                    System.out.println("Bienvenido Inversor! \u2705");
                    break;
                }else{
                    System.out.println("CONTRASEÑA INCORRECTA, TE QUEDAN: "+numIntentos+" Intentos");
                    numIntentos--;
                    if (numIntentos<0){
                        usuarioInversorBloqueado=true;
                        System.out.println("Estas bloqueado Inversor. Habla con el Administrador \u274C");
                    }
                }

            } else if ( usuarioIntroducido.equals(usuarioInversor2)) {
                usuarioInversor2Activo=true;
                if (contraseniaIntroducida.equals(contraUsuarioInversor2)){
                    System.out.println("Bienvenido Inversor 2! \u2705");
                    break;
                }else{
                    System.out.println("CONTRASEÑA INCORRECTA, TE QUEDAN: "+numIntentos+" Intentos");
                    numIntentos--;
                    if (numIntentos<0){
                        usuarioInversor2Bloqueado=true;
                        System.out.println("Estas bloqueado usuario Inversor2. Habla con el Administrador \u274C");
                    }
                }

            }


        }while (numIntentos>=0);
        //aquí lo que hago es llamar a la función del usuario seleccionado
        if (usuarioAdminActivo==true){
            menuUsuarioAdmin();
        } else if (usuarioGestorActivo==true && usuarioGestorBloqueado==false) {
            menuUsuarioGestor();
        } else if (usuarioInversorActivo==true && usuarioInversorBloqueado==false) {
            menuUsuarioInversor();
        } else if (usuarioInversor2Activo==true && usuarioInversor2Bloqueado==false) {
            menuUsuarioInversor2();
        }


    }




    public static void menuUsuarioAdmin(){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("****Menú del usuario administrador**** \uD83D\uDC68\uD83C\uDFFE\u200D\uD83D\uDCBB");
            System.out.println("1.-Panel de control");
            System.out.println("2.-Proyectos");
            System.out.println("3.-Configuración");
            System.out.println("4.-Salir");
            int opcionMenu = sc.nextInt();

            switch (opcionMenu){
                case 1:
                    System.out.println("Estas dentro del panel de control");
                    System.out.println("1.-Bloquear usuario");
                    System.out.println("2.-Desbloquear usuario");
                    System.out.println("3.-Volver atras");
                    int opcionPanelControl = sc.nextInt();

                    switch (opcionPanelControl){
                        case 1:
                            System.out.println("Opción para bloquear usuarios:");
                            break;
                        case 2:
                            System.out.println("Opción para desbloquear usuarios:");
                            break;
                        case 3:
                            System.out.println("Volviendo atras...");
                            break;
                    }
                    break;

                case 2:
                    System.out.println("Estas dentro de la pestaña Proyectos, mostrando listado...");
                    break;

                case 3:
                    int opcionConfiguracion =0;
                    while (true){
                        System.out.println("Estas dentro de la pestaña configuración");
                        System.out.println("1.-Cambiar contraseña");
                        System.out.println("2.-Cambiar usuario");
                        System.out.println("3.-Volver atrás");
                        opcionConfiguracion=sc.nextInt();

                        switch (opcionConfiguracion){
                            case 1:
                                System.out.println("Opciones para cambio de contraseña");
                                break;
                            case 2:
                                System.out.println("Opciones para cambio de usuario");
                                break;
                            case 3:
                                System.out.println("Volviendo atrás...");
                                break;

                        }
                        break;
                    }
                    break;
                case 4:
                    System.out.println("Terminando uso de la aplicación...");
                    return;



            }
        }

    }

    public static void menuUsuarioGestor(){
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Menu del usuario gestor");
            System.out.println("1.-Panel de control");
            System.out.println("2.-Mis proyectos");
            System.out.println("3.-Configuración");
            System.out.println("4.-Salir");
            int opcionMenu = sc.nextInt();

            switch (opcionMenu){
                case 1:
                    System.out.println("Estás dentro del panel de control");
                    System.out.println("Resumen de proyectos creados, selecciona tipo: prestamo, plusvalia, alquiler");
                    String tipoProyecto = sc.next();
                    switch (tipoProyecto){
                        case "prestamo":
                            System.out.println("(Resumen de proyectos creados (prestamo)");
                            break;
                        case "plusvalia":
                            System.out.println("Resumen de proyectos creados (plusvalia)");
                            break;
                        case "alquiler":
                            System.out.println("Resumen de proyectos creados (alquiler)");
                            break;
                    }
                    break;

                case 2:
                    System.out.println("Pestaña Mis Proyectos:");
                    System.out.println("Todavia no hay proyectos");
                    break;

                case 3:
                    int opcionConfiguracion = 0;

                    while (true){
                        System.out.println("Pestaña Configuración:");
                        System.out.println("1.-Cambiar contraseña:");
                        System.out.println("2.-Cambiar nombre de usuario: ");
                        System.out.println("3.-Volver");
                        opcionConfiguracion = sc.nextInt();

                        switch (opcionConfiguracion){
                            case 1:
                                System.out.println("Opción para cambio de contraseña");
                                break;
                            case 2:
                                System.out.println("Opción para cambio de usuario:");
                                break;
                            case 3:
                                System.out.println("Volviendo...");
                                break;
                        }
                        break;



                    }
                    break;
                case 4:
                    System.out.println("Terminando uso de la aplicación....");
                    return;

            }
        }

    }

    public static void menuUsuarioInversor(){
        int saldoInversor=0;
        int añadirSaldo=0;
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("***Menu del usuario inversor***");
            System.out.println("Seleccione una opción:");
            System.out.println("1.Panel de Control");
            System.out.println("2.Mis inversiones");
            System.out.println("3.Proyectos");
            System.out.println("4.Cartera Digital");
            System.out.println("5.Configuración");
            System.out.println("6.-Salir");
            int opcionMenu = sc.nextInt();
            switch (opcionMenu){
                case 1:
                    System.out.println("Estas dentro del panel de control");
                    System.out.println("Resumen de inversiones realizadas, seleccione entre prestamo, plusvalia o alquiler");
                    String tipoInversion = sc.next();
                    switch (tipoInversion){
                        case "prestamo":
                            System.out.println("(Resumen de inversiones agrupadas por el tipo de proyecto (prestamo)");
                            break;
                        case "plusvalia":
                            System.out.println("(Resumen de inversiones agrupadas por el tipo de proyecto (plusvalia)");
                            break;
                        case "alquiler":
                            System.out.println("(Resumen de inversiones agrupadas por el tipo de proyecto (alquiler)");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Pestaña Mis Inversiones:");
                    break;

                case 3:
                    System.out.println("Pestaña Proyectos:");
                    break;

                case 4:
                    System.out.println("***Cartera Digital***");
                    System.out.println("Tu saldo es: "+saldoInversor+"€");
                    System.out.println("¿Deseas añadir más fondos a tu cartera digital?(s/n)");
                    String masDinero = sc.next();
                    switch (masDinero){
                        case "s":
                            System.out.println("Dime la cantidad que quieres añadir");
                            añadirSaldo=sc.nextInt();
                            saldoInversor+=añadirSaldo;
                            System.out.println("Tu saldo ahora es: "+saldoInversor+"€");
                            break;

                        case "n":
                            System.out.println("No quieres añadir más fondos, vale.");
                            break;
                    }
                    break;
                case 5:
                    int opcionConfiguracion =0;
                    //Hacemos los bucles  infinitos while(true), los cuales estarán repitiendo instrucciones
                    //Hasta que se encuentren con una instrucción de salida como un break o otra condición que
                    //rompa el bucle.
                    while (true){
                        System.out.println("***CONFIGURACIÓN***");
                        System.out.println("1.-Cambiar contraseña");
                        System.out.println("2.-Cambiar usuario");
                        System.out.println("3.-Volver atras");
                        opcionConfiguracion = sc.nextInt();
                        switch (opcionConfiguracion){
                            case 1:
                                System.out.println("Opción para cambiar contraseña");
                                break;

                            case 2:
                                System.out.println("Opción para cambiar de usuario");
                                break;

                            case 3:
                                System.out.println("Volviendo atras...");
                                break;
                        }

                        break;
                    }
                    break;
                case 6:
                    System.out.println("Terminando uso de la aplicación...");
                    return; //aqui se utiliza return para terminar con el bucle
                            //con return salimos del método menuUsuarioInversor


            }
        }




    }

    public static void menuUsuarioInversor2(){
        int saldoInversor=0;
        int añadirSaldo=0;
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("***Menu del usuario inversor***");
            System.out.println("Seleccione una opción:");
            System.out.println("1.Panel de Control");
            System.out.println("2.Mis inversiones");
            System.out.println("3.Proyectos");
            System.out.println("4.Cartera Digital");
            System.out.println("5.Configuración");
            System.out.println("6.-Salir");
            int opcionMenu = sc.nextInt();
            switch (opcionMenu){
                case 1:
                    System.out.println("Estas dentro del panel de control");
                    System.out.println("Resumen de inversiones realizadas, seleccione entre prestamo, plusvalia o alquiler");
                    String tipoInversion = sc.next();
                    switch (tipoInversion){
                        case "prestamo":
                            System.out.println("(Resumen de inversiones agrupadas por el tipo de proyecto (prestamo)");
                            break;
                        case "plusvalia":
                            System.out.println("(Resumen de inversiones agrupadas por el tipo de proyecto (plusvalia)");
                            break;
                        case "alquiler":
                            System.out.println("(Resumen de inversiones agrupadas por el tipo de proyecto (alquiler)");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Pestaña Mis Inversiones:");
                    break;

                case 3:
                    System.out.println("Pestaña Proyectos:");
                    break;

                case 4:
                    System.out.println("***Cartera Digital***");
                    System.out.println("Tu saldo es: "+saldoInversor+"€");
                    System.out.println("¿Deseas añadir más fondos a tu cartera digital?(s/n)");
                    String masDinero = sc.next();
                    switch (masDinero){
                        case "s":
                            System.out.println("Dime la cantidad que quieres añadir");
                            añadirSaldo=sc.nextInt();
                            saldoInversor+=añadirSaldo;
                            System.out.println("Tu saldo ahora es: "+saldoInversor+"€");
                            break;

                        case "n":
                            System.out.println("No quieres añadir más fondos, vale.");
                            break;
                    }
                    break;
                case 5:
                    int opcionConfiguracion =0;
                    //Hacemos los bucles  infinitos while(true), los cuales estarán repitiendo instrucciones
                    //Hasta que se encuentren con una instrucción de salida como un break o otra condición que
                    //rompa el bucle.
                    while (true){
                        System.out.println("***CONFIGURACIÓN***");
                        System.out.println("1.-Cambiar contraseña");
                        System.out.println("2.-Cambiar usuario");
                        System.out.println("3.-Volver atras");
                        opcionConfiguracion = sc.nextInt();
                        switch (opcionConfiguracion){
                            case 1:
                                System.out.println("Opción para cambiar contraseña");
                                break;

                            case 2:
                                System.out.println("Opción para cambiar de usuario");
                                break;

                            case 3:
                                System.out.println("Volviendo atras...");
                                break;
                        }

                        break;
                    }
                    break;
                case 6:
                    System.out.println("Terminando uso de la aplicación...");
                    return; //aqui se utiliza return para terminar con el bucle
                //con return salimos del método menuUsuarioInversor


            }
        }
    }

    public static void main(String[] args) {

        sistemaAcceso();



    }
}
