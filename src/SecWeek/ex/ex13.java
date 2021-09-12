package SecWeek.ex;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("점수를 입력하세요 (0~100): ");
        int score = scanner.nextInt(); // 다음 토큰을 int 타입으로 리턴 (점수 읽기)

        System.out.print("학년을 입력하세요(1~4): ");
        int year = scanner.nextInt();

        if(score >= 60) {
            if (year != 4)
                System.out.println("합격!"); // 점수가 60점 이상이고 4학년이 아닐 때
            else if (score >= 70)
                System.out.println("합격!"); // 점수가 70점 이상일 때
            else
                System.out.println("불합격!"); // 점수가 70점 미만일 때
        }
        else
            System.out.println("불합격!"); // 점수가 60점 미만일 때
    }
}
