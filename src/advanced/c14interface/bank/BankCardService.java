package advanced.c14interface.bank;
public class BankCardService implements BankService{
    private static BankAccount bankAccount;

    private BankCardService(){}

    private static class BankCardServiceInstanceHolder{
        private static final BankCardService BANK_CARD_SERVICE = new BankCardService();
    }

    public static BankCardService getInstance(BankAccount bankAccount){
        BankCardService.bankAccount = bankAccount;
        return BankCardServiceInstanceHolder.BANK_CARD_SERVICE;
    }

    @Override
    public void deposit(int money){
        if (money == 0){
            System.out.println("예금할 금액이 없습니다.");
        } else {
            bankAccount.increaseBalance(money);
            System.out.println("카드 방식으로 " + money + "원을 예금하였습니다.");
            System.out.println("현재 계좌 잔액: " + bankAccount.getBalance() + "원");
        }
    }
    @Override
    public void withdraw(int money){
        if (bankAccount.getBalance() >= money){
            bankAccount.decreaseBalance(money);
            System.out.println("카드로 " + money + "원을 출금하였습니다.");
            System.out.println("계좌의 잔액은 " + bankAccount.getBalance() + "원 입니다.");
        } else {
            System.out.println("잔액이 부족합니다.");
        }
    }
}
