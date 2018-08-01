package factoryabstract.creators;

import factoryabstract.products.Connection;
import factoryabstract.products.ConnectionOracle;

/**
 * Class.
 */
public class ConnectionCreatorOracle implements ConnectionCreator {

    /**
     * {@inheritDoc}
     */
    @Override
    public Connection createConnection() {
        return new ConnectionOracle();
    }
}
