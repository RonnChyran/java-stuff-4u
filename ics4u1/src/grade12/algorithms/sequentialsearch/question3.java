package grade12.algorithms.sequentialsearch;

import homework.QuestionAnnotation;
import homework.ReviewResponse;
import algorithms.*;

@QuestionAnnotation(reviewNumber = 1, questionNumber = 3)
public class question3 extends ReviewResponse{

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
		SearchAlgorithm<String> s = new ReverseSequentialSearch<String>();
		return s.search(array, item);
	}

}
