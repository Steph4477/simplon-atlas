package co.simplon.atlas.api.entities;
import co.simplon.atlas.api.database.Database;
import java.util.UUID;

public class Capital {

    private UUID id;
    private String name;
    private int population;

    public Capital(String name, int population) {
       
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
       // Database.updateCapital(this);
    }

    public void createCapital() {
        Database.addCapital(this);
    }

	public UUID setId(UUID randomUUID) {
		// TODO Auto-generated method stub
		return null;
	}

	public void setId(Object randomUUID) {
		// TODO Auto-generated method stub
		
	}

	
}
