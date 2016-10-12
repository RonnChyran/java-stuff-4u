package grade11review.review6;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import homework.QuestionAnnotation;
import homework.ReviewResponse;

@QuestionAnnotation(reviewNumber = 6, questionNumber = 3)
public class AddNumbers extends ReviewResponse {
	@Override
	public void main() {
		// TODO Auto-generated method stub
		int sum = 0;
		try
		{
			BufferedReader r = new BufferedReader(new FileReader("numbers.txt"));
			for (String line; (line = r.readLine()) != null;)
			{
				sum += Integer.parseInt(line);
			}
		}
		catch (FileNotFoundException e){
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(sum);
	}
}
