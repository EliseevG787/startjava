public class JaegerOne {

    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int speed;
    private int strength;
    private int armor;
    private String energyCore;
    private String weapon;
    private String powerMove;

    public JaegerOne(String modelName, String mark, String origin, float height, float weight,
    int speed, int strength, int armor, String energyCore, String weapon, String powerMove) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.strength = strength;
        this.armor = armor;
        this.energyCore = energyCore;
        this.weapon = weapon;
        this.powerMove = powerMove;
    }

    public String getModelName() {
        return modelName;
    }

    public String getMark() {
        return mark;
    }

    public String getOrigin() {
        return origin;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    public int getSpeed() {
        return speed;
    }

    public int getStrength() {
        return strength;
    }

    public int getArmor() {
        return armor;
    }

    public String getEnergyCore() {
        return energyCore;
    }

    public String getWeapon() {
        return weapon;
    }

    public String getPowerMove() {
        return powerMove;
    }

    public void drift() {
        System.out.println("You entered the drift");
    }

    public void move() {
        System.out.println("You walked 5 steps");
    }

    public String scanKaiju() {
        return "Looking for kaiju";
    }

    public void useNuclearReactor() {
        System.out.println("Powered by a nuclear reactor");
    }

    public void useCryogenicGun() {
        System.out.println("Shoots from a cryogenic gun");
    }
}