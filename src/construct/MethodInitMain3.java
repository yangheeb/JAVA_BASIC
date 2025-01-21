package construct;

public class MethodInitMain3 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.initMember("user1", 15, 90);

        MemberInit member2 = new MemberInit();
        member2.initMember("user2", 16, 80);

        MemberInit[] members = {member1, member2};
        for (MemberInit s : members) {
            System.out.println("이름:" + s.name + "나이:" + s.age + "성적" + s.grade);
        }
    }
}

// initMember 메서드를 호출하면 객체의 멤버 변수에 인자로 넘어온 값을 채움
