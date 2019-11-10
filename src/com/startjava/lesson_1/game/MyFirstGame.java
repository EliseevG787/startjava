package com.startjava.lesson_1.game;

public class MyFirstGame {
    public static void main(String[] args) {
        int randomNumber = 50;
        int playerNumber = 1;

        do {
            if (playerNumber < randomNumber) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
                playerNumber++;
            } else if (playerNumber > randomNumber) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
                playerNumber--;
            }
        } while (playerNumber != randomNumber);
        System.out.println("Вы угадали!");
    }
}