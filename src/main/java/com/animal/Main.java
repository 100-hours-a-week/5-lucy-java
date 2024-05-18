package com.animal;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("동물종류");
        Dog dog = new Dog("멍멍이", 2, 2.0, 10.0, "남자");
        Cat cat = new Cat("야옹이", 3, 4.0, 20.0, "여자");
        Human human = new Human("닝겐", 25, 80.0, 180.0, "남자");
        Puppy puppy = new Puppy("퍼피", 0, 1.0, 5.0, "여자");

        System.out.println();
        animal.sound();
        animal.introduce("동물종류");

        dog.sound();
        dog.introduce();
        dog.introduce("멍멍이", 2, 2.0, 10.0, "남자");
        dog.smell();

        puppy.sound();
        puppy.smell();
        puppy.introduce();
        puppy.introduce("퍼피");
        puppy.introduce("퍼피", 0, 1.0, 5.0, "여자");


        cat.sound();
        cat.introduce("야옹이", 3, 4.0, 20.0, "여자");

        human.sound();
        human.introduce("닝겐");
    }
}
