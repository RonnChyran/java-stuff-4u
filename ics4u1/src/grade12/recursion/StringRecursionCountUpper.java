package grade12.recursion;

import homework.QuestionAnnotation;
import homework.ReviewResponse;

import java.io.*;
@QuestionAnnotation(reviewNumber = 3, questionNumber = 1)
public class StringRecursionCountUpper extends ReviewResponse {

	@Override
	public void main() {
		System.out.println(this.countUpper("TEsTS CaSeE"));
		System.out.println(this.reverse("Test"));
		System.out.println(this.length("123456"));
		System.out.println(this.equalsIgnoreCase("Equal", "Equal"));
		System.out.println(this.equalsIgnoreCase("Not", "Equal"));
		System.out.println(this.countChar("XaaaYaaaZaaaYaaaaY", 'Y'));
		System.out.println(this.equalsIgnoreVowel("kaangaro","kngr"));
	}
	
	/*
	 * def count_upper(line):
		if len(line) == 0:
			return 0
		if line[0].isupper():
			return count_upper(line[1:]) + 1
		return count_upper(line[1:])
		print(count_upper("Hello WoSrld"))
	 */
	private int countUpper(String line) {
		if(line.length() == 0)
			return 0;
		if(Character.isUpperCase(line.charAt(0))) 
			return countUpper(line.substring(1)) + 1;
		return countUpper(line.substring(1));
	}
	
	private String reverse(String line) {
		if(line.length() == 0) return "";
		return reverse(line.substring(1)) + line.charAt(0);
	}
	
	private int length(String line){
		if(line.isEmpty()) return 0;
		return length(line.substring(1)) + 1;
	}
	
	private boolean equalsIgnoreCase(String s1, String s2)
	{
		if(s1.isEmpty() && s2.isEmpty()) return true;
		return (Character.toUpperCase(s1.charAt(0))
				== Character.toUpperCase(s2.charAt(0))) &&
		equalsIgnoreCase(s1.substring(1), s2.substring(1));
	}
	
	
	private int countChar(String s, char c)
	{
		return s.length() == 0 ? 0 
				: s.charAt(0) == c ? countChar(s.substring(1), c) + 1 :
					countChar(s.substring(1), c);
	}
	
	private boolean equalsIgnoreVowel(String s1, String s2)
	{
		if(s1.isEmpty() && s2.isEmpty()) return true;
		if(isVowel(s1.charAt(0))) return equalsIgnoreVowel(s1.substring(1), s2);
		if(isVowel(s2.charAt(0))) return equalsIgnoreVowel(s1, s2.substring(1));
		return (s1.charAt(0) == s2.charAt(0)) 
			&& equalsIgnoreCase(s1.substring(1), s2.substring(1));

	}
	
	private boolean isVowel(char c)
	{
		return "aeiou".indexOf(c) < 0;
	}
}
