package tutorial3.embeddable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
	public static void main(String[] args) 
	{
		Car car = new Car();
		Documents docs = new Documents();
		
		docs.setDrivingLicense(true);
		docs.setVehicleRC(false);
		
		car.setBrand("Maserati");
		car.setModel("Levante");
		car.setDocs(docs);
		
		Configuration config = new Configuration();
		
		SessionFactory sessionFactory = config.configure().buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction trs = session.beginTransaction();
		
		session.save(car);
		trs.commit();
		session.close();
	}
}
