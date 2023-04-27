package tutorial4.mapping.OneToMany_ManyToOne;

import javax.persistence.*;

@Entity
public class Answers
{
	@Id
	private int id;
	private String answer;
	@ManyToOne
	private Question question;
	
	public int getId()
	{
		return id;
	}
	public String getAnswer()
	{
		return answer;
	}
	public Question getQuestion()
	{
		return question;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public void setAnswer(String answer)
	{
		this.answer = answer;
	}
	public void setQuestion(Question question)
	{
		this.question = question;
	}
}
