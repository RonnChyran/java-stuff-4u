package grade11review.review3;

import homework.QuestionAnnotation;
import homework.ReviewResponse;

@QuestionAnnotation(reviewNumber = 3, questionNumber = 1)
public class ArraysFour extends ReviewResponse {
	@Override
	public void main() {
		int noStudents, noTests;
		int[][] scores;
		double[] averages;

		noStudents = this.prompter.promptInt("How many students will there be");
		noTests = this.prompter.promptInt("How many tests will there be");

		scores = new int[noStudents][noTests];

		for (int student = 0; student < scores.length; student++) {
			for (int test = 0; test < scores[student].length; test++) {
				scores[student][test] = this.prompter
						.promptInt("Input the score for student "
								+ (student + 1) + ", test " + (test + 1) + ": ");

			}
		}

		averages = getAverages(scores);
		for (int student = 0; student < scores.length; student++)
			System.out.println("The average for student " + (student + 1)
					+ " is " + averages[student] + "%");

		final int highestAverageStudent = getHighestAverageIndex(averages);
		final double highestAverage = averages[highestAverageStudent];

		System.out.println("Student " + (highestAverageStudent + 1)
				+ " has the highest average of " + highestAverage + "%");

		for (int test = 0; test < scores[0].length; test++)
			System.out.println("The class average for test " + (test + 1)
					+ " is " + getClassAverageForTest(scores, test) + "%");

		final double classAverage = getTotalClassAverage(scores);
		for (int student = 0; student < averages.length; student++) {
			if (averages[student] > classAverage)
				System.out.println("Student " + (student + 1)
						+ " scored above the class average.");
		}
	}

	public static double[] getAverages(final int[][] scores) {
		final double[] averages = new double[scores.length];
		for (int student = 0; student < scores.length; student++) {
			double totalScore = 0;
			for (int test = 0; test < scores[student].length; test++)
				totalScore += scores[student][test];
			averages[student] = (totalScore / scores[student].length);
		}
		return averages;
	}

	public static int getHighestAverageIndex(final double[] averages) {
		int highestAverageIndex = 0;
		final double highestAverage = averages[0];
		for (int student = 0; student < averages.length; student++) {
			if (highestAverage < averages[student]) {
				highestAverageIndex = student;
			}
		}
		return highestAverageIndex;

	}

	public static double getClassAverageForTest(final int[][] scores,
			final int test) {
		double total = 0;
		for (int student = 0; student < scores.length; student++)
			total += scores[student][test];
		return (total / scores.length);
	}

	public static double getTotalClassAverage(final int[][] scores) {
		double total = 0;
		for (int test = 0; test < scores[0].length; test++)
			total += getClassAverageForTest(scores, test);
		return total / scores[0].length;
	}
}
