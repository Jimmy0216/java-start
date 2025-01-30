package method;

public class Overloading3 {

    public static void main(String[] args) {
        System.out.println("1: " + add(1, 2));
        System.out.println("2: " + add(1.2, 1.2));
    }

    //이것이 없어도 add메소드 실행을 하면 자동 형변환이 되면서 값이 리턴됨
    public static int add(int a, int b){
        System.out.println("1번 호출");
        return a + b;
    }

    public static double add(double a, double b){
        System.out.println("2번 호출");
        return a + b;

    }
}
