package grade11review.review8;

import homework.QuestionAnnotation;
import homework.ReviewResponse;

import java.io.*;
@QuestionAnnotation(reviewNumber = 8, questionNumber = 2)
public class ExceptionsQuestion2 extends ReviewResponse {
	
	@Override
	public void main()
	{
		try {
			BufferedReader r = new BufferedReader(new FileReader("input.txt"));
			String line = r.readLine();
			int sum = 0;
			System.out.println(line);
			while((line = r.readLine()) != null)
			{
				try {
					sum += Integer.parseInt(line);
				}catch(NumberFormatException e){
					System.out.println(sum);
					System.out.println(line);
					sum = 0;
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
