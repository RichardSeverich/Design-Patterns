package patternsingleton;

import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;

/**
 * Tests.
 */
public class SingletonTest {

    /**
     * Test.
     */
    @Test
    public void testConnectionSql() {
        Singleton mySingletonOne = Singleton.getSingleton();
        Singleton mySingletonTwo = Singleton.getSingleton();
        assertNotNull(mySingletonOne);
        assertNotNull(mySingletonTwo);
    }
}
