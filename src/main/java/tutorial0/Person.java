package tutorial0;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Person 
{
	@Id
	private int id;
	private String firstName;
	private String lastName;
	private Date dob;
	
	public Person() {}
	
	public Person(int id, String firstName, String lastName, Date dob) 
	{
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob + "]";
	}
	
	
	
	
}
