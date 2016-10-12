package grade11review.review1;

import java.text.*;

import homework.QuestionAnnotation;
import homework.ReviewResponse;

@QuestionAnnotation(reviewNumber = 1, questionNumber = 5)
public class Question5FastFoodRestaurant extends ReviewResponse {
	private static final double TAX_RATE = 0.13;
	private static final double PRICE_BURGER = 1.69;
	private static final double PRICE_FRIES = 1.09;
	private static final double PRICE_SODA = 0.99;
	
	@Override
	public void main() {
		final DecimalFormat formatter = new DecimalFormat("#.00");
		int burgerCount = this.prompter.promptInt("How many burgers");
		int friesCount = this.prompter.promptInt("How many fries");
		int sodaCount = this.prompter.promptInt("How many sodas");
		
		double subTotal = burgerCount * PRICE_BURGER +
						  friesCount * PRICE_FRIES + 
						  sodaCount * PRICE_SODA;
		double taxRate = subTotal * TAX_RATE;
		double total = subTotal + taxRate;
		System.out.println("Sub Total: " + formatter.format(subTotal));
		System.out.println("13% HST: " + formatter.format(taxRate));
		System.out.println("Total: " + formatter.format(total));
		double amountTendered = this.prompter.promptDouble("Amount tendered");
		double change = amountTendered - total;
		System.out.println("Your change is: " + formatter.format(change));
	}
}
