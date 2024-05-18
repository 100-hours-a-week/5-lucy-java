package com.hello;
//패키지가 없으면 디자인 패턴, 유지 보수성이 떨어지게 되니 생성해주기

// 자동 import
import com.bye.Cat;

public class Main {
    // 메인 클래스를 시작했을 때 static이 붙어 있으면 즉시 실행 => 시작점이 된다.
    public static void main(String[] args){
        Dog dog1 = new Dog("Waldo");
        Dog dog2 = new Dog(1);
        // 사용 예시 : 유저를 무한히 생성할 수 있음

        dog1.bark();
        dog2.run();

        // 외부 패키지의 클래스 가져오기 가능
        Cat cat = new Cat();
        cat.meow();
    }
}


