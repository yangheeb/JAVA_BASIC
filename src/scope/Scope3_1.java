package scope;

public class Scope3_1 {
    public static void main(String[] args) {

        int m = 10;
        int temp = 0;
        if (m > 0) {
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m= " + m);
    }
}

// temp는 if 조건이 만족할 때 임시로 잠깐 사용하는 변수
// 임시 변수는 main()코드 블록에 선언될 필요 없음
// 1. 비효율적인 메모리 사용
// 2. 코드 복잡성 증가