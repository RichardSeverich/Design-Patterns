package factoryabstract.creators;

import factoryabstract.products.Connection;
import factoryabstract.products.ConnectionSql;

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
