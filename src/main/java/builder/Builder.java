package builder;

import java.util.ArrayList;
import java.util.List;

public class Builder {

    private ProtocolManager manager;
    private String endpoint;
    private List<String> listActions;

    Builder(final ProtocolManager manager, final String endpoint) {
        this.manager = manager;
        this.endpoint = endpoint;
        listActions = new ArrayList<>();
    }

    public void get() {
        listActions.add("GET");
    }

    public void post() {
        listActions.add("POST");
    }

    public void put() {
        listActions.add("PUT");
    }

    public void delete() {
        listActions.add("DELETE");
    }

    public void setBody() {
        listActions.add("BODY");
    }

    public ProtocolManager getProtocol() {
        manager.perform(this.listActions, this.endpoint);
        return manager;
    }
}
