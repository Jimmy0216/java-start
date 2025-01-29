package loop.ex;

public class ForEx2 {
    public static void main(String[] args) {
        int num = 2;
        for (int count = 1; count <= 10; count++){
//        for (int num = 2, count = 1; count <= 10; num += 2, count++){ 이것도 가능하지만 현재 사용되는 코드가 더 좋음
            System.out.println(num);
            num += 2;
        }
    }
}
