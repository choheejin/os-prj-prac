package ThirdWeek.prac;

import java.util.Scanner;

public class Prac14 {
    public static void main(String[] args) {
        String course [] = { "Java", "C++", "HTML5", "컴퓨터구조", "안드로이드" };
        int score [] = {95, 88, 76, 62, 55};
        Scanner scanner = new Scanner(System.in);
        int i;

        while(true){
            System.out.print("과목 이름>> ");
            String student = scanner.next();

            if(student.equals("그만"))
                break;
            else {
                for (i = 0; i < course.length; i++) {
                    if (course[i].equals(student)) {
                        System.out.println(student + "의 점수는 " + score[i]);
                        break;
                    }
                }
                if (i >= course.length)
                    System.out.println("없는 과목 입니다.");
            }
        }
        scanner.close();
    }
}
