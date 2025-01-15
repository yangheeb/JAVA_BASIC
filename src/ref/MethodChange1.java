package ref;

public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전 : a = " + a);
        changePrimitive(a);
        System.out.println("메서드 호출 후 : a = " + a); // a는 그대로 10임. 변수의 값을 복사만 한 것임 ~
    }

    static void changePrimitive(int x) {
        x = 20; // x의 값만 바뀌는 것
    }
}

// int a의 값을 바꾸고 싶을 때 ?