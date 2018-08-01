package observator.observers;

/**
 * Class.
 */
public class ConnectionSql implements ConnectionObserver {

    private String connectionStatus;

    /**
     * Constructor.
     */
    public ConnectionSql() {
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
