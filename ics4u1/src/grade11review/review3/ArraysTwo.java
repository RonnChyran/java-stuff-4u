package grade11review.review3;

import homework.QuestionAnnotation;
import homework.ReviewResponse;

@QuestionAnnotation(reviewNumber = 3, questionNumber = 2)
public class ArraysTwo extends ReviewResponse {

	private static final int ARRAY_SIZE = 14;
	@Override
	public void main() {
		int[] array = new int[ARRAY_SIZE];
		for(int i = 0; i < ARRAY_SIZE; i++)
		{
			array[i] = this.prompter.promptInt("Enter an integer");
		}
		this.reverse(array);
		for(int i: array)
		{
			System.out.println(i);
		}
	}
	
	private void reverse(int[] array)
	{
		for(int i = 0; i < array.length / 2; i++)
		{
			int correspondingIndex = array.length - i - 1;
			this.swap(array, correspondingIndex, i);
		}
	}
	
	private void swap(int[] array, int indexA, int indexB) {
		int temp = array[indexA];
		array[indexA] = array[indexB];
		array[indexB] = temp;
	}
}
