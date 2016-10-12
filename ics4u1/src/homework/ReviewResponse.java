/**
 * 
 */
package homework;


/**
 * Represents a response to a homework question
 * @author Ronny Chan
 *
 */
public abstract class ReviewResponse {
	/**
	 * The prompter available for responses
	 */
	protected Prompter prompter;
	protected ReviewResponse(){
		this.prompter = new Prompter(System.in);
		QuestionAnnotation annotate = 
			this.getClass().getAnnotation(QuestionAnnotation.class); //get properties from annotation
		this.reviewNumber = annotate.reviewNumber();
		this.questionNumber = annotate.questionNumber();
		
	}
	
	private int reviewNumber;
	private int questionNumber;
	
	/**
	 * The main response entry point.
	 * Requires a QuestionAnnotation and a ReviewDisplayer to 
	 * enumerate and call all available responses in the classpath.
	 * 
	 * @see QuestionAnnotation
	 * @see ReviewDisplayer
	 */
	public abstract void main();

	/**
	 * Gets the review number
	 * @return The review number
	 */
	public int getReviewNumber() {
		return this.reviewNumber;
	}
	
	/**
	 * Gets the question number
	 * @return The question number
	 */
	public int getQuestionNumber() {
		return this.questionNumber;
	}
}