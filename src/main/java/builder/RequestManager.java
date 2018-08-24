package builder;

import java.util.List;

public class RequestManager implements ProtocolManager {

    private static final String GET = "GET";
    private static final String POST = "POST";
    private static final String PUT = "PUT";
    private static final String DELETE = "DELETE";
    private static final String BODY = "WITH BODY";
    private static final String REQUEST_TO = "REQUEST TO";
    private String request;

    RequestManager() {
    }

    @Override
    public void perform(final List<String> listActions, final String endpoint) {
        StringBuilder requestBuilder = new StringBuilder();
        for (String typeRequest : listActions) {
            switch (typeRequest) {
                case GET:
                    requestBuilder.append(getRequest());
                    break;
                case POST:
                    requestBuilder.append(postRequest());
                    break;
                case PUT:
                    requestBuilder.append(putRequest());
                    break;
                case DELETE:
                    requestBuilder.append(deleteRequest());
                    break;
                case BODY:
                    requestBuilder.append(setBodyRequest());
                    break;
                default:
                    break;
            }
            requestBuilder.append(" ");
        }
        requestBuilder.append(REQUEST_TO);
        requestBuilder.append(endpoint);
        this.request =  requestBuilder.toString();
    }
    
    public String getLastRequest(){
        return request;
    }

    private String getRequest() {
        return GET;
    }

    private String postRequest() {
        return POST;
    }

    private String putRequest() {
        return PUT;
    }

    private String deleteRequest() {
        return DELETE;
    }

    private String setBodyRequest() {
        return BODY;
    }

}
