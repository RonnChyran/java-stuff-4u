package grade12.algorithms.sequentialsearch;

import homework.QuestionAnnotation;
import homework.ReviewResponse;
import algorithms.*;

@QuestionAnnotation(reviewNumber = 1, questionNumber = 1)
public class question1 extends ReviewResponse{

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
