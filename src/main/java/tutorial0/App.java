package tutorial0;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) 
	{
		System.out.println("Running.....");
		
//		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		Configuration cfg = new Configuration();
		cfg.configure();
		
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		
		String str = sessionFactory.getStatistics().toString();
		
		System.out.println(str);
		
		String str1[] = str.split(",");
		
		for(String s:str1)
		{
			System.out.println(s);
		}
	}

}
