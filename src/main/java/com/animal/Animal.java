package com.animal;

public class Animal {
    // 속성 정의
    public String name;
    public int age;
    public double height;
    public double weight;
    public String gender;

    // 속성 생성자
    public Animal(String name){
        this.name = name;
    }
    public Animal(String name, int age, double height, double weight, String gender) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
    }

    // 기능
    public void sound (){
        System.out.println(this.name + ": 동물은 소리를 냅니다");
    }

    // 오버로딩
    public void introduce(String name, int age, double weight, double height, String gender){
        // this.name(생성자의 매개변수)과 name(메소드의 매개변수)은 다르다는걸 알고 있기
        System.out.println("저는 " + name + "입니다" );
        System.out.println("저는 " + age + "살 입니다" );
        System.out.println("저는 " + weight + "kg 입니다" );
        System.out.println("저는 " + height + "cm 입니다" );
        System.out.println("저는 " + gender + "에요" );
    }

    public void introduce(String name){
        System.out.println("저는 " + name + "입니다" );
        System.out.println("추가 입력이 필요해요!");
    }

    public void introduce(){
        System.out.println("누구세요");
    }
}
