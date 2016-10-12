package grade11review.review2;

import homework.QuestionAnnotation;
import homework.ReviewResponse;

@QuestionAnnotation(reviewNumber = 2, questionNumber = 4)
public class Pythagorean extends ReviewResponse {
	@Override
	public void main() {
		int maxC = this.prompter.promptInt("Enter a positive integer");
		for(int c = 1; c <= maxC; c++) 
		{
			for (int b = 1; b < c; b++)
			{
				for (int a = 1; a < b; a++)
				{
					if (a*a + b*b == c*c)
					{
						// \u00B2 is the unicode literal for superscript 2
						System.out.println(a + "\u00B2 + " + b + "\u00B2 = " + c + "\u00B2");
					}
				} 			
			}
		}
	}
}
