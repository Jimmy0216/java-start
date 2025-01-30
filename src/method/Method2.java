package method;

public class Method2 {

    public static void main(String[] args) {
        printHeader();
        System.out.println("= 프로그램을 동작하겠습니다.");
        printFooter();
    }

    public static void printHeader(){
        System.out.println("= 프로그램을 시작하겠습니다.");
        return;
    }

    public static void printFooter(){
        System.out.println("= 프로그램을 종료하겠습니다.");
        //return; 반환할 것이 없으면 생략해도 됨
    }
}
