package visitor;

import org.junit.Before;
import org.junit.Test;
import visitor.elements.Connection;
import visitor.visitors.VisitorConnectionClose;
import visitor.visitors.VisitorConnectionOpen;

import static org.junit.Assert.assertEquals;

/**
 * Test Class.
 */
public class VisitorManagerTest {

    private static final int ZERO = 0;
    private static final int ONE = 1;
    private static final int TWO = 2;
    private static final int THREE = 3;
    private static final String OPEN = "Open";
    private static final String CLOSE = "Close";

    private VisitorManager visitorManager;

    /**
     * Before.
     */
    @Before
    public void setUp() {
        visitorManager = new VisitorManager();
    }

    /**
     * Test.
     */
    @Test
    public void testVisitorConnectionOpen() {
        visitorManager.visitor(new VisitorConnectionOpen());
        final Connection connectionMySql = visitorManager.getConnectionList().get(ZERO);
        final Connection connectionOracle = visitorManager.getConnectionList().get(ONE);
        final Connection connectionPostgresSql = visitorManager.getConnectionList().get(TWO);
        final Connection connectionSql = visitorManager.getConnectionList().get(THREE);
        assertEquals("MySQL Connection", connectionMySql.getDescription());
        assertEquals("Oracle Connection", connectionOracle.getDescription());
        assertEquals("PostgresSql Connection", connectionPostgresSql.getDescription());
        assertEquals("SQL Connection", connectionSql.getDescription());
        assertEquals(OPEN, connectionMySql.getConnectionStatus());
        assertEquals(OPEN, connectionMySql.getConnectionStatus());
        assertEquals(OPEN, connectionMySql.getConnectionStatus());
        assertEquals(OPEN, connectionMySql.getConnectionStatus());
    }

    /**
     * Test.
     */
    @Test
    public void testVisitorConnectionClose() {
        visitorManager.visitor(new VisitorConnectionClose());
        final Connection connectionMySql = visitorManager.getConnectionList().get(ZERO);
        final Connection connectionOracle = visitorManager.getConnectionList().get(ONE);
        final Connection connectionPostgresSql = visitorManager.getConnectionList().get(TWO);
        final Connection connectionSql = visitorManager.getConnectionList().get(THREE);
        assertEquals("MySQL Connection", connectionMySql.getDescription());
        assertEquals("Oracle Connection", connectionOracle.getDescription());
        assertEquals("PostgresSql Connection", connectionPostgresSql.getDescription());
        assertEquals("SQL Connection", connectionSql.getDescription());
        assertEquals(CLOSE, connectionMySql.getConnectionStatus());
        assertEquals(CLOSE, connectionMySql.getConnectionStatus());
        assertEquals(CLOSE, connectionMySql.getConnectionStatus());
        assertEquals(CLOSE, connectionMySql.getConnectionStatus());
    }
}
