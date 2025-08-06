package pl.coderslab.spy;

public class NotificationService {

    public boolean sendEmail(String address, String message) {
        // Logika wysyłania e-maila (udawana)
        System.out.println("Sending email to " + address);
        return true;
    }

    public boolean sendSMS(String number, String message) {
        // Logika wysyłania SMS (udawana)
        System.out.println("Sending SMS to " + number);
        return true;
    }

    public void notifyUser(String userId, String message) {
        sendEmail(userId + "@example.com", message);
    }
}

