package structure.decorator;


/**
 * Abstract.
 */
public abstract class QueryDecorator extends QueryBase {

    /**
     * Constructor.
     */
    QueryDecorator() {

    }

    /**
     * @return description.
     */
    public abstract String getQuery();

}
