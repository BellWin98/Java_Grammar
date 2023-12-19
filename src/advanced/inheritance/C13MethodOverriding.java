package advanced.inheritance;

import java.util.List;

public class C13MethodOverriding {
    public static void main(String[] args) {

        // 상속 관계일 때, 부모 클래스 타입을 자식 클래스 객체의 타입으로 지정 가능
        // Animal 클래스에 정의된 메서드만 사용 가능하도록 제약이 발생
        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.sound();
        cat.sound();
    }
}

class Animal{
    void sound(){
        System.out.println("동물의 울음 소리");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("멍멍");
    }
}

class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("야옹");
    }
}
