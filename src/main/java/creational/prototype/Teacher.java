package creational.prototype;

/**
 * Class.
 */
public class Teacher extends Person {

    /**
     * Constructor.
     */
    Teacher() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Person clonePerson() {
        Teacher newTeacher = new Teacher();
        newTeacher.setName(this.getName());
        newTeacher.setAge(this.getAge());
        return newTeacher;
    }
}
