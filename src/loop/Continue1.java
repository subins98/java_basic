package loop;

public class Continue1 {
    static void main(String[] args) {
        int i = 1;

        while (i <= 5){
            if(i == 3){
                i++;
                continue; // 조건 만족 시, 다음 코드 건너뜀
            }
            System.out.println(i);
            i++;
        }
    }
}
