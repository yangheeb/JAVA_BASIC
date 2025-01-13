package scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        System.out.println("너가 0 입력하면 이거 종료되는거다ㅋ");

        while (true) {
            System.out.print("숫자 입력하셈 : ");
            int num = scanner.nextInt();

            if (num != 0) {
                sum += num;
            }else {
                System.out.println("0 입력 안한다고 약속했잖아..주르륵");
                break;
            }
            System.out.println("숫자들의 총합은 : "+sum);
        }
    }
}
