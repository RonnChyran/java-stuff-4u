package grade11review.review1;

import grade11review.QuestionAnnotation;
import grade11review.ReviewResponse;

@QuestionAnnotation(reviewNumber = 1, questionNumber = 6)
public class Question6DigitSum extends ReviewResponse {
	@Override
	public void main() {
		int number = this.prompter.promptInt("Enter a 3 digit number: ");
		System.out.println("The digit sum of the number " 
				+ number + " is " + this.getDigitSum(number));
	}
	
	private int getDigitSum(int number){
		String numberString = Integer.toString(number);
		int digitSum = 0;
		for(char c : numberString.toCharArray()){
			digitSum += Character.getNumericValue(c);
		}
		return digitSum;
	}
}
