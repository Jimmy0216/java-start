package cond;
//새로운 스위치문(아직 잘 쓰지는 않음)
public class Switch4 {
    public static void main(String[] args) {
        int grade = 1;

        int coupon = switch (grade){
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };
        System.out.println("발급받은 쿠폰 : " + coupon);
    }
}
