import java.util.Scanner;

public class C04IfStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("비밀번호를 입력해주세요: ");
//        String userInput = sc.nextLine();
//        String password = "1234";
//        if (userInput.equals(password)){
//            System.out.println("문이 열렸습니다.");
//        } else {
//            System.out.println("비밀번호가 틀렸습니다.");
//        }
        // 삼항 연산자
//        String result = userInput.equals(password) ? "문이 열렸습니다." : "비밀번호가 틀렸습니다.";
//        System.out.println(result);

        // 묵시적 타입 변환: 각 문자가 숫자를 가지고 있다.
//        System.out.print("알파벳을 입력해주세요: ");
//        char alphabet_input = sc.nextLine().charAt(0);
//        if (alphabet_input >= 'A' && alphabet_input <= 'Z') {
//            System.out.println("대문자 입니다.");
//        } else if (alphabet_input >= 'a' && alphabet_input <= 'z'){
//            System.out.println("소문자 입니다.");
//        } else {
//            System.out.println("알파벳이 아닙니다.");
//        }

//        int busFee = 1500;
//        boolean isStolen = false;
//        System.out.print("보유한 금액을 입력해주세요: ");
//        int money = sc.nextInt();
//        System.out.println("도난카드입니까? 예 / 아니오로 대답하시오");
//        String answer = sc.next();
//        if (answer.equals("예")) {
//            isStolen = true;
//        }
//        if (isStolen == true || money < busFee ){
//            System.out.println("탑승 불가");
//        } else if (money > busFee) {
//            System.out.println("탑승 가능");
//        }

        // myMoney = 10000
        // 택시 - 10000, 버스 - 3000, 킥보드 - 2000, 걸어가기 - 0
//        int myMoney = sc.nextInt();
//        int taxiFee = 10000;
//        int busFee = 3000;
//        int kickBoardFee = 2000;
//
//
//        if (myMoney >= taxiFee){
//            System.out.println("택시 타세요");
//        } else if (myMoney >= busFee){
//            System.out.println("버스 타세요");
//        } else if (myMoney >= kickBoardFee){
//            System.out.println("킥보드 타세요");
//        } else {
//            System.out.println("걸어가세요");
//        }

        // Switch문

        System.out.print("원하시는 번호를 입력해주세요: ");
        int userInput = sc.nextInt();
        switch (userInput){
            case 0:
                System.out.println("상담사 연결입니다.");
                break;
            case 1:
                System.out.println("대출 서비스 입니다.");
                break;
            case 2:
                System.out.println("예금 서비스 입니다.");
                break;
            case 3:
                System.out.println("적금 서비스 입니다.");
                break;
            default:
                System.out.println("잘못 누르셨습니다.");
        }
    }
}
