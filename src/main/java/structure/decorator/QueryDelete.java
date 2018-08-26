package structure.decorator;

/**
 * Class.
 */
public class QueryDelete extends QueryDecorator {

    private QueryBase myQueryBase;

    /**
     * @param queryBase queryBase.
     * @param tableName tableName.
     */
     QueryDelete(final QueryBase queryBase, final String tableName) {
        super.setTable(tableName);
        this.myQueryBase = queryBase;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getQuery() {
        return myQueryBase.getQuery().equals("")
                ? "DELETE " + this.getTable()
                : myQueryBase.getQuery() + ", " + "DELETE " + this.getTable();
    }
}
