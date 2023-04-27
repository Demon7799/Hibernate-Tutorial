package tutorial2.fetchdata;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import tutorial1.column_annotation.AddressEntity;


public class App 
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Address Id : ");
		int addressId = input.nextInt();
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		// USE get() METHOD ONLY WHEN YOU ARE NOT SURE WHETHER OBJECT IS PRESENT IN DATABASE OR NOT
		AddressEntity address = session.get(AddressEntity.class, addressId);
		
		System.out.println(address.getCityName());
		
		
		// USE load() METHOD WHEN YOU ARE SURE THAT THE OBJECT IS PRESENT IN DATABASE
		AddressEntity address1 = session.load(AddressEntity.class, addressId);
		System.out.println(address1);
		session.close();
		input.close();
	}
}
