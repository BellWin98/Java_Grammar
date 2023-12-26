package advanced.c17ExceptionFileParsing;

import java.util.Scanner;

public class C17Exception {
    public static void main(String[] args) {
        // ArithmeticException: 0으로 나눌 때 발생
//        System.out.println("나눗셈 프로그램 입니다. 숫자 10에 나눌 부모값을 입력해주세요.");
//        int num = 10;
//        Scanner sc = new Scanner(System.in);
//        // 예외가 발생할 것으로 예상되는 코드에 try /catch로 감싸줌
//        try {
//            int input = sc.nextInt();
//            System.out.println("10에 " + input + "을 나누면 ");
//            System.out.println(num / input + "입니다.");
//            // catch에는 try 구문 안에서 발생 가능한 예외를 적어야 정상적으로 catch 됨
//        } catch (IllegalArgumentException e){
//            System.out.println("정상적이지 않은 입력값입니다.");
//        } catch (ArithmeticException e){ // try 구문 안에서 발생 가능한 예외 사항을 적어야 정상적으로 캐치가 됨
//            System.out.println("0으로 나눌 수 없습니다.");
//            // e안에 예외 관련된 정보들이 들어있음
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        } catch (Exception e){
//            System.out.println("알수없는 예외가 발생하였습니다."); // 모든 예외의 조상 클래스
//            e.printStackTrace();
//        }
//
//        finally {
//            // 반드시 실행되어야 하는 구문 삽입
//        }
//        System.out.println("감사합니다.");

        // throw와 throws 예제
        String password = "1234";
        try {
            login(password);
        } catch (IllegalArgumentException e){
            // e.getMessage()는 login 메서드에서 throw new 하면서 넘어온 메시지임
            System.out.println(e.getMessage());
        }

    }

    // unchecked exception에서 throws를 적지 않더라도 예외는 호출한 곳으로 전파
    // 단, SQLException 같은 checked Exception은 해주어야 함
    // throws 하는 이유는 명시적으로 예외가 발생할 수 있음을 알리는 것일 뿐임
    // checked exception(Third party와 통신할 때 발생)은 예외처리가 강제되고, 해당 메서드에서 예외처리를 하든 안하든 throws를 통해 호출한 곳에 위임
    // 이 때 호출한 쪽에서는 예외처리가 강제됨
    // 컨트롤러(main 함수 / 사용자와의 최접점)에서 예외처리를 받아주는 것이 좋음. 서비스 단에서 throw 넘겨주기
    // 사용자한테 적절한 상태코드, 화면을 보여줄 수 있기 때문
    // 스프링에서는 try - catch를 대신 해주는 기능이 있다. 적재적소에 Throw만 잘해주면 됨
    static void login(String password) throws IllegalArgumentException{
        if (password.length() < 10){
            throw new IllegalArgumentException("비밀번호가 너무 짧습니다.");
        }
    }
}
