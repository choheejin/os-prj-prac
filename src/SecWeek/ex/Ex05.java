package SecWeek.ex;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int time = scanner.nextInt();   // 다음 토큰을 int 타입으로 리턴
        int second = time % 60;         // 초 => 60으로 나눈 나머지
        int minute = (time / 60) % 60;  // 분 => 60으로 나눈 몫을 다시 60으로 나눈 나머지
        int hour = (time / 60) / 60;    // 시간 => 60으로 나눈 몫을 다시 60으로 나눈 몫

        System.out.print(time+"초는 ");
        System.out.print(hour+"시간, ");
        System.out.print(minute+"분, ");
        System.out.print(second+"초 입니다");
    }
}
