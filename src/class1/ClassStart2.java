package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        String[] studentNames = {"학생1", "학생2"};
        int[] studentAges = {15, 16};
        int[] studentGrades = {90, 80};

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("이름:" + studentNames[i] + " 나이:" + studentAges[i] + " 성적:" + studentGrades[i]);
        }
    }
}

// 특정 학생 데이터를 변경할 때 실수할 가능성이 높음
// 배열의 인덱스 순서를 항상 정확하게 맞추어야 함

// 학생이라는 개념을 하나로 묶어서 본인의 이름, 나이, 성적을 관리하도록