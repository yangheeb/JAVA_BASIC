package poly;

public class CastingMain2 {
    public static void main(String[] args) {

        // 부모 변수가 자식 인스턴스 참조 [다형적 참조]
        Parent poly = new Child();
        poly.parentMethod();
        // poly.childMethod(); // 컴파일 에러. 부모 타입으로 선언된 변수는 자식 클래스의 메소드를 호출할 수 없다.

        // 일시적 다운캐스팅 - 해당 메서드를 호출하기 위해 형변환
        ((Child)poly).childMethod();
    }
}

// 일시적 다운캐스팅
