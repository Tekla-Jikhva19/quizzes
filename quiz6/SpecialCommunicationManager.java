
package quiz6;

public class SpecialCommunicationManager {
    private CommunicationService commonService;
    private CommunicationService specialService;

    public SpecialCommunicationManager(String commonServiceUrl, String specialServiceUrl) {
        this.commonService = new CommonCommunicationService(commonServiceUrl);
        this.specialService = new SpecialCommunicationService(specialServiceUrl);
    }

    public String processMessage(String message, String conversationHistory) {
        // Check if the special service should handle the request
        String serviceUrl = specialService.processMessage(message, conversationHistory);
        if (serviceUrl != null) {
            return serviceUrl;
        } else {
            return commonService.processMessage(message, conversationHistory);
        }
    }

    public String getCommonServiceUrl() {
        if (commonService instanceof CommonCommunicationService) {
            return ((CommonCommunicationService) commonService).getCommonServiceUrl();
        }
        return null;
    }

    public void setCommonServiceUrl(String commonServiceUrl) {
        if (commonService instanceof CommonCommunicationService) {
            ((CommonCommunicationService) commonService).setCommonServiceUrl(commonServiceUrl);
        }
    }

    public String getSpecialServiceUrl() {
        if (specialService instanceof SpecialCommunicationService) {
            return ((SpecialCommunicationService) specialService).getSpecialServiceUrl();
        }
        return null;
    }

    public void setSpecialServiceUrl(String specialServiceUrl) {
        if (specialService instanceof SpecialCommunicationService) {
            ((SpecialCommunicationService) specialService).setSpecialServiceUrl(specialServiceUrl);
        }
    }
}
