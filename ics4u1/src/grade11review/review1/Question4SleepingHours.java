package grade11review.review1;

import homework.QuestionAnnotation;
import homework.ReviewResponse;

@QuestionAnnotation(reviewNumber = 1, questionNumber = 4)
public class Question4SleepingHours extends ReviewResponse {
	
	@Override
	public void main() {
		int bYear, bMonth, bDay; //birth date
		int cYear, cMonth, cDay; //current date;
		
		System.out.println("Enter your birth date:");
		
		bYear = this.prompter.promptInt("Year");
		bMonth = this.prompter.promptInt("Month");
		bDay = this.prompter.promptInt("Day");
		
		int pastDays = (bYear * 365) + (bMonth * 30) + bDay;
		System.out.println("Enter today's date:");
		cYear = this.prompter.promptInt("Year");
		cMonth = this.prompter.promptInt("Month");
		cDay = this.prompter.promptInt("Day");
		int currentDays = (cYear * 365) + (cMonth * 30) + cDay;
		int aliveDays = currentDays - pastDays;
		System.out.println("You have been alive for " + aliveDays + " days.");
		System.out.println("You have slept " + aliveDays * 8 + " hours.");
	}	
}
