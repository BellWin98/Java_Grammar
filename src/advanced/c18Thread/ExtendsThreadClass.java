package advanced.c18Thread;

// Thread 클래스에 이미 구현되어 있는 run 메서드는 아무 작업도 하지 않는 빈 메서드
// 작업하고 싶은 내용을 run()메서드를 overriding 하여 정의할 수 있다.
// 상속 관계이다보니, 다른 클래스를 상속할 수 없는 단점이 있으므로, Runnable로 대체한다.
public class ExtendsThreadClass extends Thread{

    // run()은 스레드가 시작되면 실행된다.
    @Override
    public void run() {
        System.out.println("ExtendsThreadClass: " + Thread.currentThread().getName());
    }

}
