package grade11review.review3;

import homework.QuestionAnnotation;
import homework.ReviewResponse;

/**
 * Asks the user for an integer to search for in the array.
 * If it exists, prints the index in which the integer exists. 
 * Otherwise, prints "integer not found"
 * @author Ronny Chan
 *
 */
@QuestionAnnotation(reviewNumber = 0, questionNumber = 1)
public class ArraysSearch extends ReviewResponse {
	
	private final static int MAX = 12;
	
	@Override
	public void main() {
		int[] array = new int[MAX];
		int search = this.prompter.promptInt("Enter an integer");
		int index = this.indexOf(array, search);
		System.out.println(index == -1 ? "integer not found" : index);
	}
	
	/**
	 * Returns the index of a certain integer value in the array.
	 * If the value does not exists, returns -1
	 * @param array The array to search through
	 * @param value The value to search
	 * @return The index of value in the array.
	 */
	private int indexOf(int[] array, int value) {
		for (int i = 0; i < array.length; i++){
			if (array[i] == value) return i;
		}
		return -1;
	}
}
