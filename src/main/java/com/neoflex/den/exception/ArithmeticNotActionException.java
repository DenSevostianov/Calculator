package com.neoflex.den.exception;

public class ArithmeticNotActionException extends AppException {

    public ArithmeticNotActionException(char action) {
        super("Действие " + action + " не допустимо!");
    }
}
