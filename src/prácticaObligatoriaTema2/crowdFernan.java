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
        System.out.println("****Menú del usuario administrador**** \uD83D\uDC68\uD83C\uDFFE\u200D\uD83D\uDCBB");
    }

    public static void menuUsuarioGestor(){
        System.out.println("Menu del usuario gestor");
    }

    public static void menuUsuarioInversor(){
        System.out.println("***Menu del usuario inversor***");
        System.out.println("Seleccione una opción:");
        System.out.println("1.Panel de Control");
        System.out.println("2.Mis inversiones");
        System.out.println("3.Proyectos");
        System.out.println("4.Cartera Digital");
        System.out.println("5.Configuración");
    }

    public static void menuUsuarioInversor2(){
        System.out.println("***Menu del usuario inversor2***");
        System.out.println("Seleccione una opción:");
        System.out.println("1.Panel de Control");
        System.out.println("2.Mis inversiones");
        System.out.println("3.Proyectos");
        System.out.println("4.Cartera Digital");
        System.out.println("5.Configuración");
    }

    public static void main(String[] args) {

        sistemaAcceso();

    }
}
