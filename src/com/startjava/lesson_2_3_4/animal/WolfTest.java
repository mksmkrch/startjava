package com.startjava.lesson_2_3_4.animal;

public class WolfTest {

    public static void main(String[] args) {
        Wolf grayWolf = new Wolf();
        grayWolf.setSex("man");
        System.out.println("Пол: " + grayWolf.getSex());
        grayWolf.setName("Серый");
        System.out.println("Кличка: " + grayWolf.getName());
        grayWolf.setWeight(40.4f);
        System.out.println("Вес: " + grayWolf.getWeight());
        grayWolf.setAge(9);
        System.out.println("Возраст: " + grayWolf.getAge());
        grayWolf.setColor("Gray");
        System.out.println("Цвет: " + grayWolf.getColor());
        grayWolf.walk();
        grayWolf.sit();
        grayWolf.run();
        grayWolf.howl();
        grayWolf.hunt();
    }
}