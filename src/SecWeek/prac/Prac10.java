package SecWeek.prac;

import java.util.Scanner;

public class Prac10 {
    public static void main(String[] args) {
        System.out.print("첫번째 원의 중심과 반지름 입력>>");
        Scanner scanner = new Scanner(System.in);
        int num_X1 = scanner.nextInt();
        int num_Y1 = scanner.nextInt();
        int radi1 = scanner.nextInt();

        System.out.print("두번째 원의 중심과 반지름 입력>>");
        int num_X2 = scanner.nextInt();
        int num_Y2 = scanner.nextInt();
        int radi2 = scanner.nextInt();

        double dis = Math.pow((num_X1-num_X2), 2) + Math.pow((num_Y1-num_Y2), 2);
        double result = Math.sqrt(dis);

        if(result <= (radi1 + radi2))
            System.out.println("두 원은 서로 겹친다.");
        else
            System.out.println("두 원은 서로 겹치지 않는다.");

        scanner.close();
    }
}
