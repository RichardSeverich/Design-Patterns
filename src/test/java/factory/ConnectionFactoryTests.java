package factory;

import org.junit.Before;
import org.junit.Test;
import factory.products.Connection;

import static org.junit.Assert.assertEquals;

/**
 * Tests.
 */
public class ConnectionFactoryTests {

    private ConnectionFactory myConnectionFactory;
    private Connection myConnection;

    /**
     * Before.
     */
    @Before
    public void setUp() {
        myConnectionFactory = new ConnectionFactory();
    }

    /**
     * Test.
     */
    @Test
    public void testConnectionSql() {
        myConnection = myConnectionFactory.createConnection("Sql");
        assertEquals("SQL Connection", myConnection.description());
    }

    /**
     * Test.
     */
    @Test
    public void testConnectionOracle() {
        myConnection = myConnectionFactory.createConnection("Oracle");
        assertEquals("Oracle Connection", myConnection.description());
    }

    /**
     * Test.
     */
    @Test
    public void testConnectionMySql() {
        myConnection = myConnectionFactory.createConnection("MySql");
        assertEquals("MySQL Connection", myConnection.description());
    }

    /**
     * Test.
     */
    @Test
    public void testConnectionPostgresSql() {
        myConnection = myConnectionFactory.createConnection("PostgresSql");
        assertEquals("PostgresSql Connection", myConnection.description());
    }

    /**
     * Test.
     */
    @Test
    public void testConnectionDefault() {
        myConnection = myConnectionFactory.createConnection("Default");
        assertEquals("SQL Connection", myConnection.description());
    }
}
