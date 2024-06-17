package quiz6;

public class CommonCommunicationService implements CommunicationService {
    private String commonServiceUrl;

    public CommonCommunicationService(String commonServiceUrl) {
        this.commonServiceUrl = commonServiceUrl;
    }

    @Override
    public String processMessage(String message, String conversationHistory) {
        // Logic for common chatbot service (if needed)
        return commonServiceUrl;
    }

    public String getCommonServiceUrl() {
        return commonServiceUrl;
    }

    public void setCommonServiceUrl(String commonServiceUrl) {
        this.commonServiceUrl = commonServiceUrl;
    }
}

