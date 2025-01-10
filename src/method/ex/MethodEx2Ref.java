package method.ex;

public class MethodEx2Ref {
    public static void main(String[] args) {
        repeat("Hello, world!", 3);
        repeat("java", 5);
        repeat("Hi", 7);
    }

    public static void repeat(String message, int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(message);
        }
    }
}
