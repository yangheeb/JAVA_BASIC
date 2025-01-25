package static1;

public class DecoMain1 {
    public static void main(String[] args) {
        String s = "Hello Java";
        DecoUtil1 utils = new DecoUtil1();
        String result = utils.decorate(s);

        System.out.println("before: "+s);
        System.out.println("after: "+result);
    }
}

// 객체를 굳이 생성했어야 했을까..!?
// 객체를 생성하지 않고도 사용할 수 있는 메서드는 static 메서드로 만들어주는 것이 좋다.
// static 메서드는 객체를 생성하지 않고도 사용할 수 있기 때문에 메모리를 절약할 수 있다.

// 정적 메서드 만들기 : 메서드 선언부에 static 키워드를 붙여준다.