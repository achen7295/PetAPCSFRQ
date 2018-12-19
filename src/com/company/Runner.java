package com.company;

public class Runner {
    public static void main(String[] args) {
        Cat cat = new Cat("Cat");
        Dog dog = new Dog("Dog");
        LoudDog loudDog = new LoudDog("Loud Dog");

        System.out.println(cat.speak());
        System.out.println(dog.speak());
        System.out.println(loudDog.speak());
        new Kennel(cat, dog, loudDog).allSpeak();
    }
}
