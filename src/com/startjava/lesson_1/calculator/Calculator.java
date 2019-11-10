package com.startjava.lesson_1.calculator;

public class Calculator {
    public static void main(String[] args) {
        int a = 4;
        int b = 7;
        char sign = '^';

        if (sign == '+') {
            System.out.println(a + b);
        } else if (sign == '-') {
            System.out.println(a - b);
        } else if (sign == '*') {
            System.out.println(a * b);
        } else if (sign == '/') {
            System.out.println(a / b);
        } else if (sign == '^') {
            int result = 1;
            for (int i = 1; i <= b; i++) {
                result *= a;
            }
            System.out.println(result);
        } else if (sign == '%') {
            System.out.println(a % b);
        }
    }
}

