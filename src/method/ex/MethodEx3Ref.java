package method.ex;

public class MethodEx3Ref {
    public static void main(String[] args) {
        int balance = 10000;
        balance = deposit(1000, balance);
        balance = withdraw(2000, balance);
        System.out.println("최종 잔액: "+balance+"원");
    }

    public static int deposit(int depositAmount, int balance) {
        balance += depositAmount;
        System.out.println(depositAmount + "원을 입금하였습니다. 현재 잔액: " + balance);
        return balance;
    }

    public static int withdraw(int withdrawAmount, int balance) {
        if (withdrawAmount > balance) {
            System.out.println(withdrawAmount + "원을 출금하려 했으나 잔액이 부족합니다.");
        } else {
            balance -= withdrawAmount;
            System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액: " + balance);
        }
        return balance;
    }
}


// 바뀐 balance가 새로운 메서드 사용할 때도 적용될 수 있는 법 ?
// 시도 1. 메서드에서 return 값으로 balance를 넣는다. -> 실패


// 메서드 호출 후 반환값 저장
//deposit과 withdraw 메서드가 balance를 반환하도록 하고, 메서드 호출 후 반환된 값을 balance 변수에 다시 저장했습니다.
