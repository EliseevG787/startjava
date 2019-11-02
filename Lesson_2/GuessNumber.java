public class GuessNumber {

    public void play(int number, int randomNumber) {
        if (number < randomNumber) {
            System.out.println("Ведённое вами число меньше загаданного компьютером");
        } else if (number > randomNumber) {
            System.out.println("Ведённое вами число больше загаданного компьютером");
        } else {
            System.out.println("Вы угадали!");
        }
    }
}
    
