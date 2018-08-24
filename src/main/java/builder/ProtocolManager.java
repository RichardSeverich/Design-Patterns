package builder;

import java.util.List;

/**
 * Interface.
 */
public interface ProtocolManager {

    /**
     *
     * @param listActions
     * @param endpoint
     */
    void perform(List<String> listActions, String endpoint);
}
