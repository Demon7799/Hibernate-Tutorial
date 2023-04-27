package tutorial4.mapping.OneToMany_ManyToOne;

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
		Question question = new Question();
		Answers answer1 = new Answers();
		Answers answer2 = new Answers();
		Answers answer3 = new Answers();
		
		//setting fields to answer1
		answer1.setId(21);
		answer1.setAnswer("Rinnegan");
		answer1.setQuestion(question);
		
		//setting fields to answer2
		answer2.setId(22);
		answer2.setAnswer("Tengai Shinsei");
		answer2.setQuestion(question);
		
		//setting fields to answer3
		answer3.setId(23);
		answer3.setAnswer("Fire Style Jutsu");
		answer3.setQuestion(question);
		
		List<Answers> answerList = new ArrayList<Answers>();
		answerList.add(answer1);
		answerList.add(answer2);
		answerList.add(answer3);
		
		question.setId(11);
		question.setQuestion("Powers of Madara Uchiha??");
		question.setAnswer(answerList);
		
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction trs = session.beginTransaction();
		
		session.save(answer1);
		session.save(answer2);
		session.save(answer3);
		session.save(question);
		
		trs.commit();
		session.close();
		
		
	}

}
