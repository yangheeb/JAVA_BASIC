package scanner;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번째 숫자와 두 번째 숫자 모두 0이면 종료함 ~ ");
        while (true) {
            System.out.print("첫 번째 숫자 입력하쇼 : ");
            int num1 = scanner.nextInt();

            System.out.print("두 번째 숫자 입력하쇼 : ");
            int num2 = scanner.nextInt();

            if (num1 == 0 && num2 == 0) {
                System.out.println("두 수가 0이니 종료해야 할 시간 ~");
                break;
            }
            System.out.println("두 수의 합은 : " + (num1 + num2));
        }
    }
}
