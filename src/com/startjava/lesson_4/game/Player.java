package com.startjava.lesson_4.game;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] numbers = new int[10];

    public Player(String name) {
        initNumbers(numbers.length);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int index, int number) {
        numbers[index] = number;
    }

    public int getNumber(int index) {
        return numbers[index];
    }

    public int[] getNumbers(int index) {
        return Arrays.copyOf(numbers, index);
    }

    public void initNumbers(int index) {
        Arrays.fill(numbers, 0, index, -1);
    }
}
