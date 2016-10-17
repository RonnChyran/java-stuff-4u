package grade12.recursion;

import homework.QuestionAnnotation;
import homework.ReviewResponse;

@QuestionAnnotation(reviewNumber = 2, questionNumber = 1)
public class RecursiveExponent extends ReviewResponse {
	
	@Override
	public void main()
	{
		System.out.println(countMoves(8));
	//	System.out.println(isPrime(4));
		int[] x = new int[] {4, 23, 4, 5,1, 23};
		System.out.print(largest(x, x.length - 1));
	}

	public int countMoves(long size)
	{
		if(size <= 1) return 1; 
		return 2 * countMoves(size - 1) + 1 ;
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

	public int largest(int[] array, int sub)
	{
		if(sub == 0) return array[0];
		if(array[sub] > largest(array, sub-1))
			return array[sub];
		return largest(array, sub-1);
	}

	
	
}
