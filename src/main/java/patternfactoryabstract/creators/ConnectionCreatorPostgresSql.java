package patternfactoryabstract.creators;

import patternfactoryabstract.products.Connection;
import patternfactoryabstract.products.ConnectionPostgresSql;

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
