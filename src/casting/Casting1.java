package casting;
// 형변환하기 int < long < double 크기범위 순위
// 작은범위 -> 큰범위 (자동 형변환)
public class Casting1 {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        //원래 (long)을 해줘야함
        longValue = (long) intValue; // int -> long
        System.out.println("longValue = " + longValue);

        //하지만 추가하지 않아도 자바에서 자동으로 변형해줌
        doubleValue = intValue; // int -> double
        System.out.println("doubleValue = " + doubleValue);

        doubleValue = 20L; // long -> double
        System.out.println("doubleValue2 = " + doubleValue);
    }
}
