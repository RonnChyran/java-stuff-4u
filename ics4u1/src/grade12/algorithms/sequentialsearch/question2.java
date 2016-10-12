package grade12.algorithms.sequentialsearch;

import java.util.Random;

import homework.QuestionAnnotation;
import homework.ReviewResponse;
import algorithms.*;

@QuestionAnnotation(reviewNumber = 1, questionNumber = 2)
public class question2 extends ReviewResponse{

	@Override
	public void main() {
		Integer[] x = {
				6,2,8,3,1,7,4
		};
		String[] array = {
				"Hello",
				"World",
				"Foo",
				"Bar",
				"Baz"
		};
		new ShakerSort().sort(array);
		for(String i : array)
		{
			System.out.println(i);
		}
		/*Random r = new Random();
		for(int i = 0; i < x.length; i++)
		{
			x[i] = r.nextInt(11);
		}*/		
		//System.out.println(this.seqSearch(x, this.prompter.promptInt("Enter a number")));

	}
	
	public int seqSearch(Integer[] array, Integer item)
	{
		//SearchAlgorithm<Integer> s = new SequentialSearch<Integer>();
		SearchAlgorithm<Integer> s = new ClosestIntegerBinarySearch();
		return s.search(array, item);
	}

}
