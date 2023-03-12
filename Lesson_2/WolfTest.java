public class WolfTest {

    public static void main(String[] args) {
        Wolf grayWolf = new Wolf();
        grayWolf.sex = "man";
        System.out.println("Пол: " + grayWolf.sex);
        grayWolf.name = "Серый";
        System.out.println("Кличка: " + grayWolf.name);
        grayWolf.weight = 40.4f;
        System.out.println("Вес: " + grayWolf.weight);
        grayWolf.age = 3;
        System.out.println("Возраст: " + grayWolf.age);
        grayWolf.color = "Gray";
        System.out.println("Цвет: " + grayWolf.color);
        grayWolf.walk();
        grayWolf.sit();
        grayWolf.run();
        grayWolf.howl();
        grayWolf.hunt();
    }
}