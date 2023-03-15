public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        jaegerOne.setModelName("Crimson Typhoon");
        jaegerOne.setMark("Mark-4");
        jaegerOne.setOrigin("China");
        jaegerOne.setHeight(250f);
        jaegerOne.setWeight(1.722f);
        jaegerOne.setSpeed(9);
        jaegerOne.setStrength(8);
        jaegerOne.setArmor(6);
        jaegerOne.showInfo();

        Jaeger jaegerTwo = new Jaeger("Gipsy Danger", "Mark-3", "USA", 260f, 1.98f, 7, 8, 6);
        jaegerTwo.showInfo();
        jaegerOne.move("forward");
        jaegerOne.move("back");
        jaegerOne.drift("on");
        jaegerOne.showInfo();
        jaegerTwo.useVortexCannon("on");
        jaegerTwo.showInfo();
    }
}