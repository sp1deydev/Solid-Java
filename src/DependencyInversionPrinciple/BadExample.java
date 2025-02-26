package DependencyInversionPrinciple;

class Notification2 {
    private EmailService emailService = new EmailService(); // Phụ thuộc vào implementation

    public void notifyUser(String message) {
        emailService.sendMessage(message);
    }
}
