package loop;

public class DoWhile2 {

    public static void main(String[] args) {
        int i = 10;

        do {
            System.out.println("현재 숫자는: " + i);
            i++;
        } while ( i< 3);
    }
}
// do while문은 조건이 안맞아도 최소 한 번은 실행됨
