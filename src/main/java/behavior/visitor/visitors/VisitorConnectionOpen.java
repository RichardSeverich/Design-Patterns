package behavior.visitor.visitors;

import behavior.visitor.elements.Connection;

/**
 * Class.
 */
public class VisitorConnectionOpen implements Visitor {

    /**
     * {@inheritDoc}.
     */
    @Override
    public void visitElementConnection(final Connection connection) {
        connection.openConnection();
    }
}
