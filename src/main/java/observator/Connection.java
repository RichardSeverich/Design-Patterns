package observator;

import observator.observers.ConnectionObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * Class.
 */
public class Connection {

    private List<ConnectionObserver> listConnectionObservers;
    private String connectionStatus;

    /**
     * Constructor.
     */
    public Connection() {
        listConnectionObservers = new ArrayList<>();
        connectionStatus = "Closed";
    }

    /**
     * Notify observers.
     */
    private void notifyObservers() {
        listConnectionObservers.forEach(observer -> observer.update(this.connectionStatus));
    }

    /**
     * @param newConnectionObserver ConnectionObserver.
     */
    public void addObservers(final ConnectionObserver newConnectionObserver) {
        listConnectionObservers.add(newConnectionObserver);
    }

    /**
     * Open Connection.
     */
    public void openConnection() {
        connectionStatus = "Opened";
        notifyObservers();
    }

    /**
     * Close Connection.
     */
    public void closeConnection() {
        connectionStatus = "Closed";
        notifyObservers();
    }

}
