package static1;

public class DecoMain2 {
    public static void main(String[] args) {
        String s = "Hello Java";
        String result = DecoUtil2.decorate(s);

        System.out.println("before: "+s);
        System.out.println("after: "+result);
    }
}

// 인스턴스 메서드는 객체를 생성해야만 사용할 수 있지만, 정적 메서드는 객체를 생성하지 않고도 사용할 수 있다.
// DecoUtil1 utils = new DecoUtil1(); String result = utils.decorate(s); -> String result = DecoUtil2.decorate(s);