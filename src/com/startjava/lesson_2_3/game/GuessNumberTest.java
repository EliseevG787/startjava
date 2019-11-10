package com.startjava.lesson_02_03.game;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of the first player");
        String nameOne = scan.next();
        Player playerOne = new Player(nameOne);
        System.out.println("Enter the name of the second player");
        String nameTwo = scan.next();
        Player playerTwo = new Player(nameTwo);
        GuessNumber guessNumber = new GuessNumber(playerOne, playerTwo);
        String answer = "";
        do {
            guessNumber.play();
            do {
                System.out.println("Want to continue? [yes/no]: ");
                answer = scan.next();
            } while ((!answer.equals("yes")) && (!answer.equals("no")));
        } while (answer.equals("yes"));
    }
}

