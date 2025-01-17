package ref;

public class NullMain {
    public static void main(String[] args) {
        // Data data = new Data(); -> 이거는 참조형 변수 data에 참조값이 들어간 상태임
        Data data = null; // 이 상태가 참조형 변수에서 아직 가리키는 대상이 없을 때. 가리키는 대상을 나중에 입력하고 싶을 때
        System.out.println("1. data = "+data);

        data = new Data(); // 참조값이 이제 생긴 상태
        System.out.println("2. data = "+data);

        data = null; // 더 이상 Data 인스턴스 참조하지 않게 됨
        System.out.println("3. data = "+data);
    }
}
