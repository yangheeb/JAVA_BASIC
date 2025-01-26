package static1.ex;

public class MathArrayUtilsMain {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};

        System.out.println("합계: " + MathArrayUtils.sum(values));
        System.out.println("평균: " + MathArrayUtils.average(values));
        System.out.println("최소값: " + MathArrayUtils.min(values));
        System.out.println("최대값: " + MathArrayUtils.max(values));
    }
}
