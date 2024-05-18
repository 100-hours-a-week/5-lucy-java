package com.animal;

public class Puppy extends Dog {
    public Puppy(String name, int age, double weight, double height, String gender) {
        super(name, age, weight, height, gender);
    }

    public void sound(){
        System.out.println(super.name + "아기라서 왕왕");
    }

    public void smell(){
        System.out.println(super.name + "특: 아기라서 엄청 잘 맡진 않음");
    }
}
