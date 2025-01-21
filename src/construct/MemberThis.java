package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        nameField = nameParameter;
    }
}

// this는 생략 가능함
// nameField는 지역변수(매개변수)에서 같은 이름 존재x. -> 멤버 변수에 존재하기에 자동으로 this 들어가는데 이건 생략가능
