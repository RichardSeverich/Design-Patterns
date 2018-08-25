package behavior.observator.observers;

/**
 * Interface.
 */
public interface ConnectionObserver {
    /**
     * @param status Status.
     */
    void update(String status);

    /**
     * @return Status.
     */
    String getStatus();
}
