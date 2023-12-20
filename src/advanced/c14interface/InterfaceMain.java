package advanced.c14interface;

public class InterfaceMain {
    public static void main(String[] args) {
        AnimalInterface1 cat = new CatImplements();
        AnimalInterface1 dog = new DogImplements();
        cat.makeSound();
        dog.makeSound();

        // 다형성이란 하나의 객체가 여러 개의 참조 변수 타입을 가질 수 있음을 의미

        AnimalInterface1 myMultiCat = new CatMultiImplements();
        // 타입을 interface1로 선언하면 interface2에 정의된 메서드는 사용 불가
        // System.out.println(myMultiCat.play("코리안숏헤어", "브리티시"));

        AnimalInterface2 myMultiDog = new DogMultiImplements();
        // 타입을 interface2로 선언하면 interface1에 정의된 메서드는 사용 불가
        // System.out.println(myMultiDog.makeSound());
        System.out.println(myMultiDog.play("시바견", "진돗개"));

        // 기본적으로 추상 클래스, 인터페이스는 객체 생성이 불가능하나, 익명 내부 클래스 방식으로 사용 가능
        AnimalInterface1 a1 = new AnimalInterface1() {
            @Override
            public void makeSound() {

            }
        };
    }
}
