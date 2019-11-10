package com.startjava.lesson_02_03.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        String answer = "";
        do {
            System.out.println("Введите первое число");
            Scanner scan = new Scanner(System.in);
            int firstNumber = scan.nextInt();
            Calculator calculator = new Calculator();
            calculator.setFirstNumber(firstNumber);
            System.out.println("Введите знак математической операции");
            String sign = scan.next();
            calculator.setSign(sign);
            System.out.println("Введите второе число");
            int secondNumber = scan.nextInt();
            calculator.setSecondNumber(secondNumber);
            calculator.calculate();
            do {
                System.out.println("Хотите продолжить? [да/нет]: ");
                answer = scan.next();
            } while ((!answer.equals("да")) && (!answer.equals("нет")));
        } while (answer.equals("да"));
    }
}

