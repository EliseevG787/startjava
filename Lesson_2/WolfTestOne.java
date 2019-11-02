//Модифицированный класс WolfTest

public class WolfTestOne {

    public static void main(String[] args) {
        WolfOne wolfOne = new WolfOne();

        wolfOne.setGender("male");
        wolfOne.setNickname("Battler");
        wolfOne.setWeight(60.7f);
        wolfOne.setAge(9);
        wolfOne.setСolor("gray");

        System.out.println(wolfOne.getGender());
        System.out.println(wolfOne.getNickname());
        System.out.println(wolfOne.getWeight());
        System.out.println(wolfOne.getAge());
        System.out.println(wolfOne.getСolor());
    }
}