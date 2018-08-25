package behavior.strategy;

/**
 * Class.
 */
public class StrategyCompressZip implements StrategyCompress {

    /**
     * {@inheritDoc}
     */
    @Override
    public String compress() {
        return "Zip";
    }
}
