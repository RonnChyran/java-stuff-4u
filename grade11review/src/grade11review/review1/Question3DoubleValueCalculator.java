package grade11review.review1;

import grade11review.QuestionAnnotation;
import grade11review.ReviewResponse;

@QuestionAnnotation(reviewNumber = 1, questionNumber = 3)
public class Question3DoubleValueCalculator extends ReviewResponse {
	
	@Override
	public void main() {
		final int AVERAGE = 3;
		double doubleOne = this.prompter.promptDouble("Please enter first real number");
		double doubleTwo = this.prompter.promptDouble("Please enter second real number");
		double doubleThree = this.prompter.promptDouble("Please enter third real number");
		System.out.println((doubleOne + doubleTwo + doubleThree) / AVERAGE);
	}
}
