package com.startjava.lesson_4.game;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] numbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int index, int number) {
        this.numbers[index] = number;
    }

    public int getNumber(int index) {
        return numbers[index];
    }

    public void arr(int index) {
        int[] numbers1 = Arrays.copyOf(numbers, index + 1);

        for (int num : numbers1) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public void arrZeroing(int index) {
        Arrays.fill(numbers, 0, index, 0);
    }
}
