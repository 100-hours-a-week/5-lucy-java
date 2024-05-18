package com.animal;

public class Dog extends Animal{
    // 자식 클래스는 부모 클래스와 동일하게 생성자를 작성
    public Dog(String name, int age, double weight, double height, String gender) {
        super(name, age, height, weight, gender);
    }

    @Override
    public void sound() {
        System.out.println(super.name + ": 강아지는 멍멍");
    }

    public void smell(){
        System.out.println(super.name + "특 : 냄새 잘맡음");
    }
}
