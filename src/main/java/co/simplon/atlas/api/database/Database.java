package co.simplon.atlas.api.database;

import co.simplon.atlas.api.entities.Capital;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Database {

    private static Map<UUID, Capital> capitals = new HashMap<>();

    public static Map<UUID, Capital> getCapitals() {
        return capitals;
    }

    public static void addCapital(Capital capital) {
        capitals.put(capital.getId(), capital);
    }

    public static Capital getCapital(UUID id) {
        return capitals.get(id);
    }

    public static void updateCapital(Capital capital) {
        capitals.put(capital.getId(), capital);
    }
}
