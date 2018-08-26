package structure.decorator;

/**
 * Class.
 */
public class QueryBase {

    private String tableName;
    private static final String EMPTY = "";

    /**
     * Constructor.
     */
    QueryBase() {
    }

    /**
     * @return Table name.
     */
    public String getQuery() {
        return EMPTY;
    }

    /**
     * @param tableName tableName.
     */
    void setTable(final String tableName) {
        this.tableName = tableName;
    }

    /**
     * @return get Table.
     */
    String getTable() {
        return this.tableName;
    }
}
