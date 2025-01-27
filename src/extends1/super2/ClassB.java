package extends1.super2;

public class ClassB extends ClassA {

    public ClassB(int a) {
        super(); // ClassA 생성자. super()를 명시하지 않으면 자동으로 추가됨
        System.out.println("ClassB 생성자 a=" + a);
    }

    public ClassB(int a, int b){
        super(); // ClassA 생성자. super()를 명시하지 않으면 자동으로 추가됨
        System.out.println("ClassB 생성자 a=" + a + ", b=" + b);
    }
}
