package scope;
// 전역변수, 지역변수
public class Scope1 {

    public static void main(String[] args) {
        int m = 10; //m 생존 시작
        if(true){
            int x = 10; //x 생존 시작
            System.out.println("if m = " + m);
            System.out.println("if x = " + x);
        } // x 생존 종료
//        System.out.println("main x = " + x);
        System.out.println("main m = " + m);
    }//m 생존 종료
}
