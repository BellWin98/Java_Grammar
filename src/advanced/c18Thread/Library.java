package advanced.c18Thread;

public class Library {
    static int bookCount = 100;
//    public static void borrowBook(){
//    syncronized 키워드를 통해 해당 메서드(자원)에 한해서는 lock을 걸도록 설정
 public synchronized static void borrowBook(){
        if (bookCount > 0){
            // 책 빌리는 시간을 10 밀리초로 가정
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            bookCount -= 1;
            System.out.println("대출 완료");
            System.out.println("남아있는 책 수량: " + bookCount);
        } else {
            System.out.println("대출 불가");
        }
    }
}
