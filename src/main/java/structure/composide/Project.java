package structure.composide;

import java.util.ArrayList;
import java.util.List;

/**
 * Project.
 */
public class Project implements Composite {

    private String projectName;
    private List<Composite> subProjects;

    /**
     * @param projectName projectName.
     */
    Project(final String projectName) {
        subProjects = new ArrayList<>();
        this.projectName = projectName;
    }

    /**
     * @param subProject subProject.
     */
    void setSubProject(final SubProject subProject) {
        this.subProjects.add(subProject);
    }

    /**
     * @return projectName.
     */
    String getProjectName() {
        return this.projectName;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getTime() {
        int totalTime = 0;
        for (Composite item : this.subProjects) {
            totalTime += item.getTime();
        }
        return totalTime;
    }
}
