package com.startjava.lesson_4.game;

import java.util.Scanner;

public class GuessNumber {

    private Player playerOne;
    private Player playerTwo;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void play() {
        System.out.println("У вас 10 попыток");
        int randomNumber = (int) (Math.random() * 101);
        System.out.println("randomNumber: " + randomNumber);
        int index = 0;
        do {
            System.out.println(playerOne.getName() + ", введите число");
            Scanner scan = new Scanner(System.in);
            int number = scan.nextInt();
            playerOne.setNumber(index, number);
            if (playerOne.getNumber(index) < randomNumber) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
            } else if (playerOne.getNumber(index) > randomNumber) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
            } else {
                System.out.println("Игрок " + playerOne.getName() + " угадал число " +
                        playerOne.getNumber(index) + " с " + (index + 1) + " попытки");
                break;
            }
            if (index == 9) {
                System.out.println("У " + playerOne.getName() + " закончились попытки");
            }

            System.out.println(playerTwo.getName() + ", введите число");
            number = scan.nextInt();
            playerTwo.setNumber(index, number);
            if (playerTwo.getNumber(index) < randomNumber) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
            } else if (playerTwo.getNumber(index) > randomNumber) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
            } else {
                System.out.println("Игрок " + playerTwo.getName() + " угадал число " +
                        " с " + (index + 1) + " попытки");
                break;
            }
            if (index == 9) {
                System.out.println("У " + playerTwo.getName() + " закончились попытки");
                playerOne.arr(index);
                playerTwo.arr(index);
            }
            index++;
        } while (index < 10);

        if (index == 10) {
            playerOne.arrZeroing(index);
            playerTwo.arrZeroing(index);
        } else {
            playerOne.arrZeroing(index + 1);
            playerTwo.arrZeroing(index + 1);
        }
    }
}
