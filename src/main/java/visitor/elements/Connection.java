package visitor.elements;

import visitor.visitors.Visitor;

/**
 * Interface.
 */
public interface Connection {

    /**
     * @return description.
     */
    String getDescription();

    /**
     * Close Connection.
     */
    void closeConnection();

    /**
     * Open Connection.
     */
    void openConnection();

    /**
     * @return Connection Status.
     */
    String getConnectionStatus();

    /**
     * @param visitor visitor.
     */
    void acceptVisitor(Visitor visitor);

}
