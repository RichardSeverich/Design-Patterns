package creational.factoryabstract.creators;

import creational.factoryabstract.products.Connection;

/**
 * Interface.
 */
public interface ConnectionCreator {

    /**
     * @return Connection.
     */
    Connection createConnection();
}
