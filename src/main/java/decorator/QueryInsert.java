package decorator;

/**
 * Class.
 */
public class QueryInsert extends QueryDecorator {

    private QueryBase myQueryBase;

    /**
     *
     * @param queryBase queryBase.
     * @param tableName tableName.
     */
    QueryInsert(final QueryBase queryBase, final String tableName) {
        super.setTable(tableName);
        this.myQueryBase = queryBase;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getQuery() {
        return myQueryBase.getQuery().equals("")
                ? "INSERT INTO " + this.getTable()
                : myQueryBase.getQuery() + ", " + "INSERT INTO " + this.getTable();
    }
}
