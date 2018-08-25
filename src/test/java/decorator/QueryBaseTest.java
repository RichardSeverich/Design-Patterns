package decorator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test Class.
 */
public class QueryBaseTest {


    private QueryBase queryBase;

    /**
     * Before.
     */
    @Before
    public void setUp() {
        queryBase = new QueryBase();
    }

    /**
     * Test.
     */
    @Test
    public void testSelect() {
        final String expectedResult = "SELECT * FROM USERS";
        queryBase = new QuerySelect(queryBase, "USERS");
        assertEquals(expectedResult, queryBase.getQuery());
    }

    /**
     * Test.
     */
    @Test
    public void testInsert() {
        final String expectedResult = "INSERT INTO CLIENTS";
        queryBase = new QueryInsert(queryBase, "CLIENTS");
        assertEquals(expectedResult, queryBase.getQuery());
    }

    /**
     * Test.
     */
    @Test
    public void testUpdate() {
        final String expectedResult = "UPDATE PRODUCTS";
        queryBase = new QueryUpdate(queryBase, "PRODUCTS");
        assertEquals(expectedResult, queryBase.getQuery());
    }

    /**
     * Test.
     */
    @Test
    public void testDelete() {
        final String expectedResult = "DELETE PRICES";
        queryBase = new QueryDelete(queryBase, "PRICES");
        assertEquals(expectedResult, queryBase.getQuery());
    }

    /**
     * Test.
     */
    @Test
    public void testSelectInsertUpdateDelete() {
        final String expectedResult = "SELECT * FROM USERS, INSERT INTO CLIENTS, UPDATE PRODUCTS, DELETE PRICES";
        queryBase = new QuerySelect(queryBase, "USERS");
        queryBase = new QueryInsert(queryBase, "CLIENTS");
        queryBase = new QueryUpdate(queryBase, "PRODUCTS");
        queryBase = new QueryDelete(queryBase, "PRICES");
        assertEquals(expectedResult, queryBase.getQuery());
    }
}
