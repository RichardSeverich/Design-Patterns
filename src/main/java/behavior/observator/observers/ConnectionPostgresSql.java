package behavior.observator.observers;

/**
 * Class.
 */
public class ConnectionPostgresSql implements ConnectionObserver {

    private String connectionStatus;

    /**
     * Constructor.
     */
    public ConnectionPostgresSql() {
        connectionStatus = "Closed";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void update(final String status) {
        this.connectionStatus = status;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getStatus() {
        return connectionStatus;
    }
}
