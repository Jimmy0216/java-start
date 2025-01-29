package scanner;
//스캐너
import java.util.Scanner;

public class Scanner1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //스캐너를 사용하려면 써줘야함

//        System.out.println("hello\n");
//        System.out.println("world\n");

        System.out.println("문자열을 입력하세요:");
        String str = scanner.nextLine(); // 입력을 String으로 가져온다.
        System.out.println("입력한 문자열: " + str);

        System.out.println("정수를 입력하세요:");
        int intValue = scanner.nextInt();
        System.out.println("입력한 정수: " + intValue);

        System.out.println("실수를 입력하세요:");
        double doubleValue = scanner.nextInt();
        System.out.println("입력한 실수: " + doubleValue);

    }
}
