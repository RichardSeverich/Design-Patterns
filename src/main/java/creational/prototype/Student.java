package creational.prototype;

/**
 * Class.
 */
public class Student extends Person {

    /**
     * Constructor.
     */
    Student() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Person clonePerson() {
        Student newStudent = new Student();
        newStudent.setName(this.getName());
        newStudent.setAge(this.getAge());
        return newStudent;
    }
}
