package static1;

public class Data3 {
    public String name;
    public static int count; // static 변수로 변경

    public Data3(String name) {
        this.name = name;
        count++;
    }
}

// 바깥에서 넘어온 counter를 사용하면서 count를 증가시키는 코드
// count 멤버변수 x
