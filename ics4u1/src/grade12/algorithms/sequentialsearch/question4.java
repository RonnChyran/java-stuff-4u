package grade12.algorithms.sequentialsearch;

import homework.QuestionAnnotation;
import homework.ReviewResponse;
import algorithms.*;

@QuestionAnnotation(reviewNumber = 1, questionNumber = 4)
public class question4 extends ReviewResponse{

	@Override
	public void main() {
		int length = this.prompter.promptInt("Array Length");
		Integer[] array = new Integer[length];
		for(int i = 0; i < length; i++)
		{
			array[i] = this.prompter.promptInt("Enter");
		}
		int search;
		while((search = this.prompter.promptInt("Search")) != 0)
		{
			System.out.println(this.seqSearch(array, search));
		}
		for(int i : array)
		{
			System.out.println(i);
		}
	}
	
	public int seqSearch(Integer[] array, Integer item)
	{
		SearchAlgorithm<Integer> s = new SwappingSequentialSearch<Integer>();
		return s.search(array, item);
	}

}
