package prácticaObligatoriaTema2.Funcionalidades;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class EnviarGmail {

    public static void correoGmail(String destinatario, String asunto, String cuerpo){
        String remitente = "javier.bailen@fernando3martos.com";
        String clave = "fboycygyedcbkstl";


        //PROPIEDADES DE CONEXIÓN CON EL SERVIDOR DE CORREO SMTP
        Properties props = System.getProperties();
        props.put("mail.smtp.host", "smtp.gmail.com"); //Este es el servidor de Google
        props.put("mail.smtp.user",remitente);
        props.put("mail.smtp.clave",clave);
        props.put("mail.smtp.auth", "true"); //Esta opción es para usar autenticacion mediante usuario y contraseña
        props.put("mail.smtp.starttls.enable", "true"); //Conectar de manera segura
        props.put("mail.smtp.port", "587");//Puerto seguro de google


        //OBTENEMOS LA SESIÓN EN EL SERVIDOR DE CORREO
        Session session = Session.getDefaultInstance(props);

        try {
            //Creamos el mensaje que vamos a enviar
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(remitente));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(destinatario)); //Para enviar textos planos
            message.setContent(cuerpo,"text/html; charset=utf-8"); //Para enviar formato html

            //DEFINICIÓN DE LOS PARAMETROS DEL PROTOCOLO DE TRANSPORTE
            Transport transport = session.getTransport("smtp");
            transport.connect("smtp.gmail.com",remitente,clave);
            transport.sendMessage(message,message.getAllRecipients());
        }
        catch (MessagingException me){
            me.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String destinatario = "javier.bailen@fernando3martos.com";
        String asunto = "we";
        String cuerpo = "ooooo";

        correoGmail(destinatario,asunto,cuerpo);
        System.out.println("Mensaje enviado!");
    }


}