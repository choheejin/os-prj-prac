package FifthWeek.prac;

import java.util.Scanner;

public class Prac06_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = 0;
        Prac06_02 c[] = new Prac06_02[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("x, y, radius >> ");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            int radius = scanner.nextInt();
            c[i] = new Prac06_02(x, y, radius);
        }

        for (int i = 0; i < c.length; i++) {
            if(max < c[i].getRadius()) max = c[i].getRadius();
        }

        for (int i = 0; i < c.length; i++) {
            if (c[i].getRadius() == max) {
                System.out.print("가장 면적이 큰 원은 ");
                c[i].show();
                break;
            }
        }
        scanner.close();
    }
}
