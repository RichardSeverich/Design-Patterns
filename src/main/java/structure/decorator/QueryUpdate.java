package structure.decorator;

/**
 * Class.
 */
public class QueryUpdate extends QueryDecorator {

    private QueryBase myQueryBase;

    /**
     * @param queryBase queryBase.
     * @param tableName tableName.
     */
    QueryUpdate(final QueryBase queryBase, final String tableName) {
        super.setTable(tableName);
        this.myQueryBase = queryBase;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getQuery() {
        return myQueryBase.getQuery().equals("")
                ? "UPDATE " + this.getTable()
                : myQueryBase.getQuery() + ", " + "UPDATE " + this.getTable();
    }
}
