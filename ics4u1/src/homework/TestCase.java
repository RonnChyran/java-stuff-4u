package homework;

import java.lang.annotation.*;

/**
 * Marks a ReviewQuestion with the review and question number
 * @see ReviewResponse
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface TestCase {
	
	/**
	 * The review this answer belongs to.
	 * @return The review number
	 */
	String caseName() default "";
	/**
	 * The question this response answers.
	 * @return The question number
	 */
	int questionNumber() default 0;
}
