package structure.composide;

import java.util.ArrayList;
import java.util.List;

/**
 * Task.
 */
public class Task implements Composite {
    private String taskName;
    private List<Composite> subTasks;

    /**
     * @param taskName taskName.
     */
    Task(final String taskName) {
        subTasks = new ArrayList<>();
        this.taskName = taskName;
    }

    /**
     * @param subTask subProject.
     */
    void setSubTask(final SubTask subTask) {
        this.subTasks.add(subTask);
    }

    /**
     * @return taskName.
     */
    String getTaskName() {
        return this.taskName;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getTime() {
        int totalTime = 0;
        for (Composite item : this.subTasks) {
            totalTime += item.getTime();
        }
        return totalTime;
    }
}
