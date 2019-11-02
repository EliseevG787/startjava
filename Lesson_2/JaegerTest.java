//для инициализации полей объектов при их создании используются сеттеры

public class JaegerTest {

    public static void main(String[] args) {

    Jaeger jaegerOne = new Jaeger();
    Jaeger jaegerTwo = new Jaeger();

    jaegerOne.setModelName("Gipsy Avenger");
    jaegerOne.setMark("Mark-6");
    jaegerOne.setOrigin("USA");
    jaegerOne.setHeight(85.7f);
    jaegerOne.setWeight(1500.8f);
    jaegerOne.setSpeed(3);
    jaegerOne.setStrength(10);
    jaegerOne.setArmor(12);
    jaegerOne.setEnergyCore("Stun Core 08");
    jaegerOne.setWeapon("Incinerator turbines");
    jaegerOne.setPowerMove("Sluggernaut");

    jaegerTwo.setModelName("Obsidian Fury");
    jaegerTwo.setMark("Mark-5");
    jaegerTwo.setOrigin("Australia");
    jaegerTwo.setHeight(87.5f);
    jaegerTwo.setWeight(2100.4f);
    jaegerTwo.setSpeed(4);
    jaegerTwo.setStrength(8);
    jaegerTwo.setArmor(14);
    jaegerTwo.setEnergyCore("Arc-9 reactor");
    jaegerTwo.setWeapon("Dual Plasma Chainsaws");
    jaegerTwo.setPowerMove("Palm grip backlasht");


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

    jaegerOne.setModelName("Brawler Yukon");
    jaegerOne.setMark("Mark-4");
    jaegerOne.setOrigin("Japan");
    jaegerOne.setHeight(94.5f);
    jaegerOne.setWeight(3680.7f);
    jaegerOne.setSpeed(8);
    jaegerOne.setStrength(7);
    jaegerOne.setArmor(16);
    jaegerOne.setEnergyCore("Iso-thor reaction chamber");
    jaegerOne.setWeapon("Ballistic mortar cannons");
    jaegerOne.setPowerMove("Supercritical throwdown");

    jaegerTwo.setModelName("Striker Eureka");
    jaegerTwo.setMark("Mark-3");
    jaegerTwo.setOrigin("Russia");
    jaegerTwo.setHeight(94.6f);
    jaegerTwo.setWeight(3690.5f);
    jaegerTwo.setSpeed(9);
    jaegerTwo.setStrength(3);
    jaegerTwo.setArmor(19);
    jaegerTwo.setEnergyCore("XIG Supercell Chambe");
    jaegerTwo.setWeapon("Assault Mount 3.25");
    jaegerTwo.setPowerMove("Six Shooter");


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