package builder;

import java.util.List;

/**
 * Interface.
 */
public interface ProtocolManager {

    /**
     * @param listActions List of actions.
     * @param endpoint    End point.
     * @return Protocol Manager.
     */
    ProtocolManager perform(List<String> listActions, String endpoint);

    /**
     * @return result.
     */
    String getResult();
}
