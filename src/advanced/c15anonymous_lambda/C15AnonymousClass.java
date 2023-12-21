package advanced.c15anonymous_lambda;

public class C15AnonymousClass {
    public static void main(String[] args) {
        // 클래스명이 Animal이 아닌 이름 없는 익명 클래스와 객체를 동시에 생성
        // 익명객체에 구현 메서드가 1개 밖에 없을 경우, 람다 표현식 (화살표 함수) 로 표현 가능
        // () 부분에 매개변수를 지정하여 구현체에서 활용, 변수의 개수가 많을 땐 개수에 맞춰 변수 지정
        Animal dog = (n) -> System.out.println("멍멍" + n);
        dog.makeSound(1);

        Animal cat = new Animal() {
            @Override
            public void makeSound(int n) {
                System.out.println("야옹" + n);
            }
        };
        cat.makeSound(2);
    }
}

interface Animal{
    void makeSound(int n);
}
