package casting;

public class Casting3 {

    public static void main(String[] args) {
        long maxIntValue = 2147483647; //int 최고값
        long maxIntOver = 2147483648L;  //int 최고값
        int intValue = 0;

        intValue = (int) maxIntValue; //형변환
        System.out.println("maxIntValue casting = " + intValue);

        intValue = (int) maxIntOver; // 2147483648L
        System.out.println("maxIntOver casting = " + intValue);
    }
}
