package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10; // dataA가 참조값을 가지고 Data 인스턴스 참조 -> value에 값을 할당
        System.out.println("메서드 호출 전 : dataA.value = " + dataA.value);
        changeReference(dataA);
        System.out.println("메서드 호출 후 : dataA.value = "+ dataA.value);

    }

    static void changeReference(Data dataX) {
        dataX.value = 20;
    }
}
