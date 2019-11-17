package com.startjava.lesson_4.game;

import java.util.Scanner;

public class GuessNumber {

    int index;
    int number;
    int randomNumber;
    private Player playerOne;
    private Player playerTwo;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void play() {
        generateRandomNumber();
        do {
            numberInput(playerOne);
            if (compareOfNumbers(playerOne)) {
                break;
            }

            numberInput(playerTwo);
            if (compareOfNumbers(playerTwo)) {
                break;
            }
            index++;
        } while (index < 10);

        if (index == 10) {
            numberOutput(playerOne);
            numberOutput(playerTwo);
        }

        setInitialValues();
    }

    public void generateRandomNumber() {
        System.out.println("У вас 10 попыток");
        randomNumber = (int) (Math.random() * 101);
        System.out.println("randomNumber: " + randomNumber);
        index = 0;
    }

    public void numberInput(Player player) {
        System.out.println(player.getName() + ", введите число");
        Scanner scan = new Scanner(System.in);
        number = scan.nextInt();
        player.setNumber(index, number);
    }

    public boolean compareOfNumbers(Player player) {
        if (player.getNumber(index) < randomNumber) {
            System.out.println("Введенное вами число меньше того, что загадал компьютер");
        } else if (player.getNumber(index) > randomNumber) {
            System.out.println("Введенное вами число больше того, что загадал компьютер");
        } else {
            System.out.println("Игрок " + player.getName() + " угадал число " + " с " + (index + 1) + " попытки");
            return true;
        }
        if (index == 9) {
            System.out.println("У " + player.getName() + " закончились попытки");
        }
        return false;
    }

    public void numberOutput(Player player) {
        for (int num : player.getNumbers(index)) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public void setInitialValues() {
        if (index == 10) {
            playerOne.setInitialValues(index);
            playerTwo.setInitialValues(index);
        } else if (playerTwo.getNumber(index) == randomNumber) {
            playerOne.setInitialValues(index + 1);
            playerTwo.setInitialValues(index + 1);
        } else {
            playerOne.setInitialValues(index + 1);
            playerTwo.setInitialValues(index);
        }
    }
}

