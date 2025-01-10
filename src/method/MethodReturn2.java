package method;

public class MethodReturn2 {
    public static void main(String[] args) {
        control(18);
    }

    public static void control(int age){
        if (age<18){
            System.out.println(age+"살, 미성년자는 출입이 통제됩니다.");
            return;
        } else {
            System.out.println(age+"살, 입장하세요.");
        }
    }
}
