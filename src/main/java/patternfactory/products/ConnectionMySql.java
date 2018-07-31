package patternfactory.products;

/**
 * Class.
 */
public class ConnectionMySql implements Connection {
    /**
     * Constructor.
     */
    public ConnectionMySql() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String description() {
        return "MySQL Connection";
    }
}
