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













/*public class MyFirstGame {
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
}*/