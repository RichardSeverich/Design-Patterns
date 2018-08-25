package behavior.observator.observers;

/**
 * Class.
 */
public class ConnectionMySql implements ConnectionObserver {
    private String connectionStatus;

    /**
     * Constructor.
     */
    public ConnectionMySql() {
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
        return this.connectionStatus;
    }
}
