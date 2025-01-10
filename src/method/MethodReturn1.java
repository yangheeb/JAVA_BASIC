package method;

public class MethodReturn1 {
    public static void main(String[] args) {
        boolean result = odd(2);
        System.out.println(result);
    }

    public static boolean odd(int i) {
        if (i % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }
}


// 조건문 if를 사용할 때 -> 메서드가 조건을 만족하지 않을 경우가 있기에 else를 꼭 사용할 것