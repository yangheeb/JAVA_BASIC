package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {

    public void call(){
        publicValue = 1;
        protectedValue = 1; // 상속받은 protected 멤버 접근 가능 (상속 관계 or 같은 패키지)
        // defaultValue = 1; // 상속받은 default 멤버 접근 불가능 (다른 패키지 접근 불가, 컴파일 오류)
        // privateValue = 1; // 상속받은 private 멤버 접근 불가능 (접근 불가, 컴파일 오료)

        publicMethod();
        protectedMethod(); // 상속받은 protected 메서드 접근 가능 (상속 관계 or 같은 패키지)
        // defaultMethod(); // 상속받은 default 메서드 접근 불가능 (다른 패키지 접근 불가, 컴파일 오류)
        // privateMethod(); // 상속받은 private 메서드 접근 불가능 (접근 불가, 컴파일 오류)

        printParent();
    }
}
