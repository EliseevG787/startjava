import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            System.out.println("Введите имя первого игрока");
            String nameOne = scan.next();
            System.out.println("Введите имя второго игрока");
            String nameTwo = scan.next();
            int randomNumber = (int) (Math.random() * 100);
            
            Player playerOne = new Player(nameOne);
            Player playerTwo = new Player(nameTwo);
            GuessNumber guessNumber = new GuessNumber();
            String answer = "";

        do {
            System.out.println(playerOne.getName() + ", введите число");
            int number = scan.nextInt();
            playerOne.setNumber(number);
            System.out.println("Вы ввели число " + playerOne.getNumber());
            guessNumber.play(number, randomNumber);
            if (number == randomNumber) {
                break;
            }

            System.out.println(playerTwo.getName() + ", введите число");
            number = scan.nextInt();
            playerTwo.setNumber(number);
            System.out.println("Вы ввели число " + playerTwo.getNumber());
            guessNumber.play(number, randomNumber);
            if (number == randomNumber) {
                break;
            }

            do {
                System.out.println("Хотите продолжить? [да/нет]: ");
                answer = scan.next();
            } while ((!answer.equals("да")) && (!answer.equals("нет")));
        } while (answer.equals("да"));
    }
}