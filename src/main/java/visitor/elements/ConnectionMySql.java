package visitor.elements;

import visitor.visitors.Visitor;

/**
 * Class.
 */
public class ConnectionMySql implements Connection {

    private String connectionStatus;

    /**
     * Constructor.
     */
    public ConnectionMySql() {
        connectionStatus = "Close";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getDescription() {
        return "MySQL Connection";
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
