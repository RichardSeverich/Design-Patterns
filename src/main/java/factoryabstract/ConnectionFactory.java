package factoryabstract;

import factoryabstract.creators.ConnectionCreator;
import factoryabstract.products.Connection;

/**
 * Class.
 */
public class ConnectionFactory {
    /**
     * Constructor.
     */
    ConnectionFactory() {
    }

    /**
     * @param myConnectionCreator Type Creator.
     * @return Connection.
     */
    Connection createConnection(final ConnectionCreator myConnectionCreator) {
        return myConnectionCreator.createConnection();
    }
}
