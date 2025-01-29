package casting;
// 계산 형변환
// 같은 타입 계산은 같은 타입의 결과 - int + int = int
// 다른 타입의 계산은 큰 타입의 결과 - int + long = long
public class Casting4 {

    public static void main(String[] args) {
        int div1 = 3 / 2;
        System.out.println("div1 = " + div1);

        double div2 = 3 / 2;
        System.out.println("div2 = " + div2);

        double div3 = 3.0 / 2;
        System.out.println("div3 = " + div3);

        double div4 = (double) 3 / 2;
        System.out.println("div4 = " + div4);

        int a = 3, b = 2;
        double result = (double) a / b;
        System.out.println("result = " + result);

    }
}
