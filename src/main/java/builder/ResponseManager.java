package builder;

import java.util.List;

public class ResponseManager implements ProtocolManager {

    private static final String GET = "GET";
    private static final String POST = "POST";
    private static final String PUT = "PUT";
    private static final String DELETE = "DELETE";
    private static final String BODY = "WITH BODY";
    private static final String RESPONSE_FROM = "RESPONSE FROM";
    private String response;

    ResponseManager() {

    }

    public void perform(final List<String> listActions, final String endpoint) {
        StringBuilder responseBuilder = new StringBuilder();
        for (String typeRequest : listActions) {
            switch (typeRequest) {
                case GET:
                    responseBuilder.append(getResponse());
                    break;
                case POST:
                    responseBuilder.append(postResponse());
                    break;
                case PUT:
                    responseBuilder.append(putResponse());
                    break;
                case DELETE:
                    responseBuilder.append(deleteResponse());
                    break;
                case BODY:
                    responseBuilder.append(setBodyResponse());
                    break;
                default:
                    break;
            }
            responseBuilder.append(" ");
        }
        responseBuilder.append(RESPONSE_FROM);
        responseBuilder.append(endpoint);
        this.response = responseBuilder.toString();
    }

    private String getResponse() {
        return GET;
    }

    private String postResponse() {
        return POST;
    }

    private String putResponse() {
        return PUT;
    }

    private String deleteResponse() {
        return DELETE;
    }

    private String setBodyResponse() {
        return BODY;
    }
}
