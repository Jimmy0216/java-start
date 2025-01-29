package scope;

public class Scope3_1 {
    public static void main(String[] args) {
        int m = 10;
        int temp = 0; // 굳이 전역변수일 필요가 없음 if문에서만 필요하기때문에 -> 비효율적메모리, 코드 복잡성 증가
        if (m > 0){
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}
