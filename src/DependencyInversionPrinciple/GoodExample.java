package DependencyInversionPrinciple;

// 1. Định nghĩa abstraction (Giao diện)
interface MessageService {
    void sendMessage(String message);
}

// 2. Các lớp cụ thể thực thi giao diện
class EmailService implements MessageService {
    public void sendMessage(String message) {
        System.out.println("Gửi Email: " + message);
    }
}

class SMSService implements MessageService {
    public void sendMessage(String message) {
        System.out.println("Gửi SMS: " + message);
    }
}

// 3. Lớp cấp cao chỉ phụ thuộc vào abstraction
class Notification {
    private MessageService messageService;

    // Constructor Injection (Dependency Injection)
    public Notification(MessageService messageService) {
        this.messageService = messageService;
    }

    public void notifyUser(String message) {
        messageService.sendMessage(message);
    }
}

// 4. Sử dụng lớp Notification với dependency injection
public class GoodExample {
    public static void main(String[] args) {
        // Sử dụng EmailService
        MessageService emailService = new EmailService();
        Notification emailNotification = new Notification(emailService);
        emailNotification.notifyUser("Hello qua Email!");

        // Sử dụng SMSService
        MessageService smsService = new SMSService();
        Notification smsNotification = new Notification(smsService);
        smsNotification.notifyUser("Hello qua SMS!");
    }
}
