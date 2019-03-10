package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pet {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; 
	private String name; 
	private String type; 
	private String gender; 
	private int weight; 
	private int microchip;
	
	public Pet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pet(String name, String type, String gender, int weight, int microchip) {
		super();
		this.name = name;
		this.type = type;
		this.gender = gender;
		this.weight = weight;
		this.microchip = microchip;
	}

	public Pet(int id, String name, String type, String gender, int weight, int microchip) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.gender = gender;
		this.weight = weight;
		this.microchip = microchip;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getMicrochip() {
		return microchip;
	}

	public void setMicrochip(int microchip) {
		this.microchip = microchip;
	}

	@Override
	public String toString() {
		return "Pet [id=" + id + ", name=" + name + ", type=" + type + ", gender=" + gender + ", weight=" + weight
				+ ", microchip=" + microchip + "]";
	} 
	
	
	
}
