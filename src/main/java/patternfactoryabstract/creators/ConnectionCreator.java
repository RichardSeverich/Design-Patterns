package patternfactoryabstract.creators;

import patternfactoryabstract.products.Connection;

/**
 * Interface.
 */
public interface ConnectionCreator {

    /**
     * @return Connection.
     */
    Connection createConnection();
}
