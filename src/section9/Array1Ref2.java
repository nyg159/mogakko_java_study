package section9;

public class Array1Ref2 {
    public static void main(String[] args) {
        int[] students;         // 배열 변수 선언
        students = new int[]{90, 80, 70, 60, 50};  // 배열 생성 및 초기화


        // 변수 값 사용
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수 : " + students[i]);
        }

    }
}
