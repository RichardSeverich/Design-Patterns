package decorator;

/**
 * Class.
 */
public class QuerySelect extends QueryDecorator {

    private QueryBase myQueryBase;

    /**
     * @param queryBase QueryBase.
     * @param tableName tableName.
     */
    QuerySelect(final QueryBase queryBase, final String tableName) {
        super.setTable(tableName);
        this.myQueryBase = queryBase;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getQuery() {
        return myQueryBase.getQuery().equals("")
                ? "SELECT * FROM " + this.getTable()
                : myQueryBase.getQuery() + ", " + "SELECT * FROM " + this.getTable();
    }
}
