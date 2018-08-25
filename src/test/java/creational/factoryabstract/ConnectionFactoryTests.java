package creational.factoryabstract;

import org.junit.Before;
import org.junit.Test;
import creational.factoryabstract.creators.ConnectionCreatorMySql;
import creational.factoryabstract.creators.ConnectionCreatorOracle;
import creational.factoryabstract.creators.ConnectionCreatorPostgresSql;
import creational.factoryabstract.creators.ConnectionCreatorSql;
import creational.factoryabstract.products.Connection;

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
        myConnection = myConnectionFactory.createConnection(new ConnectionCreatorSql());
        assertEquals("SQL Connection", myConnection.description());
    }

    /**
     * Test.
     */
    @Test
    public void testConnectionOracle() {
        myConnection = myConnectionFactory.createConnection(new ConnectionCreatorOracle());
        assertEquals("Oracle Connection", myConnection.description());
    }

    /**
     * Test.
     */
    @Test
    public void testConnectionMySql() {
        myConnection = myConnectionFactory.createConnection(new ConnectionCreatorMySql());
        assertEquals("MySQL Connection", myConnection.description());
    }

    /**
     * Test.
     */
    @Test
    public void testConnectionPostgresSql() {
        myConnection = myConnectionFactory.createConnection(new ConnectionCreatorPostgresSql());
        assertEquals("PostgresSql Connection", myConnection.description());
    }

}
