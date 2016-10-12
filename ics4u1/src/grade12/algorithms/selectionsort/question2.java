package grade12.algorithms.selectionsort;

import homework.QuestionAnnotation;
import homework.ReviewResponse;
import algorithms.*;

@QuestionAnnotation(reviewNumber = 4, questionNumber = 2)
public class question2 extends ReviewResponse{

	@Override
	public void main() {
		String[] array = {
				"Hello",
				"World",
				"Foo",
				"Bar",
				"Baz"
		};
		
		System.out.println(seqSearch(array, "Foo"));
		System.out.println(seqSearch(array, "sad"));

	}
	
	public int seqSearch(String[] array, String item)
	{
		SearchAlgorithm<String> s = new SequentialSearch<String>();
		return s.search(array, item);
	}

}
