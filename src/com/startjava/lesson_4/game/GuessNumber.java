package com.startjava.lesson_4.game;

import java.util.Scanner;

public class GuessNumber {

    private Scanner scan = new Scanner(System.in);
    private int attempt;
    private int randomNumber;
    private Player playerOne;
    private Player playerTwo;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void play() {
        setUp();
        do {
            if (makeMove(playerOne)) {
                break;
            }

            if (makeMove(playerTwo)) {
                break;
            }
            attempt++;
        } while (attempt < 10);

        showEnteredNumbers();
    }

    private void setUp() {
        initCondition();
        System.out.println("У вас 10 попыток");
        randomNumber = (int) (Math.random() * 101);
        System.out.println("randomNumber: " + randomNumber);
        attempt = 0;
    }

    private boolean makeMove(Player player) {
        System.out.println(player.getName() + ", введите число");
        player.setNumber(attempt, scan.nextInt());
        if (player.getNumber(attempt) < randomNumber) {
            System.out.println("Введенное вами число меньше того, что загадал компьютер");
        } else if (player.getNumber(attempt) > randomNumber) {
            System.out.println("Введенное вами число больше того, что загадал компьютер");
        } else {
            System.out.println("Игрок " + player.getName() + " угадал число " + " с " + (attempt + 1) + " попытки");
            return true;
        }
        return false;
    }

    private void showAttempts(Player player, int attempt) {
        for (int num : player.getNumbers(attempt)) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private void showEnteredNumbers() {
        if (attempt == 10) {
            System.out.println("У " + playerOne.getName() + " и " + playerTwo.getName() + " закончились попытки");
            showAttempts(playerOne, attempt);
            showAttempts(playerTwo, attempt);
        } else if (playerTwo.getNumber(attempt) == randomNumber) {
            showAttempts(playerOne, attempt + 1);
            showAttempts(playerTwo, attempt + 1);
        } else {
            showAttempts(playerOne, attempt + 1);
            showAttempts(playerTwo, attempt);
        }
    }

    private void initCondition() {
        if (attempt == 10) {
            playerOne.initNumbers(attempt);
            playerTwo.initNumbers(attempt);
        } else if (playerTwo.getNumber(attempt) == randomNumber) {
            playerOne.initNumbers(attempt + 1);
            playerTwo.initNumbers(attempt + 1);
        } else {
            playerOne.initNumbers(attempt + 1);
            playerTwo.initNumbers(attempt);
        }
    }
}

