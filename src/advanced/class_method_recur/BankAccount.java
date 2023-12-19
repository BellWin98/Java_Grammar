package advanced.class_method_recur;
class BankAccount {
    private String accountNumber; // 계좌번호
    private int balance = 0; // 잔고

    // 별도의 생성자를 만들지 않으면 매개변수 없는 기본 생성자가 숨겨져 있다.
    // 생성자란, 객체가 생성될 때 자동으로 호출되는 메서드
    // 생성자 형태: 클래스명() {}
    // 생성자 사용 목적: 객체의 생성과 동시에 인스턴스 변수를 원하는 값으로 초기화를 하기 위함

    BankAccount(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public void deposit(int money){
        if (money == 0){
            System.out.println("예금할 금액이 없습니다.");
        } else {
            balance += money;
            System.out.println("현재 잔액: " + balance + "원");
        }
    }

    public void withdraw(int money){
        if (balance >= money){
            balance -= money;
            System.out.println("잔액은 " + balance + "원 입니다.");
        } else {
            System.out.println("잔액이 부족합니다.");
        }
    }

    public int getBalance(){
        return balance;
    }

    public String getAccountNumber(){
        return accountNumber;
    }
}

class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("3333-05-9466051");
        System.out.println("계좌번호: " + bankAccount.getAccountNumber());
        bankAccount.deposit(10000);
        bankAccount.withdraw(0);
        System.out.println("현재잔액: " + bankAccount.getBalance());
    }
}
