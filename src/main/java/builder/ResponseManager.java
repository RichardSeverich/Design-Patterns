package builder;

import java.util.List;

/**
 * Class.
 */
public class ResponseManager implements ProtocolManager {

    private static final String GET = "GET";
    private static final String POST = "POST";
    private static final String PUT = "PUT";
    private static final String DELETE = "DELETE";
    private static final String BODY = "BODY";
    private static final String RESPONSE_FROM = "RESPONSE FROM";
    private String response;

    /**
     * Constructor.
     */
    ResponseManager() {
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public ProtocolManager perform(final List<String> listActions, final String endpoint) {
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
                    responseBuilder.append("WITH ");
                    responseBuilder.append(setBodyResponse());
                    break;
                default:
                    break;
            }
            responseBuilder.append(" ");
        }
        responseBuilder.append(RESPONSE_FROM);
        responseBuilder.append(" ");
        responseBuilder.append(endpoint);
        this.response = responseBuilder.toString();
        return this;
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public String getResult() {
        return response;
    }

    /**
     * @return GET.
     */
    private String getResponse() {
        return GET;
    }

    /**
     * @return POST.
     */
    private String postResponse() {
        return POST;
    }

    /**
     * @return PUT.
     */
    private String putResponse() {
        return PUT;
    }

    /**
     * @return DELETE.
     */
    private String deleteResponse() {
        return DELETE;
    }

    /**
     * @return BODY.
     */
    private String setBodyResponse() {
        return BODY;
    }
}
