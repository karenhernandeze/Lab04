package mx.tec.web.lab.validation;

import java.util.Arrays;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Color Validator Class
 * @author  Karen Alicia Hernandez
 * @version 1.0
 */
public class ColorValidator implements ConstraintValidator<ValidColor, String>{
	private final List<String> validColors = Arrays.asList("Black", "Gray", "Light Denim", "Dark Denim", "Light Blue", "Dark Blue");

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		return validColors.contains(value);
	}

}
