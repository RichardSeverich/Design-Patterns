package creational.factoryabstract.products;

/**
 * Class.
 */
public class ConnectionPostgresSql implements Connection {
    /**
     * Constructor.
     */
    public ConnectionPostgresSql() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String description() {
        return "PostgresSql Connection";
    }
}
