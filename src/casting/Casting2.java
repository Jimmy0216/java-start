package casting;
// 큰범위 -> 작은범위 (명시적 형변환)

public class Casting2 {

    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;
        
        //intValue = doubleValue; //컴파일 오류 발생
        intValue = (int) doubleValue; //형변환 (직접 적어주는 것이 명시적 형변환)
        System.out.println("intValue = " + intValue);

        System.out.println("doubleValue = " + doubleValue);
    }
}
