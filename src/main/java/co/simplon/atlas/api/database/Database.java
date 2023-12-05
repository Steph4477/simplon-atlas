package co.simplon.atlas.api.database;

import co.simplon.atlas.api.entities.Capital;
import co.simplon.atlas.api.entities.Continent;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Database {

    private static Map<UUID, Capital> capitals = new HashMap<>();
    private static Map<UUID, Continent> continents = new HashMap<>();

    public static void addCapital(Capital capital) {
        capital.setId(UUID.randomUUID());
        capitals.put(capital.getId(), capital);
    }
    
    public static void addContinent(Continent continent) {
        continent.setId(UUID.randomUUID());
        continents.put(continent.getId(), continent);
    }

   public static Capital getCapital(UUID id) {
        return capitals.get(id);
    }
    
    public static Continent getContinent(UUID id) {
        return continents.get(id);
    }
}
