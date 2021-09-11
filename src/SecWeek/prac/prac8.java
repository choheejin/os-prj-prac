package SecWeek.prac;

import java.util.Scanner;

public class prac8 {
    public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2){
        if((x>=rectx1 && x <= rectx2) && (y >= recty1 && y<=recty2))
            return true;
        else return false;
    }

    public static void main(String[] args) {
        System.out.print("점 (x1, y1)의 좌표를 입력하시오>>");
        Scanner scanner = new Scanner(System.in);
        int num_X1 = scanner.nextInt();
        int num_Y1 = scanner.nextInt();
        System.out.print("점 (x2, y2)의 좌표를 입력하시오>>");

        int num_X2 = scanner.nextInt();
        int num_Y2 = scanner.nextInt();

        boolean ans1 = inRect(num_X1,num_Y1,100,100,200,200);
        boolean ans2 = inRect(num_X2,num_Y2,100,100,200,200);

        if(ans1 || ans2)
            System.out.println("(100, 100), (200, 200)의 두점으로 이루어진 직사각형과 충돌합니다.");
        else
            System.out.println("(100, 100), (200, 200)의 두점으로 이루어진 직사각형과 충돌하지 않습니다.");
    }
}
