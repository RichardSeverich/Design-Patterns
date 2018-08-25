package creational.singleton;

/**
 * Class.
 */
public final class Singleton {

    private static Singleton mySingleton;

    /**
     * Constructor.
     */
    private Singleton() {
    }

    /**
     * @return Singleton.
     */
    static Singleton getSingleton() {
        if (mySingleton == null) {
            mySingleton = new Singleton();
        }
        return mySingleton;
    }
}
