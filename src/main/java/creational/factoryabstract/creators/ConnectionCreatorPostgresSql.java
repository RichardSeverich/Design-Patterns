package creational.factoryabstract.creators;

import creational.factoryabstract.products.Connection;
import creational.factoryabstract.products.ConnectionPostgresSql;

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
