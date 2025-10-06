package cond;

public class CondOp2 {
    static void main(String[] args) {
        int age = 18;
        String status = (age >= 18) ? "성인" : "미성년자"; //조건이 참이면 왼쪽, 거짓이면 오른쪽 출력
        //(조건) ? 참_표현식 : 거짓_표현식
        System.out.println("age = " + age + " satus = " + status);
    }
}
