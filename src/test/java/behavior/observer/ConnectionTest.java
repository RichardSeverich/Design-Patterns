package behavior.observer;

import behavior.observator.Connection;
import behavior.observator.observers.ConnectionMySql;
import behavior.observator.observers.ConnectionObserver;
import behavior.observator.observers.ConnectionOracle;
import behavior.observator.observers.ConnectionPostgresSql;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests.
 */
public class ConnectionTest {

    private Connection myConnection;
    private ConnectionObserver myConnectionSql;
    private ConnectionObserver myConnectionMySql;
    private ConnectionObserver myConnectionOracle;
    private ConnectionObserver myConnectionPostgresSql;

    /**
     * Before.
     */
    @Before
    public void setUp() {
        myConnection = new Connection();
        myConnectionSql = new ConnectionMySql();
        myConnectionMySql = new ConnectionMySql();
        myConnectionOracle = new ConnectionOracle();
        myConnectionPostgresSql = new ConnectionPostgresSql();
    }

    /**
     * Test.
     */
    @Test
    public void testObserverPattern() {
        final String expectedResultOpened = "Opened";
        final String expectedResultClosed = "Closed";
        myConnection.addObservers(myConnectionSql);
        myConnection.addObservers(myConnectionMySql);
        myConnection.addObservers(myConnectionOracle);
        myConnection.addObservers(myConnectionPostgresSql);
        myConnection.openConnection();
        assertEquals(expectedResultOpened, myConnectionSql.getStatus());
        assertEquals(expectedResultOpened, myConnectionMySql.getStatus());
        assertEquals(expectedResultOpened, myConnectionOracle.getStatus());
        assertEquals(expectedResultOpened, myConnectionPostgresSql.getStatus());
        myConnection.closeConnection();
        assertEquals(expectedResultClosed, myConnectionSql.getStatus());
        assertEquals(expectedResultClosed, myConnectionMySql.getStatus());
        assertEquals(expectedResultClosed, myConnectionOracle.getStatus());
        assertEquals(expectedResultClosed, myConnectionPostgresSql.getStatus());
    }
}
