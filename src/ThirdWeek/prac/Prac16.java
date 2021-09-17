package ThirdWeek.prac;

import java.util.Scanner;

public class Prac16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");

        String computer[] = {"가위", "바위", "보"};

        while(true){
            System.out.print("가위 바위 보!>> ");
            String custom = scanner.next();

            int num = (int)Math.random()*3; // 0~1 난수 생성

            System.out.println("사용자 = "+custom+", 컴퓨터 = "+computer[num]+", ");

            if(custom.equals("가위")) {
                if (computer[num].equals("바위"))
                    System.out.println("컴퓨터가 이겼습니다.");
                else if (computer[num].equals("가위"))
                    System.out.println("비겼습니다.");
                else
                    System.out.println("사용자가 이겼습니다.");
            }
            else if (custom.equals("바위")) {
                if (computer[num].equals("보"))
                    System.out.println("컴퓨터가 이겼습니다.");
                else if (computer[num].equals("바위"))
                    System.out.println("비겼습니다.");
                else
                    System.out.println("사용자가 이겼습니다.");
            }
            else if (custom.equals("보")) {
                if (computer[num].equals("가위"))
                    System.out.println("컴퓨터가 이겼습니다.");
                else if (computer[num].equals("보"))
                    System.out.println("비겼습니다.");
                else
                    System.out.println("사용자가 이겼습니다.");
            }
            else if (custom.equals("그만")){
                System.out.println("게임을 종료합니다...");
                break;
            }
            else
                System.out.println("무슨 소린지 모르겠습니다.");
        }
        scanner.close();
    }
}
