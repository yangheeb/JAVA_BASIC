package poly;

// upcasting, downcasting
public class CastingMain3 {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent1 = (Parent)child; // upcasting은 생략권장
        Parent parent2 = child; // upcasting은 생략권장

        parent1.parentMethod();
        parent2.parentMethod();
    }
}
