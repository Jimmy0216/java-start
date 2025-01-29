package array;

public class Array1Ref3 {

    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50}; //배열 생성

        //int[] students = new int[]{90, 80, 70, 60, 50}; //배열 생성


        //변수 값 사용
        for (int i = 0; i < students.length; i++){ // 여기서 students.length는 지정한 수 5까지를 의미함
            System.out.println("학생" + (i + 1) + " 점수:" + students[i]);
        }
    }
}
