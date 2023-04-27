package tutorial4.mapping.ManyToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App
{
	public static void main(String[] args)
	{
		Projects p1 = new Projects();
		Projects p2 = new Projects();
		
		
		Employees e1 = new Employees();
		Employees e2 = new Employees();
		
		List<Projects> projectList = new ArrayList<Projects>();
		List<Employees> employeeList = new ArrayList<Employees>();
		
		p1.setId(11);
		p2.setId(12);
		p1.setProjectName("Adidas");
		p2.setProjectName("Nike");
		projectList.add(p1);
		projectList.add(p2);
		
		e1.setId(51);
		e2.setId(52);
		e1.setEmpName("Demon");
		e2.setEmpName("Ghost");
		employeeList.add(e1);
		employeeList.add(e2);
		
		p1.setEmp(employeeList);
		p2.setEmp(employeeList);
		
		e1.setProjects(projectList);
		e2.setProjects(projectList);
		
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction trx = session.beginTransaction();
		
		session.save(e1);
		session.save(e2);
		session.save(p1);
		session.save(p2);
		
		trx.commit();
		session.close();
	}

}
