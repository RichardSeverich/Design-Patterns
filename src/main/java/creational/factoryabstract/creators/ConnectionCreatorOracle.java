package creational.factoryabstract.creators;

import creational.factoryabstract.products.Connection;
import creational.factoryabstract.products.ConnectionOracle;

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
