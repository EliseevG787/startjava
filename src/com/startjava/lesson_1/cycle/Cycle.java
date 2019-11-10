package com.startjava.lesson_1.cycle;

public class Cycle {
    public static void main(String[] args) {
        // Выведите на консоль с помощью цикла for все числа от [0, 20]
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        }

        // Выведите на консоль с помощью цикла while все числа
        // от [6, -6] (шаг итерации равен 2)
        int i = 6;
        while (i >= -6) {
            System.out.println(i);
            i -= 2;
        }

        // Выведите на консоль с помощью цикла do-while
        //  сумму всех нечетных чисел от [10, 20]
        int counter = 10;
        int sumOdd = 0;
        do {
            if ((counter % 2) != 0) {
                sumOdd += counter;
            }
            counter++;
        } while (counter <= 20);
        System.out.println(sumOdd);
    }
}
