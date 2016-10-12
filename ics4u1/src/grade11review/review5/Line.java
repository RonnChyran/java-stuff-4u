package grade11review.review5;

public final class Line {
	
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	
	public Line(int x1, int y1, int x2, int y2)
	{
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	public double length(){
		double y = Math.pow(this.y2 - this.y1, 2);
		double x = Math.pow(this.x2 - this.x1, 2);
		return Math.sqrt(y + x);
	}
	
	public double slope() {
		double y = this.y2 - this.y1;
		double x = this.x2 - this.x1;
		return y / x;
	}
	
	public static boolean isPerpendicular(Line a, Line b)
	{
		return a.slope() * b.slope() == -1;
	}
	
	public static boolean isSameLength(Line a, Line b)
	{
		return a.length() == b.length();
	}
	
	public static boolean isParallel(Line a, Line b)
	{
		return a.slope() == b.slope();
	}
}
