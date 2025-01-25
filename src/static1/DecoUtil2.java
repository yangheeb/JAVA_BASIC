package static1;

public class DecoUtil2 {
    public static String decorate(String str) {
        String result = "*" + str + "*";
        return result;
    }
}

// public String decorate(String str) -> public static String decorate(String str)
// static 메서드로 변경 => 정적 메서드 생성 완료
// 정적 변수처럼 정적 메서드도 객체를 생성하지 않고도 사용할 수 있다.
// 클래스명을 이용하여 바로 호출할 수 있다. (DecoUtil2.decorate("Hello Java");)