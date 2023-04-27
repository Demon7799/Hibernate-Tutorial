package tutorial0;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.github.javafaker.Faker;

public class DBInsert_Example 
{
	public static void main(String[] args) 
	{
		Faker faker = new Faker();
		
		// Setting Values in Person Entity
		Person person = new Person();
		
		person.setId(1);
		person.setFirstName(faker.name().firstName());
		person.setLastName(faker.name().lastName());
		person.setDob(faker.date().birthday());
		
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();		
		
		session.save(person);
		
		transaction.commit();
		
		session.close();
		System.out.println(person);
	}

}
