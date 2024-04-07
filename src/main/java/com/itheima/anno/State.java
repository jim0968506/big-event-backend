package com.itheima.anno;

import com.itheima.validation.StateValidation;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import jakarta.validation.constraints.NotEmpty;

import java.lang.annotation.Documented;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.TYPE_USE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Target({FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = {StateValidation.class})

public @interface State {


//    較驗失敗提示的信息
    String message() default "state參數的值只能是已發布或者草稿";

//    指定分組
    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
