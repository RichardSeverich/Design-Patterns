package creational.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Class.
 */
class Builder {

    private ProtocolManager manager;
    private String endpoint;
    private List<String> listActions;

    /**
     * Constructor.
     */
    Builder() {
        listActions = new ArrayList<>();
    }

    /**
     * @param manager  Response or Request.
     * @param endpoint End point.
     * @return Builder.
     */
    Builder protocolBuilder(final ProtocolManager manager, final String endpoint) {
        this.manager = manager;
        this.endpoint = endpoint;
        return this;
    }

    /**
     *
     * @return Builder.
     */
    Builder get() {
        listActions.add("GET");
        return this;
    }

    /**
     *
     * @return Builder.
     */
    Builder post() {
        listActions.add("POST");
        return this;
    }

    /**
     *
     * @return Builder.
     */
    Builder put() {
        listActions.add("PUT");
        return this;
    }

    /**
     *
     * @return Builder.
     */
    Builder delete() {
        listActions.add("DELETE");
        return this;
    }

    /**
     *
     * @return Builder.
     */
    Builder setBody() {
        listActions.add("BODY");
        return this;
    }

    /**
     * @return Request or Response.
     */
    ProtocolManager getProtocol() {
        manager.perform(this.listActions, this.endpoint);
        return manager;
    }
}
