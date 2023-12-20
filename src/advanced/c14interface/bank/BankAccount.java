package advanced.c14interface.bank;

// Entity
public class BankAccount {
    private final String accountNumber; // 계좌번호
    private int balance; // 잔고

    BankAccount(String accountNumber, int balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void increaseBalance(int balance) {
        this.balance += balance;
    }

    public void decreaseBalance(int balance) {
        this.balance -= balance;
    }
}
