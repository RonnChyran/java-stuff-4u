package grade12.recursion;

import homework.QuestionAnnotation;
import homework.ReviewResponse;

import java.io.*;
@QuestionAnnotation(reviewNumber = 2, questionNumber = 1)
public class RecursiveExponent extends ReviewResponse {
	
	@Override
	public void main()
	{
		System.out.println(recursiveExponent(10, -3));
		System.out.println(isPrime(4));
	}
	
	public double recursiveExponent(double x, int n)
	{
		if(n > 0) return recursiveExponent(x, n-1) * x;
		if(n < 0) return recursiveExponent(x, n+1) / x;
		return 1;
	}

	public boolean isPrime(int n)
	{
		return this.isPrime(n, n-1);
	}
	public boolean isPrime(int n, int m)
	{		
		if(m == 1) return true;
		if(n % m == 0) return false;
		return isPrime(n, m-1);
	}
}
