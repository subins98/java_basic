package cond;

public class If6 {
    static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0;
        //묶어서 하나만 실행해야 한다면 if, else if 사용
        if(price >= 10000){
            discount = discount + 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        } else if  (age >= 10){
            discount = discount + 1000;
            System.out.println("어린이 1000원 할인");
        } else {
            System.out.println("할인 없음");
        }
        System.out.println("총 할인 금액: " + discount + "원");
    }
}

