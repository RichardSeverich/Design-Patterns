package patternfactoryabstract.creators;

import patternfactoryabstract.products.Connection;
import patternfactoryabstract.products.ConnectionSql;

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
