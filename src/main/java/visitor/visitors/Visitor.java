package visitor.visitors;

import visitor.elements.Connection;

/**
 * Interface.
 */
public interface Visitor {

    /**
     * @param connection connection.
     */
    void visitElementConnection(Connection connection);
}
