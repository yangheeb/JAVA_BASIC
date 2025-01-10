package method;

public class MethodValue3 {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("1. changeNumber 호출 전, num1:" + num1);
        num1 = changeNumber(num1);  // return으로 반환하고 나서 해당값을 main에서 새로운 변수에 할당
        System.out.println("4. changeNumber 호출 후, num1:" + num1);
    }

    public static int changeNumber(int num2) {
        num2 = num2 * 2;
        return num2;  // return으로 반환하고 나서 해당값을 main에서 새로운 변수에 할당
    }
}

// shift + F6을 하면 일치하는 변수명을 일괄적으로 수정이 가능함