package com.startjava.lesson_4.game;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя первого игрока");
        String nameOne = scan.next();
        Player playerOne = new Player(nameOne);
        System.out.println("Введите имя второго игрока");
        String nameTwo = scan.next();
        Player playerTwo = new Player(nameTwo);
        GuessNumber guessNumber = new GuessNumber(playerOne, playerTwo);
        String answer = "";
        do {
            guessNumber.play();
            do {
                System.out.println("Хотите продолжить? [да/нет]: ");
                answer = scan.next();
            } while ((!answer.equals("да")) && (!answer.equals("нет")));
        } while (answer.equals("да"));
    }
}

