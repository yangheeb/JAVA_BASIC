package static1;

public class Data2 {
    public String name;

    public Data2(String name, Counter counter) {
        this.name = name;
        counter.count++;
    }
}

// 바깥에서 넘어온 counter를 사용하면서 count를 증가시키는 코드
// count 멤버변수 x
