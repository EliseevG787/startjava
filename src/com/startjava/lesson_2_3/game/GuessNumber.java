package com.startjava.lesson_02_03.game;

import java.util.Scanner;

public class GuessNumber {

    private Player playerOne;
    private Player playerTwo;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void play() {
        int randomNumber = (int) (Math.random() * 101);
        System.out.println("randomNumber: " + randomNumber);
        do {
            System.out.println(playerOne.getName() + ", insert the number");
            Scanner scan = new Scanner(System.in);
            int number = scan.nextInt();
            playerOne.setNumber(number);
            if (playerOne.getNumber() < randomNumber) {
                System.out.println("The number you entered is less than the number of the computer");
            } else if (playerOne.getNumber() > randomNumber) {
                System.out.println("The number you entered is more than the number of the computer");
            } else {
                System.out.println(playerOne.getName() + ", you guessed!");
                break;
            }

            System.out.println(playerTwo.getName() + ", insert the number");
            number = scan.nextInt();
            playerTwo.setNumber(number);
            if (playerTwo.getNumber() < randomNumber) {
                System.out.println("The number you entered is less than the number of the computer");
            } else if (playerTwo.getNumber() > randomNumber) {
                System.out.println("The number you entered is more than the number of the computer");
            } else {
                System.out.println(playerTwo.getName() + ", you guessed!");
                break;
            }
        } while (true);
    }
}