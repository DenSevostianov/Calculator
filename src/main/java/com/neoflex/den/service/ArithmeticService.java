package com.neoflex.den.service;


import com.neoflex.den.exception.ArithmeticNotActionException;
import com.neoflex.den.model.ArithmeticModel;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
public class ArithmeticService {

    public ArithmeticModel getResult(Long oneNumber, Long secondNumber, char action){
        ArithmeticModel arithmeticModel = new ArithmeticModel(oneNumber, secondNumber, action);
        double result = 0 ;
        switch (action){
            case '+': result = oneNumber + secondNumber; break;
            case '-': result = oneNumber - secondNumber; break;
            case '*': result = oneNumber * secondNumber; break;
            case '/': result = oneNumber / secondNumber; break;
            default: throw new ArithmeticNotActionException(action);
        }
        arithmeticModel.setResult(result);
        return arithmeticModel;
    }

}
