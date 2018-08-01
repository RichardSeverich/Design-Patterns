package factoryabstract.creators;

import factoryabstract.products.Connection;
import factoryabstract.products.ConnectionPostgresSql;

/**
 * Class.
 */
public class ConnectionCreatorPostgresSql implements ConnectionCreator {

    /**
     * Class.
     */
    @Override
    public Connection createConnection() {
        return new ConnectionPostgresSql();
    }
}
