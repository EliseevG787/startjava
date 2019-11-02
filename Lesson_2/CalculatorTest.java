import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        String answer = "";
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите первое число");
            int firstNumber = scan.nextInt();
            System.out.println("Введите знак математической операции");
            String sign = scan.next();
            System.out.println("Введите второе число");
            int secondNumber = scan.nextInt();

            Calculator calculator = new Calculator();
            calculator.setFirstNumber(firstNumber);
            calculator.setSecondNumber(secondNumber);
            calculator.setSign(sign);
            calculator.calc();
            
            do {
                System.out.println("Хотите продолжить? [да/нет]: ");
                answer = scan.next();
            } while ((!answer.equals("да")) && (!answer.equals("нет")));
        } while (answer.equals("да"));
    }
}

