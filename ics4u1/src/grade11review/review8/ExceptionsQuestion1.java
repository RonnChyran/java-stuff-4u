package grade11review.review8;

import java.util.InputMismatchException;

import homework.QuestionAnnotation;
import homework.ReviewResponse;

@QuestionAnnotation(reviewNumber = 8, questionNumber = 1)
public class ExceptionsQuestion1 extends ReviewResponse {

	@Override
	public void main() {
		// TODO Auto-generated method stub
		boolean quit = false;
		while (!quit) {
			String currentLine = null;
			try {
				currentLine = this.prompter.promptLine("Enter the numerator");
				double num = Double.parseDouble(currentLine);
				currentLine = this.prompter.promptLine("Enter the divisor");
				double div = Double.parseDouble(currentLine);
				double answer = num / div;
				System.out.println(Double.isNaN(answer) ? num + "/" + div
						+ " is" + answer : "You can't divide by zero.");
			} catch (NumberFormatException e) {
				if (!currentLine.equalsIgnoreCase("quit")) {
					System.out.println("You have entered bad data.");
				} else {
					quit = true;
				}
			}
		}
	}

}
