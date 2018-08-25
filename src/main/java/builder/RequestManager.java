package builder;

import java.util.List;

/**
 * Class.
 */
public class RequestManager implements ProtocolManager {

    private static final String GET = "GET";
    private static final String POST = "POST";
    private static final String PUT = "PUT";
    private static final String DELETE = "DELETE";
    private static final String BODY = "BODY";
    private static final String REQUEST_TO = "REQUEST TO";
    private String request;

    /**
     * Constructor.
     */
    RequestManager() {
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public ProtocolManager perform(final List<String> listActions, final String endpoint) {
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
                    requestBuilder.append("WITH ");
                    requestBuilder.append(setBodyRequest());
                    break;
                default:
                    break;
            }
            requestBuilder.append(" ");
        }
        requestBuilder.append(REQUEST_TO);
        requestBuilder.append(" ");
        requestBuilder.append(endpoint);
        this.request = requestBuilder.toString();
        return this;
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public String getResult() {
        return request;
    }

    /**
     * @return GET.
     */
    private String getRequest() {
        return GET;
    }

    /**
     * @return POST.
     */
    private String postRequest() {
        return POST;
    }

    /**
     * @return PUT.
     */
    private String putRequest() {
        return PUT;
    }

    /**
     * @return DELETE.
     */
    private String deleteRequest() {
        return DELETE;
    }

    /**
     * @return BODY.
     */
    private String setBodyRequest() {
        return BODY;
    }

}
