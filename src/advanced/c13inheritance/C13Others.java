package advanced.c13inheritance;

// import java.util.* : util 하위의 모든 클래스 / 인터페이스 파일 import 가능
// import java.* : 불가능, 특정 패키지의 하위패키지의 모든 파일까지 import 하는 것은 불가능
// final 클래스는 상속 불가
// public class C13Others extends FinalClass{
//}
public class C13Others{
    public static void main(String[] args) {
        C13Dog myDog = new C13Dog();
        myDog.makeSound1();
        myDog.makeSound2();
    }
}

final class FinalClass{

}

// 추상 클래스는 객체 생성 불가
abstract class C13Animal{
//    final void makeSound(){
//        System.out.println("동물은 소리를 냅니다.");
//    }
    abstract void makeSound1();
    void makeSound2(){
        System.out.println("makeSound2");
    }
}

class C13Dog extends C13Animal{

    // final 메서드는 오버라이드 불가
    //    @Override
//    void makeSound() {
//        System.out.println("멍멍");
//    }
    @Override
    void makeSound1(){
        System.out.println("makeSound1");
    }
}
