package extends1.super2;

public class ClassC extends ClassB{

    public ClassC() {
        super(10, 20); // ClassB 생성자 a=10, b=20. 생성자는 하나만 호출 가능
        System.out.println("ClassC 생성자");
    }
}
