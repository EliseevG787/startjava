public class WolfTest {

    public static void main(String[] args){
        Wolf wolf = new Wolf();
        wolf.gender = "male";
        wolf.nickname = "Battler";
        wolf.weight = 60.7f;
        wolf.age = 5;
        wolf.color = "gray";

        System.out.println(wolf.gender);
        System.out.println(wolf.nickname);
        System.out.println(wolf.weight);
        System.out.println(wolf.age);
        System.out.println(wolf.color);
        
        wolf.move();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}

    