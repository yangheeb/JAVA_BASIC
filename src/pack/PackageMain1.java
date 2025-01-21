package pack;

public class PackageMain1 {
    public static void main(String[] args) {
        Data data = new Data();
        pack.a.User user = new pack.a.User();
    }
}

// 같은 패키지에 있으면 경로 생략해서 객체 생성
// 다른 패키지에 있으면 패키지 전체 경로 포함해 클래스 적어줘야 함 ~

// 전체 경로를 다 적어주어야 하는 불편함 -> import를 사용해 해결