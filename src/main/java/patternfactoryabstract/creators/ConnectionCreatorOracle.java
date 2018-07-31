package patternfactoryabstract.creators;

import patternfactoryabstract.products.Connection;
import patternfactoryabstract.products.ConnectionOracle;

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
