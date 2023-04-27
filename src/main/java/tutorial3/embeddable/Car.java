package tutorial3.embeddable;

import javax.persistence.Entity;

import javax.persistence.*;

@Entity
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "company", length = 50)
	private String brand;

	@Column(name = "car_model", length = 100)
	private String model;

	private Documents docs;

	/**
	 * @return the docs
	 */
	public Documents getDocs() {
		return docs;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @param docs the docs to set
	 */
	public void setDocs(Documents docs) {
		this.docs = docs;
	}

}
