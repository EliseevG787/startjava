package com.startjava.lesson_02_03.calculator;

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
                System.out.println(firstNumber + secondNumber);
                break;
            case "-":
                System.out.println(firstNumber - secondNumber);
                break;
            case "*":
                System.out.println(firstNumber * secondNumber);
                break;
            case "/":
                System.out.println(firstNumber / secondNumber);
                break;
            case "^": {
                int result = 1;
                for (int i = 1; i <= secondNumber; i++) {
                    result *= firstNumber;
                }
                System.out.println(result);
                }
                break;
            case "%":
                System.out.println(firstNumber % secondNumber);
                break;
        }
    }
}
