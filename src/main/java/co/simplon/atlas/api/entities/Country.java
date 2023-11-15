package co.simplon.atlas.api.entities;

import java.util.UUID;

public class Country {

	private UUID id;
	private String isoCode2;
	private String isoCode3;
	private String name;
	private int population;
	private double area;
	private String language;

	public Country() {

		this.id = null;
		this.isoCode2 = null;
		this.isoCode3 = null;
		this.name = null;
		this.population = 0;
		this.area = 0.0;
		this.language = null;

	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getIsoCode2() {
		return isoCode2;
	}

	public void setIsoCode2(String isoCode2) {
		this.isoCode2 = isoCode2;
	}

	public String getIsoCode3() {
		return isoCode3;
	}

	public void setIsoCode3(String isoCode3) {
		this.isoCode3 = isoCode3;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

}
