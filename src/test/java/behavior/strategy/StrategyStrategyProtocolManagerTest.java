package behavior.strategy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test.
 */
public class StrategyStrategyProtocolManagerTest {

    private StrategyManager myStrategyManager;

    /**
     * Before.
     */
    @Before
    public void setUp() {
        myStrategyManager = new StrategyManager();
    }

    /**
     * Test.
     */
    @Test
    public void testStrategyPattern() {
        final String expectedResultZip = "Zip";
        final String expectedResultRar = "Rar";
        final String expectedResultTar = "Tar";
        assertEquals(expectedResultZip, myStrategyManager.compress(new StrategyCompressZip()));
        assertEquals(expectedResultRar, myStrategyManager.compress(new StrategyCompressRar()));
        assertEquals(expectedResultTar, myStrategyManager.compress(new StrategyCompressTar()));
    }
}
