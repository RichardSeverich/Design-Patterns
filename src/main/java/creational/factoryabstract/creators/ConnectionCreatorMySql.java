package creational.factoryabstract.creators;

import creational.factoryabstract.products.Connection;
import creational.factoryabstract.products.ConnectionMySql;

/**
 * Class.
 */
public class ConnectionCreatorMySql implements ConnectionCreator {

    /**
     * {@inheritDoc}
     */
    @Override
    public Connection createConnection() {
        return new ConnectionMySql();
    }
}
