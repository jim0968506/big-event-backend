package com.itheima.validation;

import com.itheima.anno.State;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class StateValidation implements ConstraintValidator<State,String> {
    /**
     *
     * @param value 將來要較驗的數據
     * @param context context in which the constraint is evaluated
     *
     * @return 如果返回false族較驗不通過 如果返回true則較驗通過
     */
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
//        提供較驗規則
        if(value == null){
            return false;
        }
        if(value.equals("已發布") || value.equals("草稿")){
            return true;
        }
        return false;
    }
}
