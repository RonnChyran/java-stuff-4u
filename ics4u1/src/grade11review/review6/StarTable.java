package grade11review.review6;

import java.io.*;
import java.util.Arrays;

import homework.QuestionAnnotation;
import homework.ReviewResponse;

@QuestionAnnotation(reviewNumber = 6, questionNumber = 1)
public class StarTable extends ReviewResponse {

	@Override
	public void main() {
		int length, width;		
		char[][] starTable;
		
		length = this.prompter.promptInt("Please enter the length of the table");
		width = this.prompter.promptInt("Please enter the width of the table");
		
		starTable = new char[length][width];
		
		Arrays.fill(starTable[0], '*');
		Arrays.fill(starTable, starTable[0]);
		writeFile(starTable);
	}
	
	private static void writeFile(char[][] table)
	{
		try {
			BufferedWriter w = new BufferedWriter(new FileWriter("star.txt"));
			
			for(char[] _c : table)
			{
				for (char c : _c)
				{
					w.append(c);
				}
				w.newLine();
			}
			w.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
