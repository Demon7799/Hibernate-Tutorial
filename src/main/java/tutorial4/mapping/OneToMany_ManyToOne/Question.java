package tutorial4.mapping.OneToMany_ManyToOne;

import java.util.List;
import javax.persistence.*;


@Entity
public class Question
{
	@Id
	private int id;
	
	private String question;
	
	@OneToMany(mappedBy = "question")
	private List<Answers> answer;

	public int getId()
	{
		return id;
	}

	public String getQuestion()
	{
		return question;
	}

	public List<Answers> getAnswer()
	{
		return answer;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public void setQuestion(String question)
	{
		this.question = question;
	}

	public void setAnswer(List<Answers> answer)
	{
		this.answer = answer;
	}
	
	
}
