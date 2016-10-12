package homework;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

public class ReviewDisplayer {

	private static ReviewDisplayer reviewDisplayer;
	private ReviewDisplayer() {
		this.container = new ArrayList<ReviewResponse>();
		try {
			this.loadQuestionMain();
		}catch(Exception e){
			System.err.println(e);
		}
		this.printAvailableQuestions();
	}
	private List<ReviewResponse> container;
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ReviewDisplayer.reviewDisplayer = new ReviewDisplayer();
		System.out.print("Enter the Review Number: ");
		String[] review = sc.nextLine().split("[.]");
		boolean exitCode = false;
		
		while(!exitCode)
		{
			try {
				int reviewNumber = Integer.parseInt(review[0]);
				int questionNumber = Integer.parseInt(review[1]);
				exitCode = ReviewDisplayer.reviewDisplayer.executeQuestion(reviewNumber, questionNumber);
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.print("You entered an invalid review number.");
			}catch(NumberFormatException e){
				System.out.print("You entered an invalid review number.");
			}
		}
	}
	
	/**
	 * Traverses the classpath and gets ReviewResponse implementations in the same
	 * package, and adds it to the container.
	 * @throws ClassNotFoundException
	 * @throws IOException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 * @throws SecurityException
	 */
	private void loadQuestionMain() throws ClassNotFoundException,
										   IOException, 
										   InstantiationException, 
										   IllegalAccessException, 
										   IllegalArgumentException, 
										   InvocationTargetException, 
										   SecurityException {
		for(Class<?> c : 
			ClasspathManager.getClasses
			("grade12")) { //loop through all classes
			if(ReviewResponse.class.isAssignableFrom(c) && !c.equals(ReviewResponse.class)) { //we don't want the base class.
				this.container.add((ReviewResponse)c.newInstance()); //instantiate a new instance of the response
			}
		}
	}
	
	/**
	 * Prints the available questions loaded in the container
	 */
	private void printAvailableQuestions() {
		System.out.print("Available questions: ");
		for(ReviewResponse r : this.container) {
			System.out.print(r.getReviewNumber() + "." + r.getQuestionNumber()+", ");
		}
		System.out.println();
	}
	
	/**
	 * Executes a question
	 * @param reviewNumber
	 * @param questionNumber
	 */
	private boolean executeQuestion(int reviewNumber, int questionNumber) {
		for(ReviewResponse r : this.container) {
			if(r.getReviewNumber() == reviewNumber 
					&& r.getQuestionNumber() == questionNumber)
			{
				r.main();
				return true;
			}
		}
		return false;
	}
	
	
	
	
	

}
