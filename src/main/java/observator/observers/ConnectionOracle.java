package observator.observers;

/**
 * Class.
 */
public class ConnectionOracle implements ConnectionObserver {

    private String connectionStatus;

    /**
     * Constructor.
     */
    public ConnectionOracle() {
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
