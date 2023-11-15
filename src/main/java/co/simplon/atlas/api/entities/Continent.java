package co.simplon.atlas.api.entities;
import java.util.UUID;

public class Continent {
	private UUID id;
	private String name;
	private double area;
	public Continent() {

		this.id = null;
		this.name = null;
		this.area = 0.1;
	}
	
	public UUID getId() {
        return id;
    }
	
	 public void setId(UUID id) {
	        this.id = id;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
}