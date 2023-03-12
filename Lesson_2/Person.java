public class Person {

    String sex = "man";
    String name = "Max";
    float height = 1.76f;
    float weight = 70.4f;
    int age = 26;

    boolean walk() {
        return false;
    }

    boolean run() {
        return false;
    }

    boolean sit() {
        return true;
    }

    void speak() {
        System.out.println("I'm a man");
    }

    void learnJava() {
        System.out.println("I'm learning Java.");
    }
}