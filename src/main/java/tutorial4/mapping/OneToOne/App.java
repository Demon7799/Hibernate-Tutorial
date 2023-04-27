package tutorial4.mapping.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) 
	{
		Questions question = new Questions();
		Answer answer = new Answer();
		
		answer.setAnswerId(77);
		answer.setAnswer("Yellow Flash Of The Leaf");
		answer.setQuestionId(question);
		question.setQuestionId(7);
		question.setQuestion("What is Minato's nickname?");
		question.setAnswer(answer);
		
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction trs = session.beginTransaction();
		session.save(question);
		session.save(answer);
		trs.commit();
		
		//Fetching
		
		Questions que = session.get(Questions.class, 7);
		System.out.println(que.getQuestion());
		System.out.println(que.getAnswer().getAnswer());
		
		session.close();
	}

}
