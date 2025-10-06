package cond;

public class Switch4 {
    static void main(String[] args) {
        int grade = 2;

        //새로운 switch 문 (java 14)
        int coupon = switch (grade){
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };
        System.out.println("발급받은 쿠폰 " + coupon);
    }
}
