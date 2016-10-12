package grade11review.review2;

import homework.QuestionAnnotation;
import homework.ReviewResponse;

@QuestionAnnotation(reviewNumber = 2, questionNumber = 1)
public class SortThreeLetters extends ReviewResponse {

	private static final int LETTER_COUNT = 15;
	@Override
	public void main() {
		char[] unsortedCharacters = new char[LETTER_COUNT];
		for(int i = 0; i < LETTER_COUNT; i++) {
			char c = this.prompter.promptChar("Please enter a character");
			if(!Character.isLowerCase(c)) {
				System.out.println("Please enter a lowercase character");
				i--;
				continue;
			}
			unsortedCharacters[i] = c;
		}
		
		this.quicksort(unsortedCharacters);
		
		for(char c : unsortedCharacters) {
			System.out.print(c);
		}
	}
	
	private void swap(char[] array, int indexA, int indexB) {
		char temp = array[indexA];
		array[indexA] = array[indexB];
		array[indexB] = temp;
	}
	
	private int partition(char[] array, int left, int right){
		int pivot = array[(left + right) / 2];
		int i = left;
		int j = right;
		
		while(i <= j)
		{
			while (array[i] < pivot) {
				i++;
			}
			while (array[j] > pivot) {
				j--;
			}
			
			if (i <= j) {
	            this.swap(array, i, j);
	            i++;
	            j--;
			}	
		}
		return i;
	}
	
	private void quicksort(char[] array, int left, int right){
		int index;
		if(array.length <= 1) return;
		index = partition(array, left, right);
		if(left < index - 1) {
			this.quicksort(array, left, index - 1);
		}
		
		if(index < right) {
			this.quicksort(array, index, right);
		}
	}
	
	private void quicksort(char[] array) {
		this.quicksort(array, 0, array.length - 1);
	}
}
