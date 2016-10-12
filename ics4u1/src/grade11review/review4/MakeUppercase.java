package grade11review.review4;

import homework.QuestionAnnotation;
import homework.ReviewResponse;

@QuestionAnnotation(reviewNumber = 4, questionNumber = 1)
public class MakeUppercase extends ReviewResponse {

	@Override
	public void main() {
		String toUpper = this.prompter.promptLine("Enter a string");
		System.out.println(toUpper.toUpperCase());
	}
	
}
