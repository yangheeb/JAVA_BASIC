package static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A count=" + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B count=" + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count=" + Data3.count);
    }
}

// Data3.count는 static 변수이므로 Data3.count를 사용하면서 count를 증가시키는 코드
// Data3.count 공통. data1.count, data2.count, data3.count x
