package factory;

import factory.products.Connection;
import factory.products.ConnectionMySql;
import factory.products.ConnectionOracle;
import factory.products.ConnectionPostgresSql;
import factory.products.ConnectionSql;

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
