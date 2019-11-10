package com.startjava.lesson_02_03.game;

public class Player {

    private String name;
    private int number;

    public Player(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }
}