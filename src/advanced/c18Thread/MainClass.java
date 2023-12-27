package advanced.c18Thread;

public class MainClass {
    public static void main(String[] args) {
//        Thread etc1 = new ExtendsThreadClass();
//        etc1.start();
//        Thread etc2 = new ExtendsThreadClass();
//        etc2.start();
//        Thread etc3 = new ExtendsThreadClass();
//        etc3.start();

        // 스레드 실행 시 순차적으로 진행되지 않음에 유의

        // Thread 생성자로 Runnable 객체를 주입하는 방식
        // Thread 클래스에 Runnable 객체가 전달되어 사용자가 직접 정의 run메서드가 실행
//        new Thread(new RunnableImplementsClass()).start();
//        new Thread(() -> System.out.println("익명 객체 스레드")).start();

        // thread의 동시성 이슈 테스트
        // 단일 스레드 일반 호출
        for (int i = 0; i < 1000; i++){
            // join을 하지 않으면, 동시성 이슈 발생
            Thread th = new Thread(()-> Library.borrowBook());
            th.start();
            // join 메서드를 통해 다른 스레드 처리 완료 전까지 새로운 스레드가 실행되지 않도록 막음
//            try {
//                th.join();
//            } catch (InterruptedException e) {
//                System.out.println(e.getMessage());
//            }
        }
        System.out.println("최종 남은 수량 " +  Library.bookCount);
    }
}
