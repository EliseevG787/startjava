public class Person {

    String gender = "male";
    String name = "Mike";
    float height = 1.74f;
    float weight = 65.7f;
    int age = 30;

    void move() {
        System.out.println("Человек идёт");
    }

    void sit() {
        System.out.println("Человек сидит");
    }

    void run() {
        System.out.println("Человек бежит");
    }

    void speak() {
        System.out.println("Человек говорит");
    }

    String learnJava() {
        return "Человек учит Java";
    }
}