package factoryabstract.creators;

import factoryabstract.products.Connection;
import factoryabstract.products.ConnectionMySql;

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
