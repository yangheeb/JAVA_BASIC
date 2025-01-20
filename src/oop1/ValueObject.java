package oop1;

public class ValueObject {

    int value;

    void add() {
        value++;
        System.out.println("숫자 증가 value=" + value);
    }
}


// 클래스 내부에 속성(데이터)과 기능(메서드)를 함께 포함
// 즉 멤버 변수 뿐만 아니라 메서드도 함께 포함할 수 있다는 말임 ~
