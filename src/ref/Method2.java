package ref;

public class Method2 {
    public static void main(String[] args) {
        Student student1 = createStudent("학생1", 15, 90);
        printStudent(student1);

        Student student2 = createStudent("학생2", 16, 80);
        printStudent(student2);

    }

    static Student createStudent(String name, int age, int grade) {
        Student student = new Student(); // 객체 생성을 여기서 한 번에 함 ~
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student; //x001 Student 타입을 반환 ~
    } // Method1에서 initStudent 대신 사용 

    static void printStudent(Student student) {
        System.out.println("이름: " + student.name + " 나이: " + student.age + " 성적: " + student.grade);
    }
}
