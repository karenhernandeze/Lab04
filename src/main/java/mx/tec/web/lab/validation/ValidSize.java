package mx.tec.web.lab.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

/**
 *  Size Validator Class
 * @author  Karen Alicia Hernandez
 * @version 2.0
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD })
@Constraint(validatedBy = SizeValidator.class)
public @interface ValidSize {

	/** 
	 * Default message for validation
	 * @return default message 
	 */
	String message() default "Invalid size";

	/**
	 * Default ValidSize interface groups
	 * @return interface groups
	 */
	Class<?>[] groups() default {};

	/**
	 * Default ValidColor interface payload
	 * @return default payload
	 */
	Class<? extends Payload>[] payload() default {};
}
