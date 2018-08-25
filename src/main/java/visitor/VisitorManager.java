package visitor;

import visitor.elements.Connection;
import visitor.elements.ConnectionMySql;
import visitor.elements.ConnectionOracle;
import visitor.elements.ConnectionPostgresSql;
import visitor.elements.ConnectionSql;
import visitor.visitors.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Class.
 */
public class VisitorManager {

    private List<Connection> connectionList;

    /**
     * Constructor.
     */
    VisitorManager() {
        connectionList = new ArrayList<>();
        connectionList.add(new ConnectionMySql());
        connectionList.add(new ConnectionOracle());
        connectionList.add(new ConnectionPostgresSql());
        connectionList.add(new ConnectionSql());
    }

    /**
     * @param visitor visitor.
     */
    public void visitor(final Visitor visitor) {
        for (Connection typeConnection : connectionList) {
            typeConnection.acceptVisitor(visitor);
        }
    }

    /**
     * @return Connection list.
     */
    List<Connection> getConnectionList() {
        return connectionList;
    }

}
