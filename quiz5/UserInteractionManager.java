package quiz5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInteractionManager {
    private CommunicationManager communicationManager;
    private String sessionId;
    private List<Message> chatHistory;

    public UserInteractionManager(CommunicationManager communicationManager) {
        this.communicationManager = communicationManager;
        this.sessionId = "session123"; // Example session ID
        this.chatHistory = new ArrayList<>();
    }

    public void startInteraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chatbot is ready. Type your message:");

        while (true) {
            String userMessage = scanner.nextLine();
            if (userMessage.equalsIgnoreCase("exit")) {
                break;
            }

            chatHistory.add(new Message("user", userMessage, getCurrentTimestamp()));

            String botResponse = communicationManager.sendMessage(sessionId, userMessage, chatHistory);
            chatHistory.add(new Message("bot", botResponse, getCurrentTimestamp()));

            System.out.println("Bot: " + botResponse);
        }

        scanner.close();
    }

    private String getCurrentTimestamp() {
        return java.time.LocalDateTime.now().toString();
    }

    public static void main(String[] args) {
        CommunicationManager commManager = new DummyCommunicationManager();
        UserInteractionManager uiManager = new UserInteractionManager(commManager);
        uiManager.startInteraction();
    }
}

