package structure.composide;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test.
 */
public class ProjectTest {

    /**
     * Test.
     */
    @Test
    public void testSelect() {
        final Project project = new Project("PROJECT");
        // Sub Projects
        final SubProject subProjectOne = new SubProject("SUB_PROJECT_ONE");
        final SubProject subProjectTwo = new SubProject("SUB_PROJECT_TWO");
        // Tasks
        final Task taskOne = new Task("TASK_ONE");
        final Task taskTwo = new Task("TASK_TWO");
        final Task taskThree = new Task("TASK_THREE");
        final Task taskFour = new Task("TASK_FOUR");
        // SubTasks
        final SubTask subTaskOne = new SubTask("TASK_ONE");
        final SubTask subTaskTwo = new SubTask("TASK_TWO");
        final SubTask subTaskThree = new SubTask("TASK_THREE");
        final SubTask subTaskFour = new SubTask("TASK_FOUR");
        final SubTask subTaskFive = new SubTask("TASK_FIVE");
        final SubTask subTaskSix = new SubTask("TASK_SIX");

        // Set Sub tasks Times
        final int eight = 8;
        final int sixteen = 16;
        final int twentyFour = 2;
        final int six = 6;
        final int twelve = 12;
        subTaskOne.setSubTaskTime(eight);
        subTaskTwo.setSubTaskTime(sixteen);
        subTaskThree.setSubTaskTime(twentyFour);
        subTaskFour.setSubTaskTime(sixteen);
        subTaskFive.setSubTaskTime(six);
        subTaskSix.setSubTaskTime(twelve);

        // Set Sub Tasks to Tasks
        // Task One
        taskOne.setSubTask(subTaskOne);
        taskOne.setSubTask(subTaskTwo);
        taskOne.setSubTask(subTaskThree);
        // Task Two
        taskTwo.setSubTask(subTaskFour);
        taskTwo.setSubTask(subTaskFive);
        taskTwo.setSubTask(subTaskSix);
        // Task Three
        taskThree.setSubTask(subTaskOne);
        taskThree.setSubTask(subTaskFive);
        taskThree.setSubTask(subTaskSix);
        // Task Four
        taskFour.setSubTask(subTaskOne);
        taskFour.setSubTask(subTaskTwo);
        taskFour.setSubTask(subTaskFour);
        // Set Tasks to Sub Project.
        subProjectOne.setTask(taskOne);
        subProjectOne.setTask(taskThree);
        subProjectTwo.setTask(taskTwo);
        subProjectTwo.setTask(taskFour);

        // Set Sub Project to Project.
        project.setSubProject(subProjectOne);
        project.setSubProject(subProjectTwo);

        // Test Sub Tasks.
        assertEquals(subTaskOne.getTime(), eight);
        assertEquals(subTaskTwo.getTime(), sixteen);
        assertEquals(subTaskThree.getTime(), twentyFour);
        assertEquals(subTaskFour.getTime(), sixteen);
        assertEquals(subTaskFive.getTime(), six);
        assertEquals(subTaskSix.getTime(), twelve);

        // Test Tasks.
        final int twentySix = 26;
        final int thirtyFour = 34;
        final int forty = 40;
        assertEquals(taskOne.getTime(), twentySix);
        assertEquals(taskTwo.getTime(), thirtyFour);
        assertEquals(taskThree.getTime(), twentySix);
        assertEquals(taskFour.getTime(), forty);

        // Test SubProjects
        final int fiftyTwo = 52;
        final int seventyFor = 74;
        assertEquals(subProjectOne.getTime(), fiftyTwo);
        assertEquals(subProjectTwo.getTime(), seventyFor);

        // Test Project
        final int oneHundredTwentySix = 126;
        assertEquals(project.getTime(), oneHundredTwentySix);

    }
}
