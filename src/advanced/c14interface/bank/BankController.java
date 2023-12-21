package advanced.c14interface.bank;

import java.util.Scanner;

// 사용자 요청 처리 (EntryPoint)
public class BankController {
    private static BankService bankService;
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("계좌번호를 입력해주세요: ");
        String accountNumber = sc.next();
        System.out.print("초기 금액을 입력해주세요: ");
        int balance = sc.nextInt();
        BankAccount bankAccount = new BankAccount(accountNumber, balance);
        loop:
        while (true){
            System.out.println("서비스를 선택하세요. 숫자만 입력 (0: 종료, 1: 카드, 2: 카카오페이)");
            int pick = sc.nextInt();
            int service;
            switch (pick){
                case 0:
                    System.out.println("서비스가 종료됩니다.");
                    break loop;
                case 1:
                    System.out.println("카드 서비스를 선택하셨습니다.");
                    // 싱글톤 패턴 사용
                    bankService = BankCardService.getInstance(bankAccount);
                    System.out.println("현재 계좌 잔액은 " + bankAccount.getBalance() + "입니다.");
                    System.out.println("어떤 서비스를 이용하시겠습니까? (1: 예금, 2: 인출)");
                    service = sc.nextInt();
                    if (service == 1){
                        deposit();
                    } else {
                        withdraw();
                    }
                    break;
                case 2:
                    System.out.println("카카오 페이 서비스를 선택하셨습니다.");
                    bankService = BankKakaoPayService.getInstance(bankAccount);
                    System.out.println("현재 계좌 잔액은 " + bankAccount.getBalance() + "입니다.");
                    System.out.println("어떤 서비스를 이용하시겠습니까? (1: 예금, 2: 인출)");
                    service = sc.nextInt();
                    if (service == 1){
                        deposit();
                    } else {
                        withdraw();
                    }
                    break;
            }
        }
    }

    public static void deposit() {
        System.out.print("예금할 금액을 입력하세요: ");
        int money = sc.nextInt();
        bankService.deposit(money);
    }

    public static void withdraw(){
        System.out.print("인출할 금액을 입력하세요: ");
        int money = sc.nextInt();
        bankService.withdraw(money);
    }
}