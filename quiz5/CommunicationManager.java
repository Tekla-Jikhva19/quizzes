package quiz5;

import java.util.List;

public abstract class CommunicationManager {
    public abstract String sendMessage(String sessionId, String userMessage, List<Message> chatHistory);
}

