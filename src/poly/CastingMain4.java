package poly;

// 다운캐스팅을 자동적으로 하지 않는 이유
public class CastingMain4 {
    public static void main(String[] args) {

        Parent parent1 = new Child(); // 다형적 참조
        Child child1 = (Child)parent1; // 다운캐스팅
        child1.childMethod(); // 메모리에 존재하니까 문제 없음

        Parent parent2 = new Parent(); // 부모 인스턴스 참조
        Child child2 = (Child) parent2; // 컴파일은 되지만 실행 시 런타임 오류 발생
        child2.childMethod(); // 실행 불가
    }
}
