package ref;

public class VarChange1 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA; // 인스턴스 복사 x. 참조값만 읽어서 dataB에 들어감

        System.out.println("dataA 참조값 = " + dataA);
        System.out.println("dataB 참조값 = " + dataB) ;
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

        //dataA 변경
        dataA.value = 20;
        System.out.println("변경 dataA.value = 20");
        System.out.println("dataA.value ="+dataA.value); // 같은 참조값이라 출력 결과 같음
        System.out.println("dataB.value ="+dataB.value);

        //dataB 변경
        dataB.value = 30;
        System.out.println("변경 dataB.value = 30");
        System.out.println("dataA.value ="+dataA.value);
        System.out.println("dataB.value ="+dataB.value); // 같은 참조값이라 출력 결과 같음
    }
}

// !! 자바는 항상 변수의 값을 복사해서 대입 !!
