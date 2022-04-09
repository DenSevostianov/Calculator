package com.neoflex.den.model;

public class ArithmeticModel {

    double oneNumber;
    double secondNumber;
    char action;
    double result;

    public ArithmeticModel(double oneNumber, double secondNumber, char action) {
        this.oneNumber = oneNumber;
        this.secondNumber = secondNumber;
        this.action = action;
    }

    public double getOneNumber() {
        return oneNumber;
    }

    public void setOneNumber(double oneNumber) {
        this.oneNumber = oneNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public char getAction() {
        return action;
    }

    public void setAction(char action) {
        this.action = action;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
