/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mail;

/**
 *
 * @author POOJA
 */
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.Properties;
import javax.mail.Transport;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class mail {
    public static void sendMail(String recepient)throws Exception{
        System.out.println("{Preparing to send mail}");
        Properties properties=new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port","587");
        String myAccountEmail="vlekhasri159@gamil.com";
        String password="lekhacit#2020";
        Session session=Session.getInstance(properties,new Authenticator(){
            @Override 
            protected PasswordAuthentication getPasswordAuthentication(){
                        return new PasswordAuthentication(myAccountEmail,password);
                    }
        });
        Message message=preparemessage(session,myAccountEmail,recepient);
        Transport.send(message);
        System.out.println("Message sent successfully...");
    }
    private static Message preparemessage(Session session,String myAccountEmail,String recepient)throws MessagingException{
        try{
            Message message=new MimeMessage(session);
            message.setFrom(new InternetAddress(myAccountEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
            message.setSubject("My first email from java app");
            message.setText("Hey there...");
            return message;
        }
        catch(AddressException ex){
            java.util.logging.Logger.getLogger(mail.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
        }
        return null;
    }    
    static void Mail(String mdcsciteduin){
        throw new UnsupportedOperationException("Not supported yet...");
    }
}
