package com.animal;

public class Cat extends Animal {
    public Cat(String name, int age, double weight, double height, String gender) {
        super(name, age, height, weight, gender);
    }

    public void sound(){
        System.out.println(super.name + ": 고양이는 야용");
    }
}
