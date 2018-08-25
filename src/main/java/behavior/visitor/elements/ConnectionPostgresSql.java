package behavior.visitor.elements;

import behavior.visitor.visitors.Visitor;

/**
 * Class.
 */
public class ConnectionPostgresSql implements Connection {

    private String connectionStatus;

    /**
     * Constructor.
     */
    public ConnectionPostgresSql() {
        connectionStatus = "Close";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getDescription() {
        return "PostgresSql Connection";
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
