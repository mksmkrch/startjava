public class Jaeger {

    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int speed;
    private int strength;
    private int armor;

    public Jaeger() {};

    public Jaeger(String modelName, String mark, String origin, float height, float weight,
            int speed, int strength, int armor) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.strength = strength;
        this.armor = armor;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void showInfo() {
        System.out.println("Model name: " + modelName);
        System.out.println("Mark: " + mark);
        System.out.println("Origin: " + origin);
        System.out.println("Height: " + height + " ft");
        System.out.println("Weight: " + weight + " Tons");
        System.out.println("Speed: " + speed);
        System.out.println("Strength: " + strength);
        System.out.println("Armor: " + armor);
        System.out.println();
    }

    public String scanKaiju() {
        return "scanning";
    }

    public boolean drift(String command) {
        boolean active = false;
        if (command.equals("on") && !active) {
            speed *= 2;
            strength += 5;
            armor -= 1;
            active = true;
        }
        if (command.equals("off") && active) {
            speed /= 2;
            strength -= 5;
            armor += 1;
            active = false;
        }
        System.out.println(modelName + " drift "+ command);
        return active;
    }

    public void move(String command) {
        System.out.println(modelName + " moved " + command);
    }

    public void useVortexCannon(String command) {
        if (command.equals("on")) {
            speed *= 10;
            strength *= 10;
            armor *= 10;
            System.out.println(modelName + " vortex cannon activated");
        }
        if (command.equals("off")) {
            speed /= 10;
            strength /= 10;
            armor /= 10;
            System.out.println(modelName + " vortex cannon deactivated");
        }
    }
}