package SecWeek.prac;

import java.util.Scanner;

public class prac2 {
    public static void main(String[] args){
        System.out.print("2자리수 정수 입력(10~99)>>");
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int ten, one;
        ten = num / 10;
        one = num % 10;
        if( ten == one )
            System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
        else
            System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");
    }
}
