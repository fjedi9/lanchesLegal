package com.vepilef.lanchesLegal.core.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.vepilef.lanchesLegal.core.validator.CpfValidator;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Constraint(validatedBy = CpfValidator.class)
@Documented
@Target( FIELD )
@Retention(RUNTIME)
public @interface Cpf {
    String message() default "CPF inválido";
    Class<?>[] groups() default { };
    Class<? extends Payload>[] payload() default { };
}
