package oop1;

public class ValueObjectMain {
    public static void main(String[] args) {
        ValueObject valueObject = new ValueObject();
        valueObject.add();
        valueObject.add();
        valueObject.add();
        System.out.println("최종 숫자=" + valueObject.value);
    }
}

// ValueObject 인스턴스에 있는 add()메서드를 호출
// 객체는 자신의 메서드를 통해 자신의 멤버 변수에 접근할 수 있음
// 객체의 메서드 내부에서 접근하는 멤버 변수는 객체 자신의 멤버 변수