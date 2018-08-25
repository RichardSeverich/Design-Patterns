package behavior.visitor;

import behavior.visitor.elements.Connection;
import behavior.visitor.elements.ConnectionMySql;
import behavior.visitor.elements.ConnectionOracle;
import behavior.visitor.elements.ConnectionPostgresSql;
import behavior.visitor.elements.ConnectionSql;
import behavior.visitor.visitors.Visitor;

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
     * @param visitor behavior.visitor.
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
