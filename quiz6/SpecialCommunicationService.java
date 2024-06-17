package quiz6;

public class SpecialCommunicationService implements CommunicationService {
    private String specialServiceUrl;

    public SpecialCommunicationService(String specialServiceUrl) {
        this.specialServiceUrl = specialServiceUrl;
    }

    @Override
    public String processMessage(String message, String conversationHistory) {
        // Logic for special service when "help" is detected
        if (message.toLowerCase().contains("help") || conversationHistory.toLowerCase().contains("help")) {
            return specialServiceUrl;
        } else {
            return null; // Return null if special service shouldn't handle the request
        }
    }

    public String getSpecialServiceUrl() {
        return specialServiceUrl;
    }

    public void setSpecialServiceUrl(String specialServiceUrl) {
        this.specialServiceUrl = specialServiceUrl;
    }
}

