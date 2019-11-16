package com.startjava.lesson_4.calculator;

public class Calculator {

    private int firstNumber;
    private int secondNumber;
    private String sign;

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public void calculate() {

        switch (sign) {
            case "+":
                System.out.println(Math.addExact(firstNumber, secondNumber));
                break;
            case "-":
                System.out.println(Math.subtractExact(firstNumber, secondNumber));
                break;
            case "*":
                System.out.println(Math.multiplyExact(firstNumber, secondNumber));
                break;
            case "/":
                System.out.println(Math.floorDiv(firstNumber, secondNumber));
                break;
            case "^":
                System.out.println(Math.pow(firstNumber, secondNumber));
                break;
            case "%":
                System.out.println(Math.floorMod(firstNumber, secondNumber));
                break;
        }
    }
}
