package creational.factoryabstract.products;

/**
 * Class.
 */
public class ConnectionSql implements Connection {
    /**
     * Constructor.
     */
    public ConnectionSql() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String description() {
        return "SQL Connection";
    }
}
