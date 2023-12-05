package co.simplon.atlas.api.entities;

import java.util.UUID;

public class Continent {
	private UUID id;
	private String name;
	private int area;

	public Continent() {

	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
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

}
