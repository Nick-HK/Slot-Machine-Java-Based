package bugReport;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.NoSuchProviderException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class bugReport {
	final static String username = "cs3343bugreport@gmail.com";  
    final static String password = "cs3343123456";
    private static Properties props = new Properties();  
    final static String ver = "v1.3";
    
    public static void sendReportText () throws AddressException, MessagingException { 
    		setProps();
        Session session = Session.getInstance(props, new Authenticator() {  
            protected PasswordAuthentication getPasswordAuthentication() {  
                return new PasswordAuthentication(username, password);  
            }  
        });
        Message message = new MimeMessage(session);  
        message.setFrom(new InternetAddress("cs3343bugreport@gmail.com"));  
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("cs3343bugreport@gmail.com"));  
        message.setSubject(GameData.GameData.windows.reportID.getText()+GameData.GameData.windows.reportTitle.getText()); 
        //Set Message
        BodyPart messageBodyPart = new MimeBodyPart();
        messageBodyPart.setText(genBugReport());
        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(messageBodyPart);
        //Set Attachments
        if(!(getAttachedFile().equals(null))) {
        	messageBodyPart = new MimeBodyPart();
        	messageBodyPart.setDataHandler(new DataHandler(getAttachedFile()));
        	messageBodyPart.setFileName(GameData.GameData.windows.attachPath.getText());
        	multipart.addBodyPart(messageBodyPart);
        }
        message.setContent(multipart);
        Transport.send(message);
    }
    
    public static String getReportID() throws MessagingException {
    		setProps();
    		Session session = Session.getInstance(props, new Authenticator() {  
                protected PasswordAuthentication getPasswordAuthentication() {  
                    return new PasswordAuthentication(username, password);  
                }  
            });
    		int messageCount = 0;
			try {
				Store store = session.getStore("imaps");
				store.connect("smtp.gmail.com", username,password);
	            Folder inbox = store.getFolder("inbox");
	            inbox.open(Folder.READ_WRITE); // Folder.READ_ONLY
	            messageCount = inbox.getMessageCount();
	            System.out.println("Total Messages " + messageCount);
			} catch (NoSuchProviderException e) {
				e.printStackTrace();
			}
			return "[REPORT"+ messageCount+"]";
    }
    
    public static void setProps() {
    		props.put("mail.smtp.host", "smtp.gmail.com");  
        props.put("mail.smtp.socketFactory.port", "465");  
        props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");  
        props.put("mail.smtp.auth", "true");  
        props.put("mail.smtp.port", "465");
    }
    
    public static String getVer() {
    		return ver;
    }
    
    public static String genBugReport() {
		String report = "";
		report += "Project: CS3343 Slot Machine \n";
		report += "Type: " + GameData.GameData.windows.bugTypes.getSelectedItem().toString() + "\n";
		report += "Reporter: " + GameData.GameData.windows.reporter.getText() + "\n";
		report += "Contact Email: " + GameData.GameData.windows.ContactEmail.getText() + "\n";
		report += "Enviornment: " + GameData.GameData.windows.oS.getText() + "\n";
		report += "Version: " + GameData.GameData.windows.version.getText() + "\n";
		report += "Component: " + GameData.GameData.windows.component.getText() + "\n\n";
		report += "Details: " + GameData.GameData.windows.details.getText() + "\n";
		return report;
    }
    
    public static DataSource getAttachedFile() {
		String path = "";
		path = GameData.GameData.windows.attachPath.getText();
		if (path.equals("")) {
			return null;
		}
		DataSource source = new FileDataSource(path);
		return source;
    }
}
