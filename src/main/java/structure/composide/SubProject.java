package structure.composide;

import java.util.ArrayList;
import java.util.List;

/**
 * Sub Project.
 */
public class SubProject implements Composite {

    private String subProjectName;
    private List<Composite> subTasks;

    /**
     * @param subProjectName subProjectName.
     */
    SubProject(final String subProjectName) {
        subTasks = new ArrayList<>();
        this.subProjectName = subProjectName;
    }

    /**
     * @param task subProject.
     */
    void setTask(final Task task) {
        this.subTasks.add(task);
    }

    /**
     * @return subProjectName.
     */
    String getSubProjectName() {
        return this.subProjectName;
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
