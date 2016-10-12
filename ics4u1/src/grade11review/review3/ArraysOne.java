package grade11review.review3;

import homework.QuestionAnnotation;
import homework.ReviewResponse;

import java.util.Arrays;

@QuestionAnnotation(reviewNumber = 3, questionNumber = 1)
public class ArraysOne extends ReviewResponse {
	@Override
	public void main() {
		int[] array;
		int arraySize = this.prompter.promptInt("Please enter the size of the array");
		
		array = new int[arraySize];
		Arrays.fill(array, 1);
		
		for(int i = 0; i < arraySize; i++){
			array[i] = this.prompter.promptInt("Please enter an integer");
		}
		
		this.swap(array, 0, array.length - 1);
		
		for(int i = 0; i < arraySize; i++){
			this.abs(array, i);
		}
		
		int sampleSum = this.sumArray(array);
		
		for(int i : array)
		{
			if(i % 2 == 0)
			{
				System.out.println(i);
			}
		}
	}
	
	private void swap(int[] array, int indexA, int indexB) {
		int temp = array[indexA];
		array[indexA] = array[indexB];
		array[indexB] = temp;
	}
	
	private void abs(int[] array, int index)
	{
		int temp = array[index];
		if(temp < 0) array[index] = -1 * temp;
	}
	
	private int sumArray(int[] array)
	{
		int arraySum = 0;
		for(int i : array)
		{
			arraySum += i;
		}
		return arraySum;
	}
	
}
