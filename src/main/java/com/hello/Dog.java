package com.hello;

public class Dog {
    // 속성명 정의 : 같은 패키지 내에서 가져올 수 있음
    private String name;
    private int age;
    private double weight;
    private double height;

    // 기본 생성자 : 접근제어자 + 클래스와 같은 이름
    public  Dog(String name){
        // 위의 속성과 매칭 시켜주기 위해서 this 사용
        // 해당 클래스.속성명 = 파라미터값
        this.name = name;
    }
    // 생성자는 여러 개 생성 가능
    public  Dog(int age){
        this.age = age;
    }

    public  Dog(){}

    public  Dog(String name, int age, double weight, double height){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    // 클래스에서 객체가 할 수 있는 행동(메서드) 정의 : 짖기, 뛰기
    public void bark(){
        System.out.println(this.name + "왈왈!");
    }
    public void run(){
        System.out.println("뜁니다!");
    }
}

//[MEMO]
// 처음에는 private로 모두 설정하고
// 필요한 것만 public으로 변경하는 프로세스로 진행하기
// 기능별로 패키지를 분리하는 편
// 클래스 내부에서 생성자를 써주지 않으면 기본형을 자동으로 써줌
// 생성자를 여러 개 생성해서 현실 세계를 코딩 세계로 ~
// 생성자 인식 순서는, 위에서 아래로 일치하는 순서대로
// 메소드 오버로딩 : 같은 기능인데 들어오는 매개변수에 따라서 다르게 처리하도록 함
//   => 같은 메소드 이름 + 접근제어자 + 리턴타입 (+ 매개변수의 개수가) 같을 때 오버로딩이라고 한다
//   => 매개변수를 다르게
//   => getter, setter로 지정하는 방벙
//   => cnt+enter : 자동 생성자 코드 만들어줌

// [MEMO]
// [상속]
// extends 키워드 + 부모클래스 이름 사용
// 자식 클래스에 동일한 생성자가 있어야 함
// 자식 생성자를 부모 클래스로 접근시키는 super 키워드 : super(name)
// main에서 생성자의 매개변수 -> puppy에서 super -> dog에서 매개변수로 받음
// 자식 클래스는 부모 클래스가 선언했던 (특히 생성자) 모든 걸 선언해줘야함
// 자식은 기능을 그대로 물려받아서 사용할 수 있음
// [매서드 오버라이딩] 부모 클래스에서 상속했지만 기능을 덮어씌우는 것, 세부 기능을 설정
//    => vs 오버로딩 : 기능을 확장하는 것
// anotation : @Override -> 오버라이드한 코드라는 걸 명시적으로 써주기 (선택)


