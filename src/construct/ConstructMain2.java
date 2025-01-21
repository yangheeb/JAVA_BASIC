package construct;

public class ConstructMain2 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1", 15); // grade 50 자동 반영
        MemberConstruct member2 = new MemberConstruct("user2", 16, 80);

        MemberConstruct[] members = {member1, member2};
        for (MemberConstruct s : members) {
            System.out.println("이름:" + s.name + ", 나이:" + s.age + ", 성적:" + s.grade);
        }
    }
}

// 객체를 생성하고 동시에 생성자 호출까지 해줘야 함 -> 구현?클래스에서 생성자를 이용해 이미 만들어줘서?
