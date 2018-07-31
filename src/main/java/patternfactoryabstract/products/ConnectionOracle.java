package patternfactoryabstract.products;

/**
 * Class.
 */
public class ConnectionOracle implements Connection {
    /**
     * Constructor.
     */
    public ConnectionOracle() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String description() {
        return "Oracle Connection";
    }
}
