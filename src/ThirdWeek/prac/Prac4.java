package ThirdWeek.prac;

import java.util.Scanner;

public class Prac4 {
    public static void main(String[] args) {
        System.out.print("소무자 알파벳 하나를 입력하시오>>");
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();
        char c = s.charAt(0);

        for(int i = 0; i <= (c-'a'); i++){
            for(char a = 'a'; a <= (c - i); a++)
                System.out.print(a);
            System.out.println();
        }
        scanner.close();
    }
}
