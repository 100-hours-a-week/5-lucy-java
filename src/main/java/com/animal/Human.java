package com.animal;

public class Human extends Animal{
    public Human(String name, int age, double weight, double height, String gender) {
        super(name, age, height, weight, gender);
    }

    @Override
    public void sound() {
        System.out.println(super.name + ": 저는 사람이라 안녕하세요 합니다.");
    }
}
