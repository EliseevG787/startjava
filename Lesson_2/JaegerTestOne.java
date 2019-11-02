//для инициализации полей объектов при их создании используется конструктор

public class JaegerTestOne {

    public static void main(String[] args) {

    JaegerOne jaegerOne = new JaegerOne("Gipsy Avenger", "Mark-6", "USA", 85.7f,
    1500.8f, 3, 10, 12, "Stun Core 08", "Incinerator turbines",
    "Sluggernaut");

    JaegerOne jaegerTwo = new JaegerOne("Obsidian Fury", "Mark-5", "Australia", 87.5f,
    2100.4f, 4, 8, 14, "Arc-9 reactor", "Dual Plasma Chainsaws",
    "Palm grip backlasht");

    jaegerOne.drift();
    jaegerOne.move();
    System.out.println(jaegerOne.scanKaiju());
    jaegerOne.useNuclearReactor();
    jaegerOne.useCryogenicGun();

    jaegerTwo.drift();
    jaegerTwo.move();
    System.out.println(jaegerTwo.scanKaiju());
    jaegerTwo.useNuclearReactor();
    jaegerTwo.useCryogenicGun();

    System.out.println("modelName: " + jaegerOne.getModelName());
    System.out.println("mark: " + jaegerOne.getMark());
    System.out.println("origin: " + jaegerOne.getOrigin());
    System.out.println("height: " + jaegerOne.getHeight());
    System.out.println("weight: " + jaegerOne.getWeight());
    System.out.println("speed: " + jaegerOne.getSpeed());
    System.out.println("strength: " + jaegerOne.getStrength());
    System.out.println("armor: " + jaegerOne.getArmor());
    System.out.println("energyCore: " + jaegerOne.getEnergyCore());
    System.out.println("weapon: " + jaegerOne.getWeapon());
    System.out.println("powerMove: " + jaegerOne.getPowerMove());

    System.out.println("modelName: " + jaegerTwo.getModelName());
    System.out.println("mark: " + jaegerTwo.getMark());
    System.out.println("origin: " + jaegerTwo.getOrigin());
    System.out.println("height: " + jaegerTwo.getHeight());
    System.out.println("weight: " + jaegerTwo.getWeight());
    System.out.println("speed: " + jaegerTwo.getSpeed());
    System.out.println("strength: " + jaegerTwo.getStrength());
    System.out.println("armor: " + jaegerTwo.getArmor());
    System.out.println("energyCore: " + jaegerTwo.getEnergyCore());
    System.out.println("weapon: " + jaegerTwo.getWeapon());
    System.out.println("powerMove: " + jaegerTwo.getPowerMove());
    }
}