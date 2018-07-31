package patternfactory;

import patternfactory.products.Connection;
import patternfactory.products.ConnectionMySql;
import patternfactory.products.ConnectionOracle;
import patternfactory.products.ConnectionPostgresSql;
import patternfactory.products.ConnectionSql;

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
     * @param typeConnection Type Connection.
     * @return Connection.
     */
    Connection createConnection(final String typeConnection) {
        switch (typeConnection) {
            case "Sql":
                return new ConnectionSql();
            case "MySql":
                return new ConnectionMySql();
            case "Oracle":
                return new ConnectionOracle();
            case "PostgresSql":
                return new ConnectionPostgresSql();
            default:
                return new ConnectionSql();
        }

    }
}
