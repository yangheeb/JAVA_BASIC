package scanner;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하쇼");
        String str = scanner.nextLine();
        System.out.println("입력한 문자열: "+ str);

        System.out.print("정수를 입력하쇼");
        int intValue = scanner.nextInt();
        System.out.println("입력한 문자열: "+ intValue);

        System.out.print("실수를 입력하쇼");
        double doubleValue = scanner.nextDouble();
        System.out.println("입력한 문자열: "+ doubleValue);
    }
}
