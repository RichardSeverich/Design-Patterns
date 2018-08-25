package visitor.visitors;

import visitor.elements.Connection;

/**
 * Class.
 */
public class VisitorConnectionClose implements Visitor {

    /**
     * {@inheritDoc}.
     */
    @Override
    public void visitElementConnection(final Connection connection) {
        connection.closeConnection();
    }
}
