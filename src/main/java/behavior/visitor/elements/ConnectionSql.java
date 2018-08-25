package behavior.visitor.elements;

import behavior.visitor.visitors.Visitor;

/**
 * Class.
 */
public class ConnectionSql implements Connection {

    private String connectionStatus;

    /**
     * Constructor.
     */
    public ConnectionSql() {
        connectionStatus = "Close";
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public String getDescription() {
        return "SQL Connection";
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public void closeConnection() {
        connectionStatus = "Close";
    }

    /**
     * {@inheritDoc}.
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
     * {@inheritDoc}.
     */
    @Override
    public void acceptVisitor(final Visitor visitor) {
        visitor.visitElementConnection(this);
    }
}
