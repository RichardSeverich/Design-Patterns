package strategy;

/**
 * Class.
 */
public class StrategyManager {

    /**
     * Constructor.
     */
    StrategyManager() {
    }

    /**
     * @param myStrategyCompress Strategy.
     * @return result.
     */
    String compress(final StrategyCompress myStrategyCompress) {
        return myStrategyCompress.compress();
    }
}
