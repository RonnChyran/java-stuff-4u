package grade11review;

import java.lang.annotation.*;

/**
 * Marks a ReviewQuestion with the review and question number
 * @see ReviewResponse
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface QuestionAnnotation {
	
	/**
	 * The review this answer belongs to.
	 * @return The review number
	 */
	int reviewNumber() default 0;
	/**
	 * The question this response answers.
	 * @return The question number
	 */
	int questionNumber() default 0;
}
