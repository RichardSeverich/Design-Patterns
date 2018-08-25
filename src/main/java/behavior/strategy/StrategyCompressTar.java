package behavior.strategy;

/**
 * Class.
 */
public class StrategyCompressTar implements StrategyCompress {

    /**
     * {@inheritDoc}
     */
    @Override
    public String compress() {
        return "Tar";
    }
}
