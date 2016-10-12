package grade11review.review6;

import java.io.*;

import homework.QuestionAnnotation;
import homework.ReviewResponse;

@QuestionAnnotation(reviewNumber = 6, questionNumber = 2)
public class TwoPowerTable extends ReviewResponse {

	@Override
	public void main() {
		try {
			BufferedWriter br = new BufferedWriter(new FileWriter("power.html"));
			br.append("<!doctype html>");
			br.append("<html>");
			br.append("<head>");
			br.append("<title>Powers of Two</title>");
			br.append("</head>");
			br.append("<body>");
			br.append("<table style='padding: 5px;'>");
			br.append("<tr>");
			br.append("<th>");
			br.append("Power of 2");
			br.append("</th>");
			br.append("<th>");
			br.append("Value");
			br.append("</th>");
			br.append("</tr>");
			for(int i = 0; i < 11; i++)
			{
				br.append(getHtmlExpRow(i));
			}
			br.append("</table>");
			br.append("</html>");
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private static String getHtmlExpRow(int number)
	{
		return String.format("<tr><td>%1$d</td><td>%2$d</td></tr>", number, (int)Math.pow(2, number));
	}

}
