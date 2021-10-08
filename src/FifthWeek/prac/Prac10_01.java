package FifthWeek.prac;

import java.util.Scanner;

public class Prac10_01 {
    public static void main(String[] args) {
        System.out.println("한영 단어 검색 프로그램 입니다.");
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("한글 단어? ");
            String word = scanner.next();

            if(word.equals("그만")) break;
            else{
                System.out.println(Prac10_02.kor2Eng(word));
            }
        }
        scanner.close();
    }
}
