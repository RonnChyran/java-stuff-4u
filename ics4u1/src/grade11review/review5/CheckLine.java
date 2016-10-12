package grade11review.review5;

import homework.*;

@QuestionAnnotation(reviewNumber = 5, questionNumber = 1)
public class CheckLine extends ReviewResponse {

	@Override
	public void main() {
		// TODO Auto-generated method stub
		
		System.out.println("Line 1");
		int l1x1 = this.prompter.promptInt("Vertex 1 x-value");
		int l1y1 = this.prompter.promptInt("Vertex 1 y-value");

		
		int l1x2 = this.prompter.promptInt("Vertex 2 x-value");
		int l1y2 = this.prompter.promptInt("Vertex 2 y-value");
		
		System.out.println("Line 2");

		int l2x1 = this.prompter.promptInt("Vertex 1 x-value");
		int l2y1 = this.prompter.promptInt("Vertex 1 y-value");
		int l2x2 = this.prompter.promptInt("Vertex 2 x-value");
		int l2y2 = this.prompter.promptInt("Vertex 2 y-value");
		Line l1 = new Line(l1x1, l1y1, l1x2, l1y1);
		Line l2 = new Line(l2x1, l2y1, l2x2, l2y1);

		
		System.out.println("The lines are" + 
				(Line.isPerpendicular(l1, l2) ? " " : " not ") +
				"perpendicular.");
		System.out.println("The lines are" + 
				(Line.isParallel(l1, l2) ? " " : " not ") +
				"parallel.");
		System.out.println("The lines are" + 
				(Line.isSameLength(l1, l2) ? " " : " not ") +
				"the same length.");	
	}
}
