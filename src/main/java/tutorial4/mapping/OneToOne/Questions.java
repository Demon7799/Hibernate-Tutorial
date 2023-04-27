package tutorial4.mapping.OneToOne;

import javax.persistence.*;

@Entity
public class Questions 
{
	@Id
	@Column(name="question_id")
	private int questionId;
	private String question;
	@OneToOne
	private Answer answer;
		

	/**
	 * @return the questionId
	 */
	public int getQuestionId() {
		return questionId;
	}
	/**
	 * @return the question
	 */
	public String getQuestion() {
		return question;
	}
	/**
	 * @return the answer
	 */
	@OneToOne
	public Answer getAnswer() {
		return answer;
	}
	/**
	 * @param questionId the questionId to set
	 */
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	/**
	 * @param question the question to set
	 */
	public void setQuestion(String question) {
		this.question = question;
	}
	/**
	 * @param answer the answer to set
	 */
	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
	
	
}
