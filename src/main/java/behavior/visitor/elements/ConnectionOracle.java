package behavior.visitor.elements;

import behavior.visitor.visitors.Visitor;

/**
 * Class.
 */
public class ConnectionOracle implements Connection {

    private String connectionStatus;

    /**
     * Constructor.
     */
    public ConnectionOracle() {
        connectionStatus = "Close";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getDescription() {
        return "Oracle Connection";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void closeConnection() {
        connectionStatus = "Close";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void openConnection() {
        connectionStatus = "Open";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getConnectionStatus() {
        return connectionStatus;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void acceptVisitor(final Visitor visitor) {
        visitor.visitElementConnection(this);
    }
}
