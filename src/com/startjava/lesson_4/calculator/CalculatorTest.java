package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        String answer = "";
        do {
            System.out.println("Введите математическое выражение. Формат ввода: 2 ^ 10");
            Scanner scan = new Scanner(System.in);
            String mathExpression = scan.nextLine();
            String[] arrayMath = mathExpression.split(" ");
            int firstNumber = Integer.parseInt(arrayMath[0]);
            int secondNumber = Integer.parseInt(arrayMath[2]);
            String sign = arrayMath[1];

            Calculator calculator = new Calculator();
            calculator.setFirstNumber(firstNumber);
            calculator.setSecondNumber(secondNumber);
            calculator.setSign(sign);
            calculator.calculate();
            do {
                System.out.println("Хотите продолжить? [да/нет]: ");
                answer = scan.next();
            } while (!answer.equals("да") && !answer.equals("нет"));
        } while (answer.equals("да"));
    }
}

