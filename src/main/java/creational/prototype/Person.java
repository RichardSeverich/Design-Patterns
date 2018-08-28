package creational.prototype;

/**
 * Abstract class.
 */
public abstract class Person {

    private String name;
    private int age;

    /**
     * @return Person.
     */
    public abstract Person clonePerson();

    /**
     * @return name.
     */
    String getName() {
        return name;
    }

    /**
     * @param name name.
     */
    void setName(final String name) {
        this.name = name;
    }

    /**
     * @return age.
     */
    int getAge() {
        return age;
    }

    /**
     * @param age age.
     */
    void setAge(final int age) {
        this.age = age;
    }

}
