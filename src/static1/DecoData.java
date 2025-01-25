package static1;

public class DecoData {
    private int instanceValue;
    private static int staticValue; // 정적 변수(클래스 변수)

    public static void staticCall() {
        // instanceValue++; // 오류 발생
        // instanceMethod(); // 오류 발생

        staticValue++; // 정적 변수 접근. 정적 메서드에서는 정적 변수만 사용 가능
        staticMethod(); // 정적 메서드 접근. 정적 메서드에서는 정적 메서드만 사용 가능
    }

    public void instanceCall() {
        instanceValue++;
        instanceMethod();

        staticValue++; // 정적 변수 접근. 인스턴스 메서드에서는 정적 변수 사용 가능
        staticMethod(); // 정적 메서드 접근. 인스턴스 메서드에서는 정적 메서드 사용 가능
    }

    public static void staticMethod() {
        System.out.println("staticValue: " + staticValue);
    }

    public void instanceMethod() {
        System.out.println("instanceValue: " + instanceValue);
    }
}
