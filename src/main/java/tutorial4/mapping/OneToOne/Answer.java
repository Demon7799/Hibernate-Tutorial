package tutorial4.mapping.OneToOne;

import javax.persistence.*;

@Entity
public class Answer 
{
	@Id
	@Column(name="answer_id")
	private int answerId;
	private String answer;
	@OneToOne//(mappedBy = "answer") -> it will not create questionid column in Answer table
	private Questions questionid;
	
	/**
	 * @param answerId
	 * @param answer
	 * @param question
	 */
	public Answer() {}
	public Answer(int answerId, String answer, Questions question) 
	{
		super();
		this.answerId = answerId;
		this.answer = answer;
		this.questionid = question;
	}
	/**
	 * @return the answerId
	 */
	public int getAnswerId() {
		return answerId;
	}
	/**
	 * @return the answer
	 */
	@OneToOne
	public String getAnswer() {
		return answer;
	}
	/**
	 * @return the question
	 */
	public Questions getQuestionId() {
		return questionid;
	}
	/**
	 * @param answerId the answerId to set
	 */
	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}
	/**
	 * @param answer the answer to set
	 */
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	/**
	 * @param question the question to set
	 */
	public void setQuestionId(Questions question) {
		this.questionid = question;
	}
}
