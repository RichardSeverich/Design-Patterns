package factoryabstract.creators;

import factoryabstract.products.Connection;

/**
 * Interface.
 */
public interface ConnectionCreator {

    /**
     * @return Connection.
     */
    Connection createConnection();
}
