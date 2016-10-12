package grade11review.review3;

import homework.QuestionAnnotation;
import homework.ReviewResponse;

@QuestionAnnotation(reviewNumber = 3, questionNumber = 3)
public class ArraysThree extends ReviewResponse {

	@Override
	public void main() {
		int[][] data = {{3, 2, 5},
				{1, 4, 4, 8, 13}, 
				{9, 1, 0, 2},
				{0, 2, 6, 4, -1, -8}};
		
		int sum = 0;
		
		for(int[] _i: data)
		for(int i : _i)
		{
			sum += i;
		}
		
		System.out.println(sum);
	}

}
