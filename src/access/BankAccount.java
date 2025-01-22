package access;

public class BankAccount {
    private int balance;

    // 생성자
    public BankAccount() {
        balance = 0;
    }

    // public 메서드 : deposit
    public void deposit(int amount) {
        if (isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
        }
    }

    // public 메서드 : withdraw
    public void withdraw(int amount) {
        if (isAmountValid(amount) && balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다");
        }
    }

    // public 메서드 : getBalance
    public int getBalance() {
        return balance;
    }

    // private 메서드 : isAmountValid
    private boolean isAmountValid(int amount) {
        return amount > 0;
    }


}

// 검증 메서드가 true일 경우에 if문 기능이 돌아감
