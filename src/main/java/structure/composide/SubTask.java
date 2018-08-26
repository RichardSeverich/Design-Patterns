package structure.composide;

/**
 * Sub Task.
 */
public class SubTask implements Composite {

    private String subTaskName;
    private int subTaskTime;

    /**
     * @param subTaskName subTaskName.
     */
    SubTask(final String subTaskName) {
        this.subTaskName = subTaskName;
    }

    /**
     * @param subTakTime subTakTime.
     */
    void setSubTaskTime(final int subTakTime) {
        this.subTaskTime = subTakTime;
    }

    /**
     * @return subTaskName.
     */
    String getSubTaskName() {
        return this.subTaskName;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getTime() {
        return subTaskTime;
    }
}
