package SecWeek.ex;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("점수를 입력하시오: ");
        int score = scanner.nextInt(); // 다음 토큰을 int 타입으로 리턴

        if(score >= 80)
            System.out.println("축하합니다! 합격입니다.");

        scanner.close();
    }
}
