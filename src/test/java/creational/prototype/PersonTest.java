package creational.prototype;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test Class.
 */
public class PersonTest {

    private static final String RICHARD = "Richard";
    private static final String MICHAEL = "Michael";
    private static final String ANDREA = "Andrea";
    private static final int TEEN = 10;

    /**
     * Test.
     */
    @Test
    public void testStudent() {
        Person studentOne = new Student();
        studentOne.setAge(TEEN);
        studentOne.setName(RICHARD);
        Person studentTwo = studentOne.clonePerson();
        Assert.assertEquals(RICHARD, studentTwo.getName());
        Assert.assertEquals(TEEN, studentTwo.getAge());
        studentOne.setName(MICHAEL);
        studentTwo.setName(ANDREA);
        Assert.assertEquals(MICHAEL, studentOne.getName());
        Assert.assertEquals(ANDREA, studentTwo.getName());

    }

    /**
     * Test.
     */
    @Test
    public void testTeacher() {
        Person teacherOne = new Teacher();
        teacherOne.setAge(TEEN);
        teacherOne.setName(RICHARD);
        Person teacherTwo = teacherOne.clonePerson();
        Assert.assertEquals(RICHARD, teacherTwo.getName());
        Assert.assertEquals(TEEN, teacherTwo.getAge());
        teacherOne.setName(MICHAEL);
        teacherTwo.setName(ANDREA);
        Assert.assertEquals(MICHAEL, teacherOne.getName());
        Assert.assertEquals(ANDREA, teacherTwo.getName());

    }
}
