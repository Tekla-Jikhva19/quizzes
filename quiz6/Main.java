package quiz6;

public class Main {
    public static void main(String[] args) {
        String commonUrl = "https://common.service.url";
        String specialUrl = "https://special.service.url";

        SpecialCommunicationManager manager = new SpecialCommunicationManager(commonUrl, specialUrl);

        String userMessage = "Can you help me?";
        String conversationHistory = "Previous conversation history including the word 'help'.";

        String serviceUrl = manager.processMessage(userMessage, conversationHistory);

        if (serviceUrl != null) {
            System.out.println("Service URL to use: " + serviceUrl);
        } else {
            System.out.println("No service URL found.");
        }
    }
}
