package loop;

public class DoWhile1 {
    static void main(String[] args) {
        int i = 10;

        //우선 실행 후 조건을 검사함
        do {
            System.out.println("현재 숫자는:" + i);
            i++;
        } while(i < 3);
    }
}
