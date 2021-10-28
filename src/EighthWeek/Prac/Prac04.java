package EighthWeek.Prac;

import java.util.*;

public class Prac04 {
    public static void main(String[] args) {
        Vector<Integer> stack = new Vector<Integer>();

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("강수량 입력 (0 입력시 종료) >> ");

            int num = scanner.nextInt();

            if(num == 0)
                break;

            stack.add(num);

            int average =0;

            for(int i=0; i<stack.size(); i++) {
                System.out.print(stack.get(i)+" ");
                average += stack.get(i);
            }

            average /= stack.size();
            System.out.println("\n현재 평균 "+average);
        }

        scanner.close();
    }
}
