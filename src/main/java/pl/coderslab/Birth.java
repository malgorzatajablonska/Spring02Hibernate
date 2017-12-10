package pl.coderslab;


import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = BirthValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Birth {
	String message() default "{my.custom.validation.Birth.message}";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
}