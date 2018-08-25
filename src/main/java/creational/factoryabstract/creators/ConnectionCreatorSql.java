package creational.factoryabstract.creators;

import creational.factoryabstract.products.Connection;
import creational.factoryabstract.products.ConnectionSql;

/**
 * Class.
 */
public class ConnectionCreatorSql implements ConnectionCreator {

    /**
     * {@inheritDoc}
     */
    @Override
    public Connection createConnection() {
        return new ConnectionSql();
    }
}
