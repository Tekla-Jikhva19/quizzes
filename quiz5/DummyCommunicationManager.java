package quiz5;

import java.util.List;

public class DummyCommunicationManager extends CommunicationManager {

    @Override
    public String sendMessage(String sessionId, String userMessage, List<Message> chatHistory) {
        // Dummy response logic
        switch (userMessage.toLowerCase()) {
            case "hello":
                return "Good day";
            case "what time is it?":
                return "It's 9:00 AM";
            case "i should go!":
                return "Goodbye!";
            default:
                return "I don't understand that.";
        }
    }
}
