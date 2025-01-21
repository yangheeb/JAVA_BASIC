package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    //추가
    void initMember(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}

// initMember 메서드는 Member에 초기값 설정 기능을 제공하는 메서드
// 멤버 변수와 메서드의 매개변수의 이름이 같으면 -> 매개변수가 우선순위를 가짐
// 멤버 변수에 접근하기 위해서는 앞에 this.라고 해주면 됨
// this.는 인스턴스 자신의 참조값을 가리킴 -> 인스턴스의 멤버 변수에 접근
