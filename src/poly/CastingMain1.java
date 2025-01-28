package poly;

public class CastingMain1 {
    public static void main(String[] args) {

        // 부모 변수가 자식 인스턴스 참조 [다형적 참조]
        Parent poly = new Child();
        poly.parentMethod();
        // poly.childMethod(); // 컴파일 에러. 부모 타입으로 선언된 변수는 자식 클래스의 메소드를 호출할 수 없다.

        // 다운캐스팅 (부모 타입 -> 자식 타입)
        Child child = (Child)poly;
        child.childMethod();
    }
}

// 상속 관계는 부모로만 업캐스팅이 가능하다.
// 다운캐스팅은 명시적으로 형변환을 해야 한다.
