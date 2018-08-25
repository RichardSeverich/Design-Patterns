package behavior.visitor.visitors;

import behavior.visitor.elements.Connection;

/**
 * Interface.
 */
public interface Visitor {

    /**
     * @param connection connection.
     */
    void visitElementConnection(Connection connection);
}
