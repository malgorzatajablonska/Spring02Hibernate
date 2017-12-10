package pl.coderslab;

import java.time.LocalDate;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class BirthValidator implements ConstraintValidator<Birth, Integer> {

	@Override
	public void initialize(Birth constraintAnnotation) {
	}
	
	@Override
	public boolean isValid(Integer value, ConstraintValidatorContext context) {
		LocalDate date = LocalDate.now();
		int toCheck = date.getYear();
		return ((toCheck - value)>18);
	}
}