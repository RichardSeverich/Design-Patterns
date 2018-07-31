package patternfactoryabstract.creators;

import patternfactoryabstract.products.Connection;
import patternfactoryabstract.products.ConnectionMySql;

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
