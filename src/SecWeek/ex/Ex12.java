package SecWeek.ex;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        char grade;
        Scanner scanner = new Scanner(System.in);

        System.out.print("점수를 입력하세요 (0~100): ");
        int score = scanner.nextInt(); // 다음 토큰을 int 타입으로 리턴 (점수 읽기)

        if(score >= 90) // 90점 이상
            grade = 'A';
        else if (score >= 80) // 90점 미만 80점 이상
            grade = 'B';
        else if (score >= 70) // 80점 미만 70점 이상
            grade = 'C';
        else if (score >= 60) // 70점 미만 60점 이상
            grade = 'D';
        else // 60점 미만
            grade = 'F';

        System.out.println("학점은 "+ grade+ "입니다.");
    }
}
