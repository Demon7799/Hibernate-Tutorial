package tutorial1.column_annotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.github.javafaker.Faker;

public class App {

	public static void main(String[] args) 
	{
		Faker faker = new Faker();
		
		AddressEntity address;
		
		
		
//		System.out.println(address);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction;
		
		
		for(int i=1;i<9;i++)
		{
			transaction = session.beginTransaction();
			address = new AddressEntity();
			address.setHouseNo(Integer.parseInt(faker.address().buildingNumber()));
			address.setColonyName(faker.address().city());
			address.setCityName(faker.address().cityName());
			address.setDistrictName(faker.address().state());
			address.setAreaPinCode(faker.address().zipCode());
			session.save(address);
			transaction.commit();
		}
		
		session.close();
		
	}

}
