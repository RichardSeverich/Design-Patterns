package creational.factory;

import creational.factory.products.Connection;
import creational.factory.products.ConnectionMySql;
import creational.factory.products.ConnectionOracle;
import creational.factory.products.ConnectionPostgresSql;
import creational.factory.products.ConnectionSql;

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
